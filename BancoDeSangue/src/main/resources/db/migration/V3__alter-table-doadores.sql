ALTER TABLE doadores DROP COLUMN data_nasc;

ALTER TABLE doadores ADD COLUMN  data_nasc varchar(12);

ALTER TABLE doadores DROP COLUMN email;

ALTER TABLE doadores ADD COLUMN  email varchar(90);