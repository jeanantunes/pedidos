package br.com.spring.examples.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.springframework.http.HttpHeaders.USER_AGENT;

/**
 * Created by Jean Antunes on 24/03/17.
 */
@Service
public class PedidosService {

    public String findPedidos() throws Exception {
        try {
            //Cria URL por Produto
            String url = sendGet();

            return url;

        } catch (final Exception e) {
            return e.getMessage();
        }
    }


    private String sendGet() throws Exception {

        String url = "https://egf1amcv33.execute-api.us-east-1.amazonaws.com/dev/pedidos";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

        return String.valueOf(response);

    }
}
