package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Department;

public class JdbcDepartmentDao implements DepartmentDao {

	
	private final JdbcTemplate jdbcTemplate;

	public JdbcDepartmentDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Department getDepartment(Long id) {
		String sql = "SELECT * FROM department WHERE department_id =?";
		Department department = null;
		SqlRowSet deptRowSet = jdbcTemplate.queryForRowSet(sql, id);
		if (deptRowSet.next()) {
			department = mapRowToDepartment(deptRowSet);

		}return department;
	}

	@Override
	public List<Department> getAllDepartments() {
		List<Department> departments = new ArrayList<>();
	String sql = "SELECT * FROM department";
	SqlRowSet deptRowSet = jdbcTemplate.queryForRowSet(sql);
	while (deptRowSet.next()) {
		departments.add(mapRowToDepartment(deptRowSet));

	}return departments;



	}

	@Override
	public void updateDepartment(Department updatedDepartment) {
    String sql = "UPDATE department SET name = ? WHERE department_id = ?";
    jdbcTemplate.update(sql, updatedDepartment.getName(), updatedDepartment.getId());

	}
	private Department mapRowToDepartment(SqlRowSet rowSet) {
		Department department = new Department();
		department.setId(rowSet.getLong("department_id"));
		department.setName(rowSet.getString("name"));
		return department;
	}

}
