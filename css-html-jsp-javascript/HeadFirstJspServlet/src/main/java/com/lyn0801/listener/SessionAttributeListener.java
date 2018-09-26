package com.lyn0801.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class SessionAttributeListener implements HttpSessionAttributeListener{

	@Override
	public void attributeAdded(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("��ӵ���������"+httpSessionBindingEvent.getName() + ",����ֵ��"+httpSessionBindingEvent.getValue());
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent httpSessionBindingEvent) {
		System.out.println("ɾ������������"+httpSessionBindingEvent.getName() + ",����ֵ��"+httpSessionBindingEvent.getValue());
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent httpSessionBindingEvent) {
		// TODO Auto-generated method stub
		
	}

}
