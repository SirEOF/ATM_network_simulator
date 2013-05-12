
-- tacod Codigo tarjeta
CREATE TABLE Tarjeta(
	codTarjeta VARCHAR(11),
	tagastoOffline INTEGER,
	CONSTRAINT ta_pk PRIMARY KEY (codTarjeta)
);


-- cucod Codigo cuenta
-- cusaldo Saldo cuenta
CREATE TABLE Cuenta(
	codCuenta INTEGER,
	cusaldo INTEGER DEFAULT 0,
	CONSTRAINT cu_pk PRIMARY KEY (codCuenta)
);


CREATE TABLE CuentaTarjeta(
	codTarjeta VARCHAR(11),
	cunum INTEGER,
	codCuenta INTEGER,
	CONSTRAINT ct_ccod_fk FOREIGN KEY (codCuenta) REFERENCES Cuenta(codCuenta) ON DELETE CASCADE,
	CONSTRAINT ct_tcod_fk FOREIGN KEY (codTarjeta) REFERENCES Tarjeta(codTarjeta) ON DELETE CASCADE,
	CONSTRAINT ct_cnum_check CHECK (cnum IN (1,3)),
	CONSTRAINT ct_pk PRIMARY KEY (codTarjeta,cunum)
);


-- tacod Codigo Tarjeta
-- ctnum Numero entre 1 y 3 que indica las 3 cuentas de cada tarjeta
-- cucod Codigo de Cuenta
CREATE TABLE CuentaTarjeta(
	codTarjeta CHAR(11),
	ctnum INTEGER,
	codCuenta INTEGER,
	CONSTRAINT ct_codCuenta_fk FOREIGN KEY (codCuenta) REFERENCES Cuenta(codCuenta) ON DELETE CASCADE,
	CONSTRAINT ct_codTarjeta_fk FOREIGN KEY (codTarjeta) REFERENCES Tarjeta(codTarjeta) ON DELETE CASCADE,
	CONSTRAINT ct_ctnum_check CHECK (ctnum IN (1,3)),
	CONSTRAINT ct_pk PRIMARY KEY (codTarjeta,ctnum)
);

-- tmcod Cogido de tipo de movimiento
-- tmnombre Nombre del tipo 
CREATE TABLE TipoMovimiento(
	codTMovimiento INTEGER,
	tmnombre  CHAR(30) UNIQUE,
	CONSTRAINT tm_pk PRIMARY KEY (codTMovimiento)
);


-- codEBanco Codigo del Estado del banco
-- ebnombre Nombre del estado del banco
CREATE TABLE EstadoBanco(
	codEBanco INTEGER,
	ebnombre CHAR(30) UNIQUE,
	CONSTRAINT eb_pk PRIMARY KEY (codEBanco)
);

-- codBanco Codigo del banco
-- codEBanco Codigo del Estado del banco
-- bapuerto El puerto del banco
-- baip La ip del banco
-- bamaxCanales El numero maximo de canales
CREATE TABLE Banco(
	codBanco INTEGER,
	codEBanco INTEGER,
	bapuerto INTEGER,
	baip VARCHAR(20),
	bamaxCanales INTEGER,
	CONSTRAINT ba_codEBanco_fk FOREIGN KEY (codEBanco) REFERENCES EstadoBanco(codEBanco) ON DELETE SET NULL,

	CONSTRAINT ba_pk PRIMARY KEY (codBanco)
);

-- codCuentaOrig Codigo cuenta origen
-- codCuentaDest Codigo cuenta destino
-- mocod COdigo movimiento
-- tmcod COdigo de tipo de movimiento
-- moimporte Importe del movimiento
-- mooffline Booleano que indica si es offline
CREATE TABLE Movimiento(
	codMovimiento INTEGER AUTO_INCREMENT,
	codCuentaOrig INTEGER,
	codCuentaDest INTEGER,
	codTMovimiento INTEGER,
	mofecha DATE,
	moimporte INTEGER,
	mooffline BOOLEAN,
	codBanco INTEGER,
	CONSTRAINT mo_codCuentaOrig_fk FOREIGN KEY (codCuentaOrig) REFERENCES Cuenta(codCuenta) ON DELETE NO ACTION,
	CONSTRAINT mo_codCuentaDest_fk FOREIGN KEY (codCuentaDest) REFERENCES Cuenta(codCuenta) ON DELETE NO ACTION,

	CONSTRAINT mo_codTMovimiento_fk FOREIGN KEY (codTMovimiento) REFERENCES TipoMovimiento(codTMovimiento) ON DELETE SET NULL,

	CONSTRAINT mo_codBanco_fk FOREIGN KEY (codBanco) REFERENCES Banco(codBanco) ON DELETE NO ACTION,

	CONSTRAINT mo_pk PRIMARY KEY (codMovimiento)
);


-- codMensaje El codigo del mensaje
-- meoffline Booleano que indica si es offline o no
-- mees_envio Booleano que indica si es envio o no
-- 
-- codBanco El codigo del banco correspondiente al mensaje

--	++++++++++++++++ mensaje
CREATE TABLE Mensaje(
	codMensaje INTEGER,
	meoffline BOOLEAN,
	mees_envio BOOLEAN,
	codBanco INTEGER,
	CONSTRAINT me_codBanco_fk FOREIGN KEY (codBanco) REFERENCES Banco(codBanco) ON DELETE NO ACTION,

	CONSTRAINT me_pk PRIMARY KEY (codMensaje)
);


--	++++++++++++++++ mensaje
CREATE TABLE UltimoEnvio(
	codUltimoEnvio INTEGER,
	uecontestado BOOLEAN DEFAULT 0,
	uecodCajero INTEGER,
	uepuerto INTEGER,
	ueip VARCHAR(20),
	codBanco INTEGER,
	codCuenta INTEGER,

	CONSTRAINT ue_codBanco_fk FOREIGN KEY (codBanco) REFERENCES Banco(codBanco) ON DELETE NO ACTION,
	CONSTRAINT ue_Cuenta_fk FOREIGN KEY (codCuenta) REFERENCES Cuenta(codCuenta) ON DELETE NO ACTION,

	CONSTRAINT ue_pk PRIMARY KEY (codUltimoEnvio)
);

CREATE TABLE Canal(
	codBanco INTEGER,
	codCanal INTEGER,
	cabloqueado BOOLEAN DEFAULT 0,
	codUltimoEnvio INTEGER DEFAULT NULL,
	CONSTRAINT me_codUltimoEnvio_fk FOREIGN KEY (codUltimoEnvio) REFERENCES UltimoEnvio(codUltimoEnvio) ON DELETE CASCADE,
	CONSTRAINT ca_pk PRIMARY KEY (codBanco,codCanal)
);




-- Estados del banco

INSERT INTO EstadoBanco VALUES(1,'Abierta');
INSERT INTO EstadoBanco VALUES(2,'Cerrada');
INSERT INTO EstadoBanco VALUES(3,'Trafico detenido');
INSERT INTO EstadoBanco VALUES(4,'En recuperacion');

-- Bancos
INSERT INTO Banco(codBanco,codEBanco,bapuerto,baip,bamaxCanales) VALUES(1,1,80,'127.0.0.1',5);
INSERT INTO Banco(codBanco,codEBanco,bapuerto,baip,bamaxCanales) VALUES(2,1,80,'127.0.0.1',5);
INSERT INTO Banco(codBanco,codEBanco,bapuerto,baip,bamaxCanales) VALUES(3,2,80,'127.0.0.1',2);
INSERT INTO Banco(codBanco,codEBanco,bapuerto,baip,bamaxCanales) VALUES(4,1,80,'127.0.0.1',2);

-- Tarjetas

INSERT INTO Tarjeta VALUES ('pastor42 01',0);
INSERT INTO Tarjeta VALUES ('pastor42 02',0);
INSERT INTO Tarjeta VALUES ('pastor42 03',0);
INSERT INTO Tarjeta VALUES ('pastor42 04',0);
INSERT INTO Tarjeta VALUES ('pastor42 05',0);


-- Cuentas

INSERT INTO Cuenta(codCuenta) VALUES (0000);
INSERT INTO Cuenta(codCuenta) VALUES (0001);
INSERT INTO Cuenta(codCuenta) VALUES (0002);
INSERT INTO Cuenta(codCuenta) VALUES (0003);
INSERT INTO Cuenta(codCuenta) VALUES (0005);
INSERT INTO Cuenta(codCuenta) VALUES (0010);


-- CuentaTarjeta
INSERT INTO CuentaTarjeta(codTarjeta,cunum,codCuenta) VALUES ('pastor42 01',1,0000);
INSERT INTO CuentaTarjeta(codTarjeta,cunum,codCuenta) VALUES ('pastor42 01',2,0001);
INSERT INTO CuentaTarjeta(codTarjeta,cunum,codCuenta) VALUES ('pastor42 02',1,0002);	
INSERT INTO CuentaTarjeta(codTarjeta,cunum,codCuenta) VALUES ('pastor42 02',2,0003);
INSERT INTO CuentaTarjeta(codTarjeta,cunum,codCuenta) VALUES ('pastor42 02',3,0005);
INSERT INTO CuentaTarjeta(codTarjeta,cunum,codCuenta) VALUES ('pastor42 03',1,0010);

-- Tipos de movimento.

INSERT INTO TipoMovimiento VALUES(10,'Reintegro');
INSERT INTO TipoMovimiento VALUES(11,'Transpaso emitido');
INSERT INTO TipoMovimiento VALUES(12,'Transpaso recibido');
INSERT INTO TipoMovimiento VALUES(13,'Pago recibo');
INSERT INTO TipoMovimiento VALUES(50,'Abono');
INSERT INTO TipoMovimiento VALUES(51,'Cobro de cheque');
INSERT INTO TipoMovimiento VALUES(99,'Otros');

SELECT codMovimiento,moimporte,mofecha,codTMovimiento FROM Movimiento WHERE ((codCuentaOrig = 2) || (codCuentaDest = 2));

-- Movimientos

INSERT INTO Movimiento(codTMovimiento,codCuentaOrig,codCuentaDest,moimporte,mooffline,mofecha,codBanco) 
VALUES (10,0000,0001,50,0,STR_TO_DATE('05/01/2010', '%m/%d/%Y'),1);

INSERT INTO Movimiento(codTMovimiento,codCuentaOrig,codCuentaDest,moimporte,mooffline,mofecha,codBanco) 
VALUES (11,0000,0001,10,0,STR_TO_DATE('05/01/2010', '%m/%d/%Y'),1);

INSERT INTO Movimiento(codTMovimiento,codCuentaOrig,codCuentaDest,moimporte,mooffline,mofecha,codBanco) 
VALUES (50,0000,0001,20,1,STR_TO_DATE('05/04/2010', '%m/%d/%Y'),1);

INSERT INTO Movimiento(codTMovimiento,codCuentaOrig,codCuentaDest,moimporte,mooffline,mofecha,codBanco) 
VALUES (51,0000,0001,10,0,STR_TO_DATE('04/01/2011', '%m/%d/%Y'),1);

INSERT INTO Movimiento(codTMovimiento,codCuentaOrig,codCuentaDest,moimporte,mooffline,mofecha,codBanco) 
VALUES (51,0003,0005,10,0,STR_TO_DATE('05/02/2010', '%m/%d/%Y'),1);


INSERT INTO Movimiento(codTMovimiento,codCuentaOrig,codCuentaDest,moimporte,mooffline,mofecha,codBanco) 
VALUES(null,null,null,null,null,null,null);





























