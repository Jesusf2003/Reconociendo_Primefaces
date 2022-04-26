
create table producto(
	codprod		serial not null primary key,
	nomprod		varchar(80),
	imgprod		varchar(20),
	priceprod	decimal(5,2),
	categoryprod	varchar(50)
)

insert into producto(nomprod, imgprod, priceprod, categoryprod)
values
	('Doritos', 'snack', 1.00, 'Snacks'),
	('Primor', 'cocina', 5.50, 'Cocina'),
	('Tondero', 'cocina', 4.50, 'Cocina'),
	('Dulfina', 'cocina', 3.50, 'Cocina'),
	('coca Cola', 'snack', 3.50, 'Snacks'),
	('Inka Cola', 'snack', 3.00, 'Snacks'),
	('Pícaras', 'snack', 1.20, 'Snacks'),
	('Vizzio', 'snack', 1.50, 'Snacks'),
	('Manty', 'cocina', 3.00, 'Cocina'),
	('Gloria', 'cocina', 3.00, 'Cocina');

select * from producto;