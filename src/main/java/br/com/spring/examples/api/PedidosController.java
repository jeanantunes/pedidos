package br.com.spring.examples.api;

import br.com.spring.examples.service.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jean Antunes on 28/03/17.
 */

@RestController
@RequestMapping("/api/pedidos")
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;

    @GetMapping(produces = "application/json")
    public String getPedidos() throws Exception {

        String pedidos = pedidosService.findPedidos();

        if (pedidos == null) {
            throw new Exception("Lista de Pedidos não encontrado");
        }

        return pedidos;

    }
}
