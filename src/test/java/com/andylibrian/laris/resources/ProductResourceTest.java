package com.andylibrian.laris.resources;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProductResourceTest extends JerseyTest {

    @Override
    protected Application configure() {
        return new ResourceConfig(ProductResource.class);
    }

    @Test
    public void testGetIt() {
        final String responseMsg = target().path("products").request().get(String.class);

        assertEquals("Hello, world!", responseMsg);
    }
}
