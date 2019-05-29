package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaMasculino;

public class CriancaMasculinoTeste3 {
    CriancaMasculino criMasc;

    @BeforeEach
    public void setup() {
        criMasc = new CriancaMasculino();
    }

    @AfterEach
    public void tearDown() {
        criMasc = null;
    }

    // idade 10
    @Test
    public void testarBaixoPeso10() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(14.80, 10));
    }

    @Test
    public void testarPesoNormal10() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(14.81, 10));
    }

    @Test
    public void testarSobrepeso10() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(19.41, 10));
    }

    @Test
    public void testarObesidade10() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(22.01, 10));
    }

    // idade 11
    @Test
    public void testarBaixoPeso11() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(15.00, 11));
    }

    @Test
    public void testarPesoNormal11() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(15.01, 11));
    }

    @Test
    public void testarSobrepeso11() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(20.21, 11));
    }

    @Test
    public void testarObesidade11() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(23.21, 11));
    }

    // idade12
    @Test
    public void testarBaixoPeso12() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(15.40, 12));
    }

    @Test
    public void testarPesoNormal12() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(15.41, 12));
    }

    @Test
    public void testarSobrepeso12() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(21.01, 12));
    }

    @Test
    public void testarObesidade12() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(24.01, 12));
    }

    // idade13
    @Test
    public void testarBaixoPeso13() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(16.00, 13));
    }

    @Test
    public void testarPesoNormal13() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(16.01, 13));
    }

    @Test
    public void testarSobrepeso13() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(21.81, 13));
    }

    @Test
    public void testarObesidade13() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(25.01, 13));
    }
}
