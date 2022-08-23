package com.samples.S06SpringJdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.samples.S06SpringJdbc.dao.EmployeeDAO;
import com.samples.S06SpringJdbc.dto.Employee;

/**
 * Hello world!
 *
 */
public class EmployeeApp 
{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext springContainer = new ClassPathXmlApplicationContext(
				"com/samples/S06SpringJdbc/SpringConfig.xml");

		EmployeeDAO employeeDao = (EmployeeDAO) springContainer.getBean("employeedao");
		
		// createEmployee(employeeDao);
		
//		updateEmployee(employeeDao);
		
		deleteEmployee(employeeDao);
		

	}

	private static void deleteEmployee(EmployeeDAO employeeDao) {
		employeeDao.delete(1);
	}

	private static void updateEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Bob");
		emp.setLastName("Rockwell");
		
		employeeDao.update(emp);
	}

	private static void createEmployee(EmployeeDAO employeeDao) {
		Employee emp = new Employee();
		emp.setId(2);
		emp.setFirstName("Dexter");
		emp.setLastName("Johnson");
		
		employeeDao.create(emp);
	}
}
