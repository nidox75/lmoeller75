package com.techelevator.projects.dao;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcEmployeeDao implements EmployeeDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcEmployeeDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        SqlRowSet deptRowSet = jdbcTemplate.queryForRowSet(sql);
        while (deptRowSet.next()) {
            employees.add(mapRowToEmployee(deptRowSet));
        } return employees;
    }

    @Override
    public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
        return List.of(new Employee());
    }

    @Override
    public List<Employee> getEmployeesByProjectId(Long projectId) {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employee JOIN project_employee ON project_employee.employee_id = employee.employee_id WHERE project_id = ?";
        SqlRowSet deptRowSet = jdbcTemplate.queryForRowSet(sql, projectId);
        while (deptRowSet.next()) {
            employees.add(mapRowToEmployee(deptRowSet));
        } return employees;
    }

    @Override
    public void addEmployeeToProject(Long projectId, Long employeeId) {
    }

    @Override
    public void removeEmployeeFromProject(Long projectId, Long employeeId) {
    }

    @Override
    public List<Employee> getEmployeesWithoutProjects() {
        return new ArrayList<>();
    }

    private Employee mapRowToEmployee(SqlRowSet rowSet) {
        Employee employee = new Employee();
        employee.setId(rowSet.getLong("employee_id"));
        employee.setDepartmentId(rowSet.getLong("department_id"));
        employee.setFirstName(rowSet.getString("first_name"));
        employee.setLastName(rowSet.getString("last_name"));
        employee.setBirthDate(rowSet.getDate("birth_date").toLocalDate());
        employee.setHireDate(rowSet.getDate("hire_date").toLocalDate());
        return employee;
    }

}
