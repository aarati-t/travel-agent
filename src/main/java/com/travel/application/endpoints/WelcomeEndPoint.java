package com.travel.application.endpoints;

import com.vaadin.flow.server.auth.AnonymousAllowed;

import dev.hilla.Endpoint;
import dev.hilla.Nonnull;

public class WelcomeEndPoint {
	@Endpoint
	@AnonymousAllowed
	public class HelloEndpoint {

	    @Nonnull
	    public String sayHello(@Nonnull String name) {
	        if (name.isEmpty()) {
	            return "Welcome to travel blog";
	        } else {
	            return "Hello " + name;
	        }
	    }
	}
}
