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

    // idade 3
    @Test
    public void testarBaixoPeso3() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(14.6, 3));
    }

    @Test
    public void testarPesoNormal3() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(14.61, 3));
    }

    @Test
    public void testarSobrepeso3() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(17.41, 3));
    }

    @Test
    public void testarObesidade3() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(18.21, 3));
    }

    // idade4
    @Test
    public void testarBaixoPeso4() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(14.40, 4));
    }

    @Test
    public void testarPesoNormal4() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(14.41, 4));
    }

    @Test
    public void testarSobrepeso4() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(17.01, 4));
    }

    @Test
    public void testarObesidade4() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(17.81, 4));
    }

    // idade5
    @Test
    public void testarBaixoPeso5() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(14.20, 5));
    }

    @Test
    public void testarPesoNormal5() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(14.21, 5));
    }

    @Test
    public void testarSobrepeso5() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(16.81, 5));
    }

    @Test
    public void testarObesidade5() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(18.01, 5));
    }
}
