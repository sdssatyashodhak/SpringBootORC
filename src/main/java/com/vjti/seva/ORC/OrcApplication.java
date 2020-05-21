package com.vjti.seva.ORC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class OrcApplication {

	@RequestMapping("/")
    public String hello() {
        return "Hello World! ORC";
    }
	
	@RequestMapping("/welcome")
    public String welcome() {
        return "welcomepage";
    }
	
	@RequestMapping(method=RequestMethod.GET, path="/hello") 
    public String helloworld() {
        return "Hello World!";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(OrcApplication.class, args);
	}

}
