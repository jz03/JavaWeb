package cn.jz.helloWorld.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import cn.jz.helloWorld.bean.Student;
import cn.jz.helloWorld.mapping.StudentMapping;

/**
 * 数据库的存储过程DAO
 * 
 * @author 冀州
 * @date 2018年4月16日
 */
public class StudentStoredDAO {

	private SimpleJdbcCall jdbcCall;
	private JdbcTemplate jdbcTemplateObject;
	
	/*依赖注入*/
	public void setDataSource(DataSource dataSource) {
		//指定存储过程
		this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	public void create(String name, Integer age) {
		String SQL = "insert into Student (name, age) values (?, ?)";
		jdbcTemplateObject.update(SQL, name, age);
		System.out.println("Created Record Name = " + name + " Age = " + age);
	}
	
	/*调用了存储过程*/
	public Student getStudent(Integer id) {
		SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
		Map<String, Object> out = jdbcCall.execute(in);
		Student student = new Student();
		student.setId(id);
		student.setName((String) out.get("out_name"));
		student.setAge((Integer) out.get("out_age"));
		return student;
	}
	
	public List<Student> listStudents() {
		String SQL = "select * from Student";
		List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapping());
		return students;
	}
}
