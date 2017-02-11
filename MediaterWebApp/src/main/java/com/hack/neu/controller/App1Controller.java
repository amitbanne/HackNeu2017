/**
 * 
 */
package com.hack.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hack.neu.variables.MessageHolder;

/**
 * @author harsh
 *
 */

@Controller
public class App1Controller {

	@RequestMapping("/app1_producer")
	public void producer(@RequestParam("topic") String topic, @RequestParam("message") String message) {
		
		MessageHolder.updateMessage(topic, message);
	}
	
	@ResponseBody
	@RequestMapping("/app1_consumer")
	public String consumer(@RequestParam("topic") String topic){
		
		return MessageHolder.getMessage(topic);
	}
}
