package br.com.codigocafe.service;

import br.com.codigocafe.model.CategoriaModel;
import br.com.codigocafe.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public CategoriaModel cadastrarCategoria(CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }
    public Iterable<CategoriaModel> buscarTodasCategorias() {
        return categoriaRepository.findAll();
    }
    public CategoriaModel buscarPorId(Long id) {
        return categoriaRepository.findById(id).get();
    }
    public CategoriaModel atualizarCategoria(CategoriaModel categoria) {
        return categoriaRepository.save(categoria);
    }
    public void  excluirCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }

}
