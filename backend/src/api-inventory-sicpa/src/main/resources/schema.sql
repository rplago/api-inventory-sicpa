CREATE TABLE IF NOT EXISTS location_inventory (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS item (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    location_id INTEGER NULL,  
    FOREIGN KEY (location_id) REFERENCES location_inventory(id)
);
