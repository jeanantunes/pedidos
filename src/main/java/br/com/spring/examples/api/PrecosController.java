package br.com.spring.examples.api;

import br.com.spring.examples.model.Precos;
import br.com.spring.examples.repository.PrecosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jean Antunes on 28/03/17.
 */
@RestController
@RequestMapping("/api/precos")
public class PrecosController {

    private PrecosRepository precosRepository;

    @Autowired
    public PrecosController(PrecosRepository precosRepository) {
        this.precosRepository = precosRepository;
    }

    @GetMapping
    public Iterable<Precos> findAll() {
        return precosRepository.findAll();
    }
}
