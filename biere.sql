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
	ville VARCHAR(30)not null,
	pays VARCHAR(30)
);

CREATE TABLE breuvage
(
	idBreuvage integer primary key,
	nom VARCHAR(20) not null,
	alcool integer not null,
	typefermentation VARCHAR(20),
	particularite VARCHAR(20),
	couleur VARCHAR(20),
	annee integer,
	note integer,
	commentaire VARCHAR(146),
	idBouteille integer references bouteille(id),
	idBrasserie integer references brasserie(id)
);

insert into "breuvage" values(1, "Kronenbourg",5,null, null,"Blonde", null, null, null, null, null);
update "breuvage" set commentaire="biere à soif" where idBrevage =1;
update "breuvage" set commentaire="biere à soif" where idBrevage =1;
