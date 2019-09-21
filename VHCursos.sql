
CREATE SCHEMA IF NOT EXISTS `VHCursos` DEFAULT CHARACTER SET utf8 ;
USE `VHCursos` ;


CREATE TABLE  `VHCursos`.`Cursos` (
  `idCURSOS` INT NOT NULL AUTO_INCREMENT,
  `codigo` VARCHAR(45) NOT NULL,
  `area` varchar(40) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `cargaHoraria` INT NOT NULL,
  `horarioAulas` TIME NOT NULL,
  `valorCurso` DECIMAL(10,2) NOT NULL,
  `valorMensalidade` DECIMAL(10,2) NOT NULL,
  `numeroVagas` INT NOT NULL,
  PRIMARY KEY (`idCURSOS`));



CREATE TABLE  `VHCursos`.`Instrutores` (
  `idInstrutores` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `cpf` VARCHAR(19) NOT NULL,
  `rg` VARCHAR(11) NOT NULL,
  `dataNascimento` DATE NOT NULL,
  `dataAdmissão` DATE NOT NULL,
  PRIMARY KEY (`idInstrutores`));



CREATE TABLE  `VHCursos`.`Estudantes` (
  `idEstudantes` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `sexo` VARCHAR(45) NULL,
  `idade` INT NULL,
  `RG` VARCHAR(45) NULL,
  `CPF` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEstudantes`));



CREATE TABLE  `VHCursos`.`enderecoEstudante` (
  `idendereço` INT NOT NULL AUTO_INCREMENT,
  `rua` VARCHAR(45) NOT NULL,
  `bairro` VARCHAR(45) NOT NULL,
  `numero` INT NOT NULL,
  `complemento` TEXT NULL,
  `Estudantes_idEstudantes` INT NOT NULL,
  PRIMARY KEY (`idendereço`),
  CONSTRAINT `fk_endereço_Estudantes1`
    FOREIGN KEY (`Estudantes_idEstudantes`)
    REFERENCES `VHCursos`.`Estudantes` (`idEstudantes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE  `VHCursos`.`telefoneInstrutor` (
  `idTelefones` INT NOT NULL AUTO_INCREMENT,
  `TelefonesNumero` VARCHAR(14) NOT NULL,
  `Instrutores_idInstrutores` INT NOT NULL,
  PRIMARY KEY (`idTelefones`),
  CONSTRAINT `fk_Telefones_Instrutores1`
    FOREIGN KEY (`Instrutores_idInstrutores`)
    REFERENCES `VHCursos`.`Instrutores` (`idInstrutores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE `VHCursos`.`Dependentes` (
  `idDependentes` INT NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `Instrutores_idInstrutores` INT NOT NULL,
  `CPF` VARCHAR(45) NOT NULL,
  `RG` VARCHAR(45) NULL,
  `parentesco` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idDependentes`),
  CONSTRAINT `fk_Dependentes_Instrutores1`
    FOREIGN KEY (`Instrutores_idInstrutores`)
    REFERENCES `VHCursos`.`Instrutores` (`idInstrutores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE  `VHCursos`.`telefonesEstudante` (
  `idTelefones` INT NOT NULL,
  `TelefonesNumero` VARCHAR(14) NOT NULL,
  `Estudantes_idEstudantes` INT NOT NULL,
  PRIMARY KEY (`idTelefones`),
  CONSTRAINT `fk_TelefonesEstudanteh_Estudantes1`
    FOREIGN KEY (`Estudantes_idEstudantes`)
    REFERENCES `VHCursos`.`Estudantes` (`idEstudantes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);


CREATE TABLE  `VHCursos`.`enderecoInstrutor` (
  `idendereço` INT NOT NULL AUTO_INCREMENT,
  `rua` VARCHAR(45) NOT NULL,
  `bairro` VARCHAR(45) NOT NULL,
  `numero` INT NOT NULL,
  `complemento` TEXT NULL,
  `Instrutores_idInstrutores` INT NOT NULL,
  PRIMARY KEY (`idendereço`),
  CONSTRAINT `fk_endereço_copy1_Instrutores1`
    FOREIGN KEY (`Instrutores_idInstrutores`)
    REFERENCES `VHCursos`.`Instrutores` (`idInstrutores`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);

