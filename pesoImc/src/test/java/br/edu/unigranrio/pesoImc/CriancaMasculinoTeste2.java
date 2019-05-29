package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaMasculino;

public class CriancaMasculinoTeste2 {
    CriancaMasculino criMasc;

    @BeforeEach
    public void setup() {
        criMasc = new CriancaMasculino();
    }

    @AfterEach
    public void tearDown() {
        criMasc = null;
    }

    // idade 6
    @Test
    public void testarBaixoPeso6() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(14.0, 6));
    }

    @Test
    public void testarPesoNormal6() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(14.01, 6));
    }

    @Test
    public void testarSobrepeso6() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(17.01, 6));
    }

    @Test
    public void testarObesidade6() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(18.41, 6));
    }

    // idade 7
    @Test
    public void testarBaixoPeso7() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(14.0, 7));
    }

    @Test
    public void testarPesoNormal7() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(14.01, 7));
    }

    @Test
    public void testarSobrepeso7() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(17.41, 7));
    }

    @Test
    public void testarObesidade7() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(19.01, 7));
    }

    // idade8
    @Test
    public void testarBaixoPeso8() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(14.20, 8));
    }

    @Test
    public void testarPesoNormal8() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(14.21, 8));
    }

    @Test
    public void testarSobrepeso8() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(18.01, 8));
    }

    @Test
    public void testarObesidade8() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(20.01, 8));
    }

    // idade9
    @Test
    public void testarBaixoPeso5() {
        Assertions.assertEquals("Baixo peso", criMasc.calcularPercentil(14.40, 9));
    }

    @Test
    public void testarPesoNormal5() {
        Assertions.assertEquals("Peso normal", criMasc.calcularPercentil(14.41, 9));
    }

    @Test
    public void testarSobrepeso5() {
        Assertions.assertEquals("Sobrepeso", criMasc.calcularPercentil(18.61, 9));
    }

    @Test
    public void testarObesidade5() {
        Assertions.assertEquals("Obesidade", criMasc.calcularPercentil(21.01, 9));
    }
}
