package cn.jz.helloWorld.configure;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;


/**
 * 上下文事件开始
 * 
 * @author 冀州
 * @date 2018年4月14日
 */
public class CStartEventHandler implements ApplicationListener<ContextStartedEvent> {
	/*
	 * 为了监听上下文事件
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ContextStartedEvent event) {
		System.out.println("ContextStartedEvent Received");
	}
}