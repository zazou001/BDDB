CREATE TABLE bouteille 
(
	idBouteille integer primary key, 
	taille integer not null, 
	format VARCHAR(30), 
	bouchon VARCHAR(30) not null
);

CREATE TABLE brasserie
(
	idBrasserie integer primary key,
	nomBrasserie VARCHAR(50) not null,
	ville VARCHAR(30),
	pays VARCHAR(30)
);

CREATE TABLE breuvage
(
	idBreuvage integer primary key,
	nom VARCHAR(20) not null,
	alcool float not null,
	typefermentation VARCHAR(20),
	particularite VARCHAR(20),
	couleur VARCHAR(20),
	annee integer,
	note integer,
	commentaire VARCHAR(146),
	idBouteille integer references bouteille(id),
	idBrasserie integer not null references brasserie(id)
);

create view biere as
	select breuvage.*, brasserie.nomBrasserie, brasserie.ville,  brasserie.pays, bouteille.taille, bouteille.format, bouteille.bouchon
		from breuvage, brasserie, bouteille 
	where (breuvage.idBrasserie = brasserie.idBrasserie) 
		AND (breuvage.idBouteille = bouteille.idBouteille);

insert into "breuvage" values(1, "Kronenbourg",5,null, null,"Blonde", null, null, null, 1, 1);
insert into "brasserie" values(1,"Brasseries Kronenbourg", "Strasbourg", "France");
insert into "bouteille" values(1,33,"normal","capsule");

insert into "breuvage" values(2, "Scotch Ale",5.8,null, null,"Ambrée", 2005, null, null, 1, 2);
insert into "brasserie" values(2,"Red Hill Brewery", null, "Australie");
insert into "bouteille" values(2,50,"normal","capsule");

insert into "breuvage" values(3, "La chouffe",8,null, null,"Blonde", 1982, null, null, 1, 3);
insert into "brasserie" values(4,"Brasserie D'Aschouffe", null, "Belgique");
insert into "bouteille" values(3,75,"normal","capsule");

insert into "breuvage" values(4, "Summer Lightning",5,null, null,"Blonde", 1988, null, null, 2, 3);
insert into "brasserie" values(3,"Hop Back Brewery", "Salisbury", "Angleterre");
insert into "bouteille" values(4,75,"normal","champagne");

insert into "breuvage" values(6, "Jacobsen Sommer Wit",5.1,null, null,"Blanche", 2008, null, null, 1, 5);
insert into "brasserie" values(5,"Husbryggeriet Jacobsen", null, "Danemark");

insert into "breuvage" values(5, "Kronenbourg",5,null, null,"Blonde", null, 2, "grosse biere à soif", 3, 1);

update "breuvage" set commentaire="biere à soif" where idBreuvage =1;
