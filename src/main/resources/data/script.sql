SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

SET search_path = public, pg_catalog;

DROP SCHEMA IF EXISTS public CASCADE;

--
-- Name: public; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO postgres;

--
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: postgres
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;


CREATE EXTENSION tablefunc;

-- -----------------------------------------------------
-- Table Profession
-- -----------------------------------------------------
CREATE TABLE profession (
  id INT NOT NULL,
  libelle VARCHAR(45) NULL,
  code VARCHAR(45) NULL
);

ALTER TABLE profession OWNER TO postgres;

CREATE SEQUENCE profession_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE profession_id_seq OWNER TO postgres;
ALTER SEQUENCE profession_id_seq OWNED BY profession.id;
ALTER TABLE ONLY profession ALTER COLUMN id SET DEFAULT nextval('profession_id_seq'::regclass);
SELECT pg_catalog.setval('profession_id_seq', 1, false);
ALTER TABLE ONLY profession ADD CONSTRAINT profession_pkey PRIMARY KEY (id);
ALTER TABLE ONLY profession
    ADD CONSTRAINT uk_023bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);

-- -----------------------------------------------------
-- Table Role
-- -----------------------------------------------------
CREATE TABLE role (
  id INT NOT NULL,
  libelle VARCHAR(45) NULL,
  code VARCHAR(45) NULL
);

ALTER TABLE role OWNER TO postgres;

CREATE SEQUENCE role_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE role_id_seq OWNER TO postgres;
ALTER SEQUENCE role_id_seq OWNED BY role.id;
ALTER TABLE ONLY role ALTER COLUMN id SET DEFAULT nextval('role_id_seq'::regclass);
SELECT pg_catalog.setval('role_id_seq', 1, false);
ALTER TABLE ONLY role ADD CONSTRAINT role_pkey PRIMARY KEY (id);
ALTER TABLE ONLY role
    ADD CONSTRAINT uk_123bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);

-- -----------------------------------------------------
-- Table Faculte
-- -----------------------------------------------------
CREATE TABLE faculte (
  id INT NOT NULL,
  libelle VARCHAR(45) NULL,
  code VARCHAR(45) NULL
);

ALTER TABLE faculte OWNER TO postgres;

CREATE SEQUENCE faculte_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE faculte_id_seq OWNER TO postgres;
ALTER SEQUENCE faculte_id_seq OWNED BY faculte.id;
ALTER TABLE ONLY faculte ALTER COLUMN id SET DEFAULT nextval('faculte_id_seq'::regclass);
SELECT pg_catalog.setval('faculte_id_seq', 1, false);
ALTER TABLE ONLY faculte ADD CONSTRAINT faculte_pkey PRIMARY KEY (id);
ALTER TABLE ONLY faculte
    ADD CONSTRAINT uk_223bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);


-- -----------------------------------------------------
-- Table Cycle
-- -----------------------------------------------------
CREATE TABLE cycle (
  id INT NOT NULL,
  cycle INT NULL,
  code VARCHAR(45) NULL
);

ALTER TABLE cycle OWNER TO postgres;

CREATE SEQUENCE cycle_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE cycle_id_seq OWNER TO postgres;
ALTER SEQUENCE cycle_id_seq OWNED BY cycle.id;
ALTER TABLE ONLY cycle ALTER COLUMN id SET DEFAULT nextval('cycle_id_seq'::regclass);
SELECT pg_catalog.setval('cycle_id_seq', 1, false);
ALTER TABLE ONLY cycle ADD CONSTRAINT cycle_pkey PRIMARY KEY (id);
ALTER TABLE ONLY cycle
    ADD CONSTRAINT uk_323bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);


-- -----------------------------------------------------
-- Table Annee
-- -----------------------------------------------------
CREATE TABLE annee (
  id INT NOT NULL,
  date_deb DATE NULL,
  date_fin DATE NULL,
  annee INT NULL
);

ALTER TABLE annee OWNER TO postgres;

CREATE SEQUENCE annee_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE annee_id_seq OWNER TO postgres;
ALTER SEQUENCE annee_id_seq OWNED BY annee.id;
ALTER TABLE ONLY annee ALTER COLUMN id SET DEFAULT nextval('annee_id_seq'::regclass);
SELECT pg_catalog.setval('annee_id_seq', 1, false);
ALTER TABLE ONLY annee ADD CONSTRAINT annee_pkey PRIMARY KEY (id);

-- -----------------------------------------------------
-- Table UE
-- -----------------------------------------------------
CREATE TABLE ue (
  id INT NOT NULL,
  code VARCHAR(45) NULL,
  libelle VARCHAR(45) NULL
);

ALTER TABLE ue OWNER TO postgres;

CREATE SEQUENCE ue_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE ue_id_seq OWNER TO postgres;
ALTER SEQUENCE ue_id_seq OWNED BY ue.id;
ALTER TABLE ONLY ue ALTER COLUMN id SET DEFAULT nextval('ue_id_seq'::regclass);
SELECT pg_catalog.setval('ue_id_seq', 1, false);
ALTER TABLE ONLY ue ADD CONSTRAINT ue_pkey PRIMARY KEY (id);
ALTER TABLE ONLY ue
    ADD CONSTRAINT uk_423bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);

-- -----------------------------------------------------
-- Table Coefficient
-- -----------------------------------------------------
CREATE TABLE coefficient (
  id INT NOT NULL,
  coeff INT NULL,
  code VARCHAR(45) NULL
);

ALTER TABLE coefficient OWNER TO postgres;

CREATE SEQUENCE coefficient_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE coefficient_id_seq OWNER TO postgres;
ALTER SEQUENCE coefficient_id_seq OWNED BY coefficient.id;
ALTER TABLE ONLY coefficient ALTER COLUMN id SET DEFAULT nextval('coefficient_id_seq'::regclass);
SELECT pg_catalog.setval('coefficient_id_seq', 1, false);
ALTER TABLE ONLY coefficient ADD CONSTRAINT coefficient_pkey PRIMARY KEY (id);
ALTER TABLE ONLY coefficient
    ADD CONSTRAINT uk_523bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);


-- -----------------------------------------------------
-- Table UserDetails
-- -----------------------------------------------------
CREATE TABLE user_details (
  id INT NOT NULL,
  nom VARCHAR(45) NULL,
  prenom VARCHAR(45) NULL,
  adresse VARCHAR(45) NULL,
  telephone VARCHAR(45) NULL,
  email VARCHAR(45) NULL,
  linked_profession INT NOT NULL
);

ALTER TABLE user_details OWNER TO postgres;

CREATE SEQUENCE user_details_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE user_details_id_seq OWNER TO postgres;
ALTER SEQUENCE user_details_id_seq OWNED BY user_details.id;
ALTER TABLE ONLY user_details ALTER COLUMN id SET DEFAULT nextval('user_details_id_seq'::regclass);
SELECT pg_catalog.setval('user_details_id_seq', 1, false);
ALTER TABLE ONLY user_details ADD CONSTRAINT user_details_pkey PRIMARY KEY (id);

ALTER TABLE ONLY user_details
    ADD CONSTRAINT b1254rh7ym0ubar67dzt3c8t13ha FOREIGN KEY (linked_profession) REFERENCES profession(id);



-- -----------------------------------------------------
-- Table Account
-- -----------------------------------------------------
CREATE TABLE account (
  id INT NOT NULL,
  login VARCHAR(45) NULL,
  password VARCHAR(45) NULL,
  linked_user_details INT NOT NULL,
  linked_role INT NOT NULL 
);

ALTER TABLE account OWNER TO postgres;

CREATE SEQUENCE account_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE account_id_seq OWNER TO postgres;
ALTER SEQUENCE account_id_seq OWNED BY account.id;
ALTER TABLE ONLY account ALTER COLUMN id SET DEFAULT nextval('account_id_seq'::regclass);
SELECT pg_catalog.setval('account_id_seq', 1, false);
ALTER TABLE ONLY account ADD CONSTRAINT account_pkey PRIMARY KEY (id);

ALTER TABLE ONLY account
    ADD CONSTRAINT b1254rh7ym0ubar67czt3c8t13ha FOREIGN KEY (linked_user_details) REFERENCES user_details(id);

ALTER TABLE ONLY account
    ADD CONSTRAINT b1254rh7ym0ubar67czt3c8t13hb FOREIGN KEY (linked_role) REFERENCES role(id);



-- -----------------------------------------------------
-- Table Departement
-- -----------------------------------------------------
CREATE TABLE departement (
  id INT NOT NULL,
  libelle VARCHAR(45) NULL,
  code VARCHAR(45) NULL,
  linked_faculte INT NOT NULL
);

ALTER TABLE departement OWNER TO postgres;

CREATE SEQUENCE departement_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE departement_id_seq OWNER TO postgres;
ALTER SEQUENCE departement_id_seq OWNED BY departement.id;
ALTER TABLE ONLY departement ALTER COLUMN id SET DEFAULT nextval('departement_id_seq'::regclass);
SELECT pg_catalog.setval('departement_id_seq', 1, false);
ALTER TABLE ONLY departement ADD CONSTRAINT departement_pkey PRIMARY KEY (id);
ALTER TABLE ONLY departement
    ADD CONSTRAINT uk_623bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);

ALTER TABLE ONLY departement
    ADD CONSTRAINT b1254rh7ym0ubar67czt3c8t13za FOREIGN KEY (linked_faculte) REFERENCES faculte(id);

-- -----------------------------------------------------
-- Table Classe
-- -----------------------------------------------------
CREATE TABLE classe (
  id INT NOT NULL,
  libelle VARCHAR(45) NULL,
  code VARCHAR(45) NULL,
  linked_departement INT NOT NULL,
  linked_cycle INT NOT NULL
);

ALTER TABLE classe OWNER TO postgres;

CREATE SEQUENCE classe_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE classe_id_seq OWNER TO postgres;
ALTER SEQUENCE classe_id_seq OWNED BY classe.id;
ALTER TABLE ONLY classe ALTER COLUMN id SET DEFAULT nextval('classe_id_seq'::regclass);
SELECT pg_catalog.setval('classe_id_seq', 1, false);
ALTER TABLE ONLY classe ADD CONSTRAINT classe_pkey PRIMARY KEY (id);
ALTER TABLE ONLY classe
    ADD CONSTRAINT uk_723bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);

ALTER TABLE ONLY classe
    ADD CONSTRAINT b1254rh7ym0ubar67czs4c8t13ha FOREIGN KEY (linked_departement) REFERENCES departement(id);
ALTER TABLE ONLY classe
    ADD CONSTRAINT b1254rh7ym0erar67czs4c8t13ha FOREIGN KEY (linked_cycle) REFERENCES cycle(id);    

-- -----------------------------------------------------
-- Table Etudiant
-- -----------------------------------------------------
CREATE TABLE etudiant (
  id INT NOT NULL,
  nom VARCHAR(45) NULL,
  prenom VARCHAR(45) NULL,
  linked_classe INT NOT NULL
);

ALTER TABLE etudiant OWNER TO postgres;

CREATE SEQUENCE etudiant_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE etudiant_id_seq OWNER TO postgres;
ALTER SEQUENCE etudiant_id_seq OWNED BY etudiant.id;
ALTER TABLE ONLY etudiant ALTER COLUMN id SET DEFAULT nextval('etudiant_id_seq'::regclass);
SELECT pg_catalog.setval('etudiant_id_seq', 1, false);
ALTER TABLE ONLY etudiant ADD CONSTRAINT etudiant_pkey PRIMARY KEY (id);

ALTER TABLE ONLY etudiant
    ADD CONSTRAINT b1254rh7ym0ubar67czs4c9r03ha FOREIGN KEY (linked_classe) REFERENCES classe(id);

-- -----------------------------------------------------
-- Table Semestre
-- -----------------------------------------------------
CREATE TABLE semestre (
  id INT NOT NULL,
  date_debut DATE NULL,
  date_fin DATE NULL,
  semestre INT NULL,
  linked_annee INT NOT NULL
);

ALTER TABLE semestre OWNER TO postgres;

CREATE SEQUENCE semestre_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE semestre_id_seq OWNER TO postgres;
ALTER SEQUENCE semestre_id_seq OWNED BY semestre.id;
ALTER TABLE ONLY semestre ALTER COLUMN id SET DEFAULT nextval('semestre_id_seq'::regclass);
SELECT pg_catalog.setval('semestre_id_seq', 1, false);
ALTER TABLE ONLY semestre ADD CONSTRAINT semestre_pkey PRIMARY KEY (id);

ALTER TABLE ONLY semestre
    ADD CONSTRAINT b1254rh7zq0ubar67czs4c9r03ha FOREIGN KEY (linked_annee) REFERENCES annee(id);


-- -----------------------------------------------------
-- Table Matiere
-- -----------------------------------------------------
CREATE TABLE matiere (
  id INT NOT NULL,
  libelle VARCHAR(45) NULL,
  code VARCHAR(45) NULL,
  linked_professeur INT NOT NULL,
  linked_periode INT NOT NULL,
  linked_ue INT NOT NULL
);

ALTER TABLE matiere OWNER TO postgres;

CREATE SEQUENCE matiere_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE matiere_id_seq OWNER TO postgres;
ALTER SEQUENCE matiere_id_seq OWNED BY matiere.id;
ALTER TABLE ONLY matiere ALTER COLUMN id SET DEFAULT nextval('matiere_id_seq'::regclass);
SELECT pg_catalog.setval('matiere_id_seq', 1, false);
ALTER TABLE ONLY matiere ADD CONSTRAINT matiere_pkey PRIMARY KEY (id);
ALTER TABLE ONLY matiere
    ADD CONSTRAINT uk_823bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);

ALTER TABLE ONLY matiere
    ADD CONSTRAINT b1234rh1zq0ubar67czs4c9r03ha FOREIGN KEY (linked_professeur) REFERENCES user_details(id);
ALTER TABLE ONLY matiere
    ADD CONSTRAINT b1234rh1zq0ubar67czs4c9r02qa FOREIGN KEY (linked_periode) REFERENCES semestre(id);
ALTER TABLE ONLY matiere
    ADD CONSTRAINT b1234rh1zq0ubar39czs4c9r02qa FOREIGN KEY (linked_ue) REFERENCES ue(id);


-- -----------------------------------------------------
-- Table Evaluation
-- -----------------------------------------------------
CREATE TABLE evaluation (
  id INT NOT NULL,
  type VARCHAR(45) NULL,
  linked_coefficient INT NOT NULL,
  linked_matiere INT NOT NULL
);

ALTER TABLE evaluation OWNER TO postgres;

CREATE SEQUENCE evaluation_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE evaluation_id_seq OWNER TO postgres;
ALTER SEQUENCE evaluation_id_seq OWNED BY evaluation.id;
ALTER TABLE ONLY evaluation ALTER COLUMN id SET DEFAULT nextval('evaluation_id_seq'::regclass);
SELECT pg_catalog.setval('evaluation_id_seq', 1, false);
ALTER TABLE ONLY evaluation ADD CONSTRAINT evaluation_pkey PRIMARY KEY (id);


ALTER TABLE ONLY evaluation
    ADD CONSTRAINT b1234rh1zq0ubar39sqs4c9r02qa FOREIGN KEY (linked_coefficient) REFERENCES coefficient(id);
ALTER TABLE ONLY evaluation
    ADD CONSTRAINT b1234rh1zq4ybar39sqs4c9r02qa FOREIGN KEY (linked_matiere) REFERENCES matiere(id);

-- -----------------------------------------------------
-- Table Note
-- -----------------------------------------------------
CREATE TABLE note (
  id INT NOT NULL,
  note INT NULL,
  linked_professeur INT NOT NULL,
  linked_etudiant INT NOT NULL,
  linked_evaluation INT NOT NULL
);

ALTER TABLE note OWNER TO postgres;

CREATE SEQUENCE note_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE note_id_seq OWNER TO postgres;
ALTER SEQUENCE note_id_seq OWNED BY note.id;
ALTER TABLE ONLY note ALTER COLUMN id SET DEFAULT nextval('note_id_seq'::regclass);
SELECT pg_catalog.setval('note_id_seq', 1, false);
ALTER TABLE ONLY note ADD CONSTRAINT note_pkey PRIMARY KEY (id);


ALTER TABLE ONLY note
    ADD CONSTRAINT b1234rh1zq4ybar39sqs4c9r02zq FOREIGN KEY (linked_professeur) REFERENCES user_details(id);
ALTER TABLE ONLY note
    ADD CONSTRAINT b1234rh1zq4ybar39sqs4c9r02rt FOREIGN KEY (linked_etudiant) REFERENCES etudiant(id);
ALTER TABLE ONLY note
    ADD CONSTRAINT b1234rh1zq4ybar39sqs4c9r02yu FOREIGN KEY (linked_evaluation) REFERENCES evaluation(id);

-- -----------------------------------------------------
-- Table Credit
-- -----------------------------------------------------
CREATE TABLE credit (
  id INT NOT NULL,
  credit INT NULL,
  code VARCHAR(45) NULL,
  linked_matiere INT NOT NULL,
  linked_classe INT NOT NULL
);

ALTER TABLE credit OWNER TO postgres;

CREATE SEQUENCE credit_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE credit_id_seq OWNER TO postgres;
ALTER SEQUENCE credit_id_seq OWNED BY credit.id;
ALTER TABLE ONLY credit ALTER COLUMN id SET DEFAULT nextval('credit_id_seq'::regclass);
SELECT pg_catalog.setval('credit_id_seq', 1, false);
ALTER TABLE ONLY credit ADD CONSTRAINT credit_pkey PRIMARY KEY (id);
ALTER TABLE ONLY credit
    ADD CONSTRAINT uk_923bvjbrcnfgh546gpbrvgr18jncd UNIQUE (code);

ALTER TABLE ONLY credit
    ADD CONSTRAINT b1234rh1zq4yapp39sqs4c9r02yu FOREIGN KEY (linked_classe) REFERENCES classe(id);
ALTER TABLE ONLY credit
    ADD CONSTRAINT b1234rh1zq4wsxr39sqs4c9r02yu FOREIGN KEY (linked_matiere) REFERENCES matiere(id);
