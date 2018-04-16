package cn.jz.helloWorld.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import cn.jz.helloWorld.bean.Student;
import cn.jz.helloWorld.mapping.StudentMapping;

/**
 * Spring jdbc模板
 * 实现了对数据库的操作
 * @author 冀州
 * @date 2018年4月16日
 */
public class StudentDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	/*新加一条记录*/
	public void create(String name, Integer age) {
		String SQL = "insert into Student(name,age) values (?,?)";
		jdbcTemplateObject.update(SQL,name,age);
		System.out.println("新加一条记录：名字" + name + " 年龄" + age);
	}

	/*根据ID获取一条信息*/
	public Student getStudent(Integer id) {
		String SQL = "select * from Student where id = ?";
		Student student = jdbcTemplateObject.queryForObject(SQL, new Object[]{id},new StudentMapping());
		return student;
	}

	/*获取整张表的记录*/
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapping());
		return students;
	}
	/*根据ID删除一条记录*/
	public void delete(Integer id) {
		String SQL = "delete from Student where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("删除 ID = " + id );
	}

	/*耿局ID跟新一条记录*/
	public void update(Integer id, Integer age) {
		String SQL = "update Student set age = ? where id = ?";
		jdbcTemplateObject.update(SQL, age,id);
		System.out.println("更新 ID = " + id );
	}

}
