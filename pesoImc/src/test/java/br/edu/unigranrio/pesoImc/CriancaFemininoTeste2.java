package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaFeminino;

public class CriancaFemininoTeste2 {
    CriancaFeminino criFemi;

    @BeforeEach
    public void setup() {
        criFemi = new CriancaFeminino();
    }

    @AfterEach
    public void tearDown() {
        criFemi = null;
    }

    // idade 6
    @Test
    public void testarBaixoPeso6() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(13.80, 6));
    }

    @Test
    public void testarPesoNormal6() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(13.81, 6));
    }

    @Test
    public void testarSobrepeso6() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(17.41, 6));
    }

    @Test
    public void testarObesidade6() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(18.61, 6));
    }

    // idade 7
    @Test
    public void testarBaixoPeso7() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(13.80, 7));
    }

    @Test
    public void testarPesoNormal7() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(13.81, 7));
    }

    @Test
    public void testarSobrepeso7() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(17.61, 7));
    }

    @Test
    public void testarObesidade7() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(19.41, 7));
    }

    // idade8
    @Test
    public void testarBaixoPeso8() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(14.00, 8));
    }

    @Test
    public void testarPesoNormal8() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(14.01, 8));
    }

    @Test
    public void testarSobrepeso8() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(18.21, 8));
    }

    @Test
    public void testarObesidade8() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(20.61, 8));
    }

    // idade9
    @Test
    public void testarBaixoPeso9() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(14.20, 9));
    }

    @Test
    public void testarPesoNormal9() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(14.21, 9));
    }

    @Test
    public void testarSobrepeso9() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(19.11, 9));
    }

    @Test
    public void testarObesidade9() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(21.21, 9));
    }
}
