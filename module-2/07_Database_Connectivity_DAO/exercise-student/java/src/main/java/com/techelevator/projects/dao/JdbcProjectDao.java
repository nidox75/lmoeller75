package com.techelevator.projects.dao;

import com.techelevator.projects.model.Department;
import com.techelevator.projects.model.Project;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class JdbcProjectDao implements ProjectDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcProjectDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Project getProject(Long projectId) {
		String sql = "SELECT * FROM project WHERE project_id =?";
		Project project = null;
		SqlRowSet deptRowSet = jdbcTemplate.queryForRowSet(sql, projectId);
		if (deptRowSet.next()) {
			project = mapRowToProject(deptRowSet);

		}return project;
    }

    @Override
    public List<Project> getAllProjects() {
        List<Project> projects = new ArrayList<>();
        String sql = "SELECT * FROM project ";
        SqlRowSet deptRowSet = jdbcTemplate.queryForRowSet(sql);
        while (deptRowSet.next()) {
            projects.add(mapRowToProject(deptRowSet));
        }
        return projects;
    }

    @Override
    public Project createProject(Project newProject) {
        return null;
    }

    @Override
    public void deleteProject(Long projectId) {

    }

    private Project mapRowToProject(SqlRowSet rowSet) {
        Project project = new Project();
        Date projectFromDate = rowSet.getDate("from_date");
        Date projectToDate = rowSet.getDate("to_date");

        project.setId(rowSet.getLong("project_id"));
        project.setName(rowSet.getString("name"));

        if (projectFromDate == null) {
            project.setFromDate(null);
        } else {
            project.setFromDate(projectFromDate.toLocalDate());
        }

        if (projectToDate == null) {
            project.setToDate(null);
        } else {
            project.setToDate(projectToDate.toLocalDate());
        }

        return project;
    }


}
