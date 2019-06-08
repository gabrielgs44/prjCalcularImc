package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaFeminino;

public class CriancaFemininoTeste1 {
    CriancaFeminino criFemi;

    @BeforeEach
    public void setup() {
        criFemi = new CriancaFeminino();
    }

    @AfterEach
    public void tearDown() {
        criFemi = null;
    }

    // idade 2 e 1
    @Test
    public void testarBaixoPeso2() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(15.0, 2));
    }

    @Test
    public void testarPesoNormal2() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(15.01, 2));
    }

    @Test
    public void testarSobrepeso2() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(18.01, 2));
    }

    @Test
    public void testarObesidade2() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(19.21, 2));
    }

    // idade 3
    @Test
    public void testarBaixoPeso3() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(14.60, 3));
    }

    @Test
    public void testarPesoNormal3() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(14.61, 3));
    }

    @Test
    public void testarSobrepeso3() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(17.21, 3));
    }

    @Test
    public void testarObesidade3() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(18.41, 3));
    }

    // idade4
    @Test
    public void testarBaixoPeso4() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(14.15, 4));
    }

    @Test
    public void testarPesoNormal4() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(14.16, 4));
    }

    @Test
    public void testarSobrepeso4() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(16.81, 4));
    }

    @Test
    public void testarObesidade4() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(18.01, 4));
    }

    // idade5
    @Test
    public void testarBaixoPeso5() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(13.80, 5));
    }

    @Test
    public void testarPesoNormal5() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(13.81, 5));
    }

    @Test
    public void testarSobrepeso5() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(17.41, 5));
    }

    @Test
    public void testarObesidade5() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(18.61, 5));
    }
}
