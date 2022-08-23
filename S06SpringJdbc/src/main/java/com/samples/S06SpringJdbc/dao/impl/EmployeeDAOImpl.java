package com.samples.S06SpringJdbc.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.samples.S06SpringJdbc.dao.EmployeeDAO;
import com.samples.S06SpringJdbc.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int create(Employee emp) {
		String sql = "insert into employee values (?, ?, ?)";
		int result = jdbcTemplate.update(sql, emp.getId(), emp.getFirstName(), emp.getLastName());
		return result;
	}

}
