package br.com.codigocafe.controller;

import br.com.codigocafe.model.PostModel;
import br.com.codigocafe.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/posts")
    public ResponseEntity<PostModel> cadastroPost(@RequestBody PostModel postModel) {
        PostModel novoPost = postService.cadastraPost(postModel);
        return new ResponseEntity<>(novoPost, HttpStatus.CREATED); // 201
    }

    @GetMapping("/posts/{id}")
    public ResponseEntity<PostModel> buscarPorId(@PathVariable Long id) {
        return postService.buscarPorId(id)
                .map(post -> new ResponseEntity<>(post, HttpStatus.OK)) // 200
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));     // 404
    }

    @GetMapping("/posts")
    public ResponseEntity<List<PostModel>> buscarTodosPosts() {
        List<PostModel> todosPosts = postService.buscarTodosPosts();
        return new ResponseEntity<>(todosPosts, HttpStatus.OK); // 200
    }

    @PutMapping("/posts/{id}")
    public ResponseEntity<PostModel> atualizarPost(@PathVariable Long id, @RequestBody PostModel postModel) {
        if (!postService.buscarPorId(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
        }

        postModel.setId(id); // Garante que está atualizando o ID certo
        PostModel postAtualizado = postService.atualizarPost(postModel);
        return new ResponseEntity<>(postAtualizado, HttpStatus.OK); // 200
    }

    @DeleteMapping("/posts/{id}")
    public ResponseEntity<Void> deletarPost(@PathVariable Long id) {
        if (!postService.buscarPorId(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
        }

        postService.deletarPorId(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204
    }
}
