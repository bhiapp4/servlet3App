package org.test.servlet.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionMonitoringListener implements HttpSessionListener{
	private int activeCount =0;
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		activeCount++;
		System.out.println("The  number of active sessions in my application is " +activeCount);
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		activeCount--;
		System.out.println("The  number of active sessions in my application is " +activeCount);
	}

}
