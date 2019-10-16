package com.lyn0801.jersey.client.ssl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.glassfish.jersey.SslConfigurator;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class HelloTest {
    public static void main(String[] args) {
        SslConfigurator sslConfig = SslConfigurator.newInstance()
                .trustStoreFile("src/main/resources/client.jks")
                .trustStorePassword("123456");
        SSLContext sslContext = sslConfig.createSSLContext();
        HostnameVerifier allHostsValid = new InsecureHostnameVerifier();
        Client client = ClientBuilder.newBuilder()
                .sslContext(sslContext)
                .hostnameVerifier(allHostsValid)
                .build();
        WebTarget target = client.target("https://localhost:8080/hello");
        Response response = target.request(MediaType.APPLICATION_XML_TYPE, MediaType.APPLICATION_JSON_TYPE).get();
        System.out.println(response.getEntity());
        ObjectMapper mapper = new ObjectMapper();
        String value = mapper.convertValue(response.readEntity(String.class), String.class);
        System.out.println(value);
    }
}
