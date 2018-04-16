package cn.jz.helloWorld.bean;

import org.springframework.context.ApplicationListener;

/**
 * 自定义事件处理
 * 
 * @author 冀州
 * @date 2018年4月15日
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {

	/*
	 * 为了事件监听
	 * @see org.springframework.context.ApplicationListener#onApplicationEvent(org.springframework.context.ApplicationEvent)
	 */
	public void onApplicationEvent(CustomEvent event) {
		// TODO Auto-generated method stub
		System.out.println(event.toString());
	}

}
