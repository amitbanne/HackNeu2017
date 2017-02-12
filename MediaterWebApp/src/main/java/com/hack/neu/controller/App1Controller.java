/**
 * 
 */
package com.hack.neu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hack.neu.variables.MessageHolder;;

/**
 * @author harsh
 *
 */

@Controller
public class App1Controller {

	@RequestMapping("/app1_producer/{topic}/{msg}")
	public void producer(@PathVariable("topic") String topic, @PathVariable("msg") String message) {
		
		MessageHolder.updateMessage(topic, message);
	}
	
	@ResponseBody
	@RequestMapping("/app1_consumer/{topic}")
	public String consumer(@PathVariable("topic") String topic){
		
		return MessageHolder.getMessage(topic);
	}
}
