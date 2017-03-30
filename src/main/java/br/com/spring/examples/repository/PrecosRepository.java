package br.com.spring.examples.repository;

import br.com.spring.examples.model.Precos;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Jean Antunes on 23/03/17.
 */

public interface PrecosRepository extends CrudRepository<Precos, String> {
}
