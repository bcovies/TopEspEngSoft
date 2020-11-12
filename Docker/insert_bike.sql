CREATE TABLE "bicicleta" (
  "id" serial NOT NULL,
  "qrcode" character varying(50) NOT NULL,
  "km" character varying(50) NOT NULL,
  "totem" character varying(11) NOT NULL,
  "alugada"  boolean NOT NULL
);
