package com.oup.example.springbootcamel;

import javax.ws.rs.core.Response;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring REST endpoint
 */
@RestController
@RequestMapping("/")
public class HelloRestController {

    /**
     * Inject Camel producer to use camel-geocoder to find location where we are
     */
//    @EndpointInject(uri = "geocoder:address:current")
//    private FluentProducerTemplate producer;

    /**
     * HTTP GET method
     */
    @RequestMapping(method = RequestMethod.POST, value = "/",
                    produces = "text/plain"
                    )
    public String hello(@RequestBody String body) {
        // call Camel to find our location, the returned string is in JSon format
    	
    	System.out.println("Device Message : " +body);
        //String where = producer.request(String.class);

        return "Accepted";
    }
}
