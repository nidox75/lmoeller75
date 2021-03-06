package com.techelevator;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class CityLister {
    public static void main(String[] args) {
        //Datasource
        BasicDataSource usaDataSource = new BasicDataSource();
        usaDataSource.setUrl("jdbc:postgresql://localhost:5432/UnitedStates");
        usaDataSource.setUsername("postgres");
        usaDataSource.setPassword("postgres1");
        //JDBC Template
        JdbcTemplate jdbcTemplate = new JdbcTemplate(usaDataSource);
         //SELECT city_name,population FROM city WHERE state_abbreviation = 'OH';
        SqlRowSet cities = jdbcTemplate.queryForRowSet(
               // "SELECT city_name,population FROM city WHERE state_abbreviation = ? ORDER BY population DESC;","OH");
        "SELECT city_name, population FROM city " +
                "WHERE state_abbreviation = ? AND population > ? ORDER BY population DESC;", "OH", 250000);
        // SqlRowSet
        while (cities.next()) {
            String cityName = cities.getString("city_name");
            String population = cities.getString("population");

            System.out.println("Name: " + cityName + "Population" + population);
        }
    }
}
