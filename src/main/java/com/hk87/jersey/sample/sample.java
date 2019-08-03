package com.hk87.jersey.sample;

import com.hk87.jersey.sample.api.ApiConfig;
import java.net.URI;
import javax.ws.rs.core.UriBuilder;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

public class sample {

    private static final String ENDPOINT = "http://localhost/";
    private static final int PORT = 8080;

    public static void main(String[] args) {
        URI baseUri = UriBuilder.fromUri(ENDPOINT).port(PORT).build();
        ResourceConfig resourceConfig = new ApiConfig();
        GrizzlyHttpServerFactory.createHttpServer(baseUri, resourceConfig);
    }
}
