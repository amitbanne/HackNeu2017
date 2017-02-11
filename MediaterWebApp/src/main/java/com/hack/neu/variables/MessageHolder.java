/**
 * 
 */
package com.hack.neu.variables;

import java.util.HashMap;
import java.util.Map;

/**
 * @author harsh
 *
 */
public class MessageHolder {
	
	private static Map<String, String> messageHolder = new HashMap<String, String>();

	public static synchronized void updateMessage(String topic, String message){
		messageHolder.put(topic, message);
	}
	
	public static synchronized String getMessage(String topic){
		String returnVal = messageHolder.get(topic);
		if(null == returnVal)
			returnVal = "NO-DATA";
		return returnVal;
	}
}
