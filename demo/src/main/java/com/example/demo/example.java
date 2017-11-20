package com.example.demo;

import java.util.Date;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  
@EnableAutoConfiguration  
public class example {
	 @RequestMapping("/")  
	    String home() {  
	        return "Hello World!";  
	    }  
	      
	    @RequestMapping("/hello/{myName}")  
	    String index(@PathVariable String myName) {  
	        return "Hello "+myName+"!!!";  
	    }  
	    
	    @RequestMapping("/now")
	    String hehe() {
	        return "现在时间：" + (new Date()).toLocaleString();
	    }
}
