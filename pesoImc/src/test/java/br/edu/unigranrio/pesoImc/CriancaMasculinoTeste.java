package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaMasculino;

public class CriancaMasculinoTeste {
    CriancaMasculino criMasc;

    @BeforeEach
    public void setup() {
        criMasc = new CriancaMasculino();
    }

    @AfterEach
    public void tearDown() {
        criMasc = null;
    }

    // idade 2
    @Test
    public void testarBaixoPeso2() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(15.0, 2));
    }

    @Test
    public void testarPesoNormal2() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(15.10, 2));
    }
    @Test
    public void testarSobrepeso2() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(18.21, 2));
    }
    @Test
    public void testarObesidade2() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(19.21, 2));
    }
}
