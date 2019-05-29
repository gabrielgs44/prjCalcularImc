package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaMasculino;

public class CriancaMasculinaTeste4 {
    CriancaMasculino criMasc;

    @BeforeEach
    public void setup() {
        criMasc = new CriancaMasculino();
    }

    @AfterEach
    public void tearDown() {
        criMasc = null;
    }

    // idade 14
    @Test
    public void testarBaixoPeso14() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(16.40, 14));
    }

    @Test
    public void testarPesoNormal14() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(16.41, 14));
    }

    @Test
    public void testarSobrepeso14() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(22.61, 14));
    }

    @Test
    public void testarObesidade14() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(26.01, 14));
    }

    // idade 15
    @Test
    public void testarBaixoPeso15() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(17.00, 15));
    }

    @Test
    public void testarPesoNormal15() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(17.01, 15));
    }

    @Test
    public void testarSobrepeso15() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(23.41, 15));
    }

    @Test
    public void testarObesidade15() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(26.81, 15));
    }

    // idade16
    @Test
    public void testarBaixoPeso16() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(17.80, 16));
    }

    @Test
    public void testarPesoNormal16() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(17.81, 16));
    }

    @Test
    public void testarSobrepeso16() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(24.21, 16));
    }

    @Test
    public void testarObesidade16() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(27.61, 16));
    }

    // idade17
    @Test
    public void testarBaixoPeso17() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(18.40, 17));
    }

    @Test
    public void testarPesoNormal17() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(18.41, 17));
    }

    @Test
    public void testarSobrepeso17() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(25.01, 17));
    }

    @Test
    public void testarObesidade17() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(28.21, 17));
    }
}
