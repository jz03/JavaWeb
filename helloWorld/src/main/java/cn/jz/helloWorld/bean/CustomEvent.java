package cn.jz.helloWorld.bean;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 * 
 * @author 冀州
 * @date 2018年4月15日
 */
public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
	}
		
	public String toString(){
		return "My Custom Event";
	}

}
