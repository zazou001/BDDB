CREATE TABLE Bouteille 
(
	idBouteille integer primary key, 
	taille integer not null, 
	format VARCHAR(30), 
	bouchon VARCHAR(30) not null
);

CREATE TABLE Brasserie
(
	idBrasserie integer primary key,
	nomBrasserie VARCHAR(50) not null,
	ville VARCHAR(30),
	pays VARCHAR(30)
);

CREATE TABLE Breuvage
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
	idBouteille integer references bouteille(idBouteille),
	idBrasserie integer not null references brasserie(idBrasserie)
);

create view Biere as
	select Breuvage.*, Brasserie.nomBrasserie, Brasserie.ville,  Brasserie.pays, Bouteille.taille, Bouteille.format, Bouteille.bouchon
		from Breuvage, Brasserie, Bouteille 
	where (Breuvage.idBrasserie = Brasserie.idBrasserie) 
		AND (Breuvage.idBouteille = Bouteille.idBouteille);

insert into "Breuvage" values(1, "Kronenbourg",5,null, null,"Blonde", null, null, null, 1, 1);
insert into "Brasserie" values(1,"Brasseries Kronenbourg", "Strasbourg", "France");
insert into "Bouteille" values(1,33,"normal","capsule");

insert into "Breuvage" values(2, "Scotch Ale",5.8,null, null,"Ambrée", 2005, null, null, 1, 2);
insert into "Brasserie" values(2,"Red Hill Brewery", null, "Australie");
insert into "Bouteille" values(2,50,"normal","capsule");

insert into "Breuvage" values(3, "La chouffe",8,null, null,"Blonde", 1982, null, null, 1, 4);
insert into "Brasserie" values(4,"Brasserie D'Aschouffe", null, "Belgique");
insert into "Bouteille" values(3,75,"normal","capsule");

insert into "Breuvage" values(4, "Summer Lightning",5,null, null,"Blonde", 1988, null, null, 2, 3);
insert into "Brasserie" values(3,"Hop Back Brewery", "Salisbury", "Angleterre");
insert into "Bouteille" values(4,75,"normal","champagne");

insert into "Breuvage" values(6, "Jacobsen Sommer Wit",5.1,null, null,"Blanche", 2008, null, null, 1, 5);
insert into "Brasserie" values(5,"Husbryggeriet Jacobsen", null, "Danemark");

insert into "Breuvage" values(5, "Kronenbourg",5,null, null,"Blonde", null, 2, "grosse biere à soif", 3, 1);

update "Breuvage" set commentaire="biere à soif" where idBreuvage =1;
