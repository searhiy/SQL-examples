INSERT INTO countries (country_code, country_name)
VALUES ('us','United States'), ('mx','Mexico'), ('au','Australia'),
('gb','United Kingdom'), ('de','Germany'), ('ll','Loompaland');

SELECT * FROM countries;

DELETE FROM countries WHERE country_code = 'll';

INSERT INTO cities VALUES ('Portland','87200','us');

UPDATE cities SET postal_code = '97205' WHERE name = 'Portland';