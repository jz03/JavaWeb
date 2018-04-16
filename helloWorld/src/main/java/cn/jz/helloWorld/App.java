package cn.jz.helloWorld;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.jz.helloWorld.bean.Student;
import cn.jz.helloWorld.bean.StudentMarks;
import cn.jz.helloWorld.dao.StudentDAO;
import cn.jz.helloWorld.dao.StudentStoredDAO;
import cn.jz.helloWorld.dao.StudentTransactionDAO;
import cn.jz.helloWorld.mapping.StudentMapping;
import cn.jz.helloWorld.mapping.StudentMarksMapping;

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
		StudentTransactionDAO cep = (StudentTransactionDAO)context.getBean("studentTransactionDAO");
		System.out.println("------Records creation--------");
		cep.create("Zara", 11, 99, 2010);
		cep.create("Nuha", 20, 97, 2010);
		cep.create("Ayan", 25, 100, 2011);
		System.out.println("------Listing all the records--------");
		List<StudentMarks> studentMarks = cep.listStudents();
		for (StudentMarks record : studentMarks) {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Marks : " + record.getMarks());
			System.out.print(", Year : " + record.getYear());
			System.out.println(", Age : " + record.getAge());
		}
	}
}
