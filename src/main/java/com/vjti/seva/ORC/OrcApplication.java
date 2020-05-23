package com.vjti.seva.ORC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.vjti.seva.ORC.model.Registration;


@Controller
@EnableAutoConfiguration
@SpringBootApplication
public class OrcApplication {

	@ResponseBody
	@RequestMapping("/hello")
    public String hello() {
        return "Hello World! ORC";
    }
	
	@RequestMapping("/welcome")
    public ModelAndView welcome(@RequestParam("name") String name) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", name);
		mv.setViewName("welcomepage");
		return mv;
    }
	
	@RequestMapping("/registration")
	public String registration(Registration registration) {
		return "registration";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(method=RequestMethod.GET, path="/health") 
    public String helloworld() {
        return "Hello World!";
    }
	
	public static void main(String[] args) {
		SpringApplication.run(OrcApplication.class, args);
	}

}
