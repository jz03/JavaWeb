package cn.jz.helloWorld.bean;

public class MessageFather {
	private String message1;
	private String message2;

	public String getMessage1() {
		System.out.println("father message:" + message1);
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		System.out.println("father message:" + message2);
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}
}
