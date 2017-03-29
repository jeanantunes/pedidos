package br.com.spring.examples.api;

import br.com.spring.examples.model.Fornecedor;
import br.com.spring.examples.repository.FornecedorRepository;
import br.com.spring.examples.repository.PrecosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jean Antunes on 28/03/17.
 */
@RestController
@RequestMapping("/api/fornecedor")
public class FornecedorController {

    private FornecedorRepository fornecedorRepository;

    private PrecosRepository precosRepository;


    @Autowired
    public FornecedorController(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    @GetMapping
    public Iterable<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }
}
