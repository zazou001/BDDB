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
	nom VARCHAR(50) not null,
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

insert into "breuvage" values(1, "Kronenbourg",5,null, null,"Blonde", null, null, null, 1, 1);
insert into "brasserie" values(1,"Brasseries Kronenbourg", "Strasbourg", "France");
insert into "bouteille" values(1,33,"normal","capsule");

insert into "breuvage" values(2, "Scotch Ale",5.8,null, null,"Ambrée", 2005, null, null, 1, 2);
insert into "brasserie" values(2,"Red Hill Brewery", null, "Australie");
insert into "bouteille" values(2,50,"normal","capsule");

update "breuvage" set commentaire="biere à soif" where idBreuvage =1;

create view biere as
	select breuvage.nom, brasserie.nom as "nom brasserie",	breuvage.couleur, breuvage.alcool, breuvage.annee, breuvage.note
		from breuvage, brasserie where breuvage.idBrasserie = brasserie.idBrasserie;
