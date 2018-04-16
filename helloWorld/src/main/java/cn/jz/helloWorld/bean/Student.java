package cn.jz.helloWorld.bean;

/**
 * 切面编程：切入点
 * 
 * @author 冀州
 * @date 2018年4月15日
 */
public class Student {
	private Integer id;
	private String name;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		System.out.println("名字：" + name);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		System.out.println("年龄：" + age);
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void printThrowException() {
		System.out.println("Exception raised");
		throw new IllegalArgumentException();
	}
}
