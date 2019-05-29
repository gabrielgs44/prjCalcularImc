package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaMasculino;

public class CriancaMasculinoTeste5 {
    CriancaMasculino criMasc;

    @BeforeEach
    public void setup() {
        criMasc = new CriancaMasculino();
    }

    @AfterEach
    public void tearDown() {
        criMasc = null;
    }

    // idade 18
    @Test
    public void testarBaixoPeso18() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(18.90, 18));
    }

    @Test
    public void testarPesoNormal18() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(18.91, 18));
    }

    @Test
    public void testarSobrepeso18() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(25.61, 18));
    }

    @Test
    public void testarObesidade18() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(28.91, 18));
    }

    // idade 19
    @Test
    public void testarBaixoPeso19() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(19.40, 19));
    }

    @Test
    public void testarPesoNormal19() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(19.41, 19));
    }

    @Test
    public void testarSobrepeso19() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(26.21, 19));
    }

    @Test
    public void testarObesidade19() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(29.71, 19));
    }

    // idade20
    @Test
    public void testarBaixoPeso20() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(19.90, 20));
    }

    @Test
    public void testarPesoNormal20() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(19.91, 20));
    }

    @Test
    public void testarSobrepeso20() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(27.01, 20));
    }

    @Test
    public void testarObesidade20() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(30.41, 20));
    }
}
