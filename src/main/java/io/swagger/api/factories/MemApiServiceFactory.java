package io.swagger.api.factories;

import io.swagger.api.MemApiService;
import io.swagger.api.impl.MemApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-11-05T22:51:01.927Z[GMT]")public class MemApiServiceFactory {
    private final static MemApiService service = new MemApiServiceImpl();

    public static MemApiService getMemApi() {
        return service;
    }
}
