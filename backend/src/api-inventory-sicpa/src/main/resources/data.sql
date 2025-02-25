DELETE FROM location_inventory;
DELETE FROM item;

INSERT INTO location_inventory (id, name) VALUES (1, 'Location A');
INSERT INTO location_inventory (id, name) VALUES (2, 'Location B');

INSERT INTO item (id, name) VALUES (1, 'Item 1');
INSERT INTO item (id, name) VALUES (2, 'Item 2');
INSERT INTO item (id, name) VALUES (3, 'Item 3');
