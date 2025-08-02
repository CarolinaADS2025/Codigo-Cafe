package br.com.codigocafe.controller;

import br.com.codigocafe.model.CategoriaModel;
import br.com.codigocafe.repository.CategoriaRepository;
import br.com.codigocafe.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/categorias")
    public ResponseEntity<CategoriaModel> cadastrarCategoria(@RequestBody CategoriaModel categoriaModel) {
        CategoriaModel novaCategoria = categoriaService.cadastrarCategoria(categoriaModel);
        return new ResponseEntity<>(novaCategoria,HttpStatus.CREATED);
    }
    @GetMapping("/categorias")
    public ResponseEntity<List<CategoriaModel>> buscarTodasCategorias() {
        Iterable<CategoriaModel> todasCategorias = categoriaService.buscarTodasCategorias();
        return new ResponseEntity<List<CategoriaModel>>((List<CategoriaModel>) todasCategorias, HttpStatus.OK);
    }

    @GetMapping("/categorias/{id}")
    public ResponseEntity<CategoriaModel> buscarPorId(Long id) {
        CategoriaModel novaCategoria = categoriaService.buscarPorId(id);
        return new ResponseEntity<>(novaCategoria,HttpStatus.OK);
    }

    @PutMapping("/categorias/{id}")
    public ResponseEntity<CategoriaModel> atualizarCategoria(@RequestBody CategoriaModel categoriaModel) {
        CategoriaModel atualizarCategoria = categoriaService.atualizarCategoria(categoriaModel);
        return new ResponseEntity<>(atualizarCategoria,HttpStatus.OK);
    }
}
