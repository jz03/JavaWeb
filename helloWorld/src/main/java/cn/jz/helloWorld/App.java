package cn.jz.helloWorld;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jz.helloWorld.bean.Student;
import cn.jz.helloWorld.dao.StudentDAO;

/**
 * 程序入口
 * @author 冀州
 * @date 2018年4月13日
 */
public class App {
	static Logger log = Logger.getLogger(App.class.getName());
	public static void main(String[] args) {
//		PropertyConfigurator.configure( "F:/project/helloWorld/src/main/resources/log4j.properties" );
		ApplicationContext  context = new ClassPathXmlApplicationContext("bean.xml");
		StudentDAO cep = (StudentDAO)context.getBean("studentDAO");
		System.out.println("------Records Creation--------");
		cep.create("Zara", 11);
		cep.create("Nuha", 2);
		cep.create("Ayan", 15);
		
		System.out.println("------Listing Multiple Records--------");
		List<Student> students = cep.listStudents();
		for (Student record : students) {
			System.out.print("ID : " + record.getId());
			System.out.print("Name : " + record.getName());
			System.out.println("Age : " + record.getAge());
		}
		
		System.out.println("----Updating Record with ID = 2 -----");
		cep.update(2, 20);
		
		System.out.println("----Listing Record with ID = 2 -----");
		Student student = cep.getStudent(2);
		System.out.print("ID : " + student.getId());
		System.out.print("Name : " + student.getName());
		System.out.println("Age : " + student.getAge());
	}
}
