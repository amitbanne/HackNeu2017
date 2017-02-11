/**
 * 
 */
package com.hack.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author harsh
 *
 */
@Controller
public class ProducerController {
	String message = "NO_DATA";
	
	@RequestMapping("/d1/{sensor}")
	public void producer(){
		System.out.println("Hello World");
		KafkaProducers.producer();
		
		message = "NEW MESSAGE";
	}
	
	@ResponseBody
	@RequestMapping("/d2")
	public String consumer(){
		System.out.println("Hello Worlsssssd");

		KafkaConsumerssss.cons();
		return message;
	}
}
