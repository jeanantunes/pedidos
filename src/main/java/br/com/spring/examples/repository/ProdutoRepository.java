package br.com.spring.examples.repository;

import br.com.spring.examples.model.Produto;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jean Antunes on 28/03/17.
 */
public interface ProdutoRepository extends CrudRepository<Produto, String> {
}
