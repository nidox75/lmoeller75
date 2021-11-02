package com.techelevator.blog;

import java.sql.Array;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcPostDao implements PostDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcPostDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(Post newPost) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/assessment");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");

		JdbcPostDao application = new JdbcPostDao(dataSource);


		// Implement this method to save post to database
	}

	@Override
	public List<Post> getAllPosts() {
		String sql = "SELECT post.id, name, post.body, published, post.created " +
				"FROM posts";
		SqlRowSet posts = this.jdbcTemplate.queryForRowSet(sql);

		List<Post> postResult = new ArrayList<>();
		// Implement this method to pull in all posts from database

		return null;
	}

	private Post mapRowToPost(SqlRowSet results) {
		Post postRow = new Post();
		postRow.setId(results.getLong("id"));
		postRow.setName(results.getString("name"));
		postRow.setBody(results.getString("body"));
		postRow.setPublished(results.getBoolean("published"));
		postRow.setCreated(results.getDate("created").toLocalDate());
		return postRow;
	}

}
