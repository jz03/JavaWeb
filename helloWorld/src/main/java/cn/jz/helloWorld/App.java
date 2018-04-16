package cn.jz.helloWorld;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jz.helloWorld.bean.Message;

/**
 * 程序入口
 * classpath:
 * @author 冀州
 * @date 2018年4月13日
 */
public class App {
	static Logger log = Logger.getLogger(App.class.getName());
	public static void main(String[] args) {
		PropertyConfigurator.configure( "F:/project/helloWorld/src/main/resources/log4j.properties" );
		ApplicationContext  context = new ClassPathXmlApplicationContext("bean.xml");
		log.info("Going to create HelloWord Obj");
		Message cep = (Message)context.getBean("helloWorld");
		cep.getMessage();
		log.info("Exiting the program");
	}
}
