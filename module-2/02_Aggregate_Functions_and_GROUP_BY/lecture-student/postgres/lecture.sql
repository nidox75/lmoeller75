-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT state_name, population FROM state ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT census_region, state_name FROM state ORDER BY census_region DESC, state_name ASC;

-- The biggest parks by area
SELECT 
    park_name-- full park name
    area--size of park
FROM
    park-- table name to pull from
WHERE-- row name to seek
 park_name LIKE 'G%'--name of parks that start with G
 ORDER BY
     area DESC;--sort top down alphabetically


-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT
   city_name,
   population
 FROM
   city
 ORDER BY
     population DESC
 LIMIT 10;

-- The 20 oldest parks from oldest to youngest in years then alphabetically 
SELECT
     park_name,
    (CURRENT_DATE - date_established) / 365.25 AS age_in_years
FROM
   park
   ORDER BY
   
   age_in_years DESC,
   park_name ASC
  
 LIMIT 20;



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation as a single column result set
SELECT
        (city_name || ', ' || state_abbreviation || 'population : ' || population) AS city_and_state
 FROM
        city
 ORDER BY population DESC;

-- The all parks by name and date established as a single column result set



-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT AVG(population)
FROM state;
        
        

-- Total population in the West and South census regions
SELECT
        SUM(population) AS west_south_pop
FROM 
        state
WHERE
        census_region IN ('West' , 'South');

-- The number of cities with populations greater than 1 million
SELECT
        COUNT(*) AS num_big_cities
        
FROM
        city
WHERE
        population > 1000000;               


-- The number of state nicknames.
SELECT
        COUNT(*)
        FROM
                state
 WHERE               
        state_nickname IS NOT NULL;


-- The area of the smallest and largest parks.
SELECT
        MIN(area) AS smallest_area,
        MAX(area) AS biggest_area
FROM
        park;        



-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT
        state_abbreviation,
         COUNT(*) AS num_cities
FROM
     city
GROUP BY
        state_abbreviation 
ORDER BY
        num_cities DESC;                    


-- Determine the average park area depending upon whether parks allow camping or not.
SELECT
        has_camping,
        AVG(area)
FROM
        park
GROUP BY 
        has_camping;                


-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT
       state_abbreviation ASC,
       SUM(population) AS total_population, MIN(population) AS smallest, COUNT(*) AS num_cities
FROM
        city
GROUP BY 
        state_abbreviation;

-- The smallest city population in each state ordered by city population.
SELECT
        state_abbreviation,
       MIN(population) AS smallest_city
FROM
        city
GROUP BY
       state_abbreviation
ORDER BY 
        smallest_city;                     
        


-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET you want to get "pages" of results.
SELECT  
        city_name,
        state_abbreviation
FROM
        city
ORDER BY
       state_abbreviation, city_name
LIMIT 10 OFFSET 30;                       


-- SUBQUERIES (optional)

-- All of the cities in the Midwest census region
SELECT
        city_name, state_abbreviation  
FROM
        city
WHERE
        state_abbreviation IN (
             SELECT
                  state_full_name
             FROM
                      state
             Where
                    census_region = 'Midwest');

-- All of the cities with their full state name


        
