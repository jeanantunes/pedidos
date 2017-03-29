package br.com.spring.examples.view;

/**
 * Created by Jean Antunes on 28/03/17.
 */
public class ErroView {

    private final String mensagem;

    public ErroView(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }
}
