# Hackerrank Problems

## Weather Observation Station 1
https://www.hackerrank.com/challenges/weather-observation-station-1/problem

### Problem 
Query a list of CITY and STATE from the STATION table.
The STATION table is described as follows:

    Station
    
    | Field  | Type         |
    |--------|--------------|
    | ID     | NUMBER       |
    | CITY   | VARCHAR2(21) |
    | STATE  | VARCHAR2(2)  |
    | LAT_N  | NUMBER       |
    | LONG_W | NUMBER       |

where LAT_N is the northern latitude and LONG_W is the western longitude.

### Solution

    SELECT CITY, STATE
    FROM STATION;

***

## Japanese Cities Attributes
https://www.hackerrank.com/challenges/japanese-cities-attributes/problem

### Problem
Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.

The CITY table is described as follows:

| Field       | Type        |
|-------------|-------------|
| ID          | NUMBER      |
| NAME        | VARCHAR(17) |
| COUNTRYCODE | VARCHAR(3)  |
| DISTRICT    | VARCHAR(20) |
| POPULATION  | NUMBER      |

### Solution

    SELECT *
    FROM CITY
    WHERE COUNTRYCODE = 'JPN';

***

## Japanese Cities Names
https://www.hackerrank.com/challenges/japanese-cities-name/problem

### Problem
Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
The CITY table is described as follows:

| Field       | Type         |
|-------------|--------------|
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

### Solution

    SELECT NAME
    FROM CITY
    WHERE COUNTRYCODE = 'JPN';

***

## Select by ID
https://www.hackerrank.com/challenges/select-by-id/problem
### Problem
Query all columns for a city in CITY with the ID 1661.

The CITY table is described as follows:

| Field       | Type         |
|-------------|--------------|
| ID          | NUMBER       |
| NAME        | VARCHAR2(17) |
| COUNTRYCODE | VARCHAR2(3)  |
| DISTRICT    | VARCHAR2(20) |
| POPULATION  | NUMBER       |

### Solution

    Select *
    From CITY
    where ID = '1661';