DROP TABLE events;
CREATE TABLE events(
	eventId SERIAL PRIMARY KEY,
	eventName VARCHAR,
	eventLocation VARCHAR,
	eventDateTime TIMESTAMP,
	eventNumericTime NUMERIC(4,0)
);

TRUNCATE TABLE events;