package cn.jz.helloWorld.bean;

public class Message {
	private String message;

	public String getMessage() {
		System.out.println("你的信息:" + message);
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
//	public void init() {
//		System.out.println("Bean is going through init.");
//	}
//
//	public void destroy() {
//		System.out.println("Bean will destroy now.");
//	}
}
