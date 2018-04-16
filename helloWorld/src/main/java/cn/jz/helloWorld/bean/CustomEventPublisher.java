package cn.jz.helloWorld.bean;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * 自定义事件发布
 * 
 * @author 冀州
 * @date 2018年4月15日
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;
	/*
	 * (non-Javadoc)
	 * @see org.springframework.context.ApplicationEventPublisherAware#setApplicationEventPublisher(org.springframework.context.ApplicationEventPublisher)
	 */
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}
	
	public void publish(){
		CustomEvent ce = new CustomEvent(this);
		publisher.publishEvent(ce);
	}

}
