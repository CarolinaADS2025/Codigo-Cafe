package br.com.codigocafe.repository;

import br.com.codigocafe.model.CategoriaModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<CategoriaModel, Long> {
}
