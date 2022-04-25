create table producto(
	codprod		serial not null primary key,
	nomprod		varchar(80),
	priceprod	decimal(5,2),
	categoryprod	varchar(50)
)