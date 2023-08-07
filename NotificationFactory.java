package com.demo;

import io.micrometer.common.util.StringUtils;

public class NotificationFactory {

	public Notification createNotification(String channel) {
		if(channel==null || StringUtils.isEmpty(channel)) 
			return null;
		
		switch (channel) {
		case "SMS":
			 return new SMSNotification();
			 
		case "Email":
			return new EmailNotification();
		default :
			throw new IllegalArgumentException("No such Channel or UnKnown channel");
		}
	}
}
