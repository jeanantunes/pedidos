package br.com.spring.examples.api;

import br.com.spring.examples.model.Produto;
import br.com.spring.examples.repository.ProdutoRepository;
import br.com.spring.examples.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jean Antunes on 28/03/17.
 */
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public Iterable<Produto> findAll() {
        return produtoRepository.findAll();
    }

    @GetMapping(value = "{gtin}", produces = "application/json")
    public String getProduto(@PathVariable("gtin") String gtin) throws Exception {

        String produto = produtoService.findProduto(gtin);

        if (produto == null) {
            throw new Exception("Produto não encontrado {" + gtin + "}");
        }

        return produto;

    }
}
