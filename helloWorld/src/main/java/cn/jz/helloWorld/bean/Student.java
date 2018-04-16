package cn.jz.helloWorld.bean;

/**
 * 切面编程：切入点
 * 
 * @author 冀州
 * @date 2018年4月15日
 */
public class Student {
	private String name;
	private String age;

	public String getName() {
		System.out.println("名字：" + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		System.out.println("年龄：" + age);
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}
