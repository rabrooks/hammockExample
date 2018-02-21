package com.codepundits.listings;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("/hello")
public class HelloService {
    @GET
    public String sayHello() {
        return "Hello World!";
    }
}
