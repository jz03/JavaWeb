package cn.jz.helloWorld.configure;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * 上下文事件停止
 * 
 * @author 冀州
 * @date 2018年4月14日
 */
public class CStopEventHandler implements ApplicationListener<ContextStoppedEvent> {
	/*
	 * 为了监听上下文事件
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(ContextStoppedEvent event) {
		System.out.println("ContextStoppedEvent Received");
	}
}