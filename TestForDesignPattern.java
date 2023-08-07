package com.demo;

public class TestForDesignPattern {

	public static void main (String [] args) {
		NotificationFactory nf=new NotificationFactory();
		Notification nc=nf.createNotification("SMS");
		Notification nc2=nf.createNotification("Email");

		nc.notifyUser();
		nc2.notifyUser();
	}
}
