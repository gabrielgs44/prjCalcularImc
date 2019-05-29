package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaFeminino;

public class CriancaFemininoTeste3 {
    CriancaFeminino criFemi;

    @BeforeEach
    public void setup() {
        criFemi = new CriancaFeminino();
    }

    @AfterEach
    public void tearDown() {
        criFemi = null;
    }

    // idade 10
    @Test
    public void testarBaixoPeso10() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(14.40, 10));
    }

    @Test
    public void testarPesoNormal10() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(14.41, 10));
    }

    @Test
    public void testarSobrepeso10() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(20.01, 10));
    }

    @Test
    public void testarObesidade10() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(28.97, 10));
    }

    // idade 11
    @Test
    public void testarBaixoPeso11() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(15.00, 11));
    }

    @Test
    public void testarPesoNormal11() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(15.01, 11));
    }

    @Test
    public void testarSobrepeso11() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(20.81, 11));
    }

    @Test
    public void testarObesidade11() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(24.06, 11));
    }

    // idade12
    @Test
    public void testarBaixoPeso12() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(15.40, 12));
    }

    @Test
    public void testarPesoNormal12() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(15.41, 12));
    }

    @Test
    public void testarSobrepeso12() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(21.81, 12));
    }

    @Test
    public void testarObesidade12() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(25.11, 12));
    }

    // idade13
    @Test
    public void testarBaixoPeso13() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(15.90, 13));
    }

    @Test
    public void testarPesoNormal13() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(15.91, 13));
    }

    @Test
    public void testarSobrepeso13() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(22.46, 13));
    }

    @Test
    public void testarObesidade13() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(26.21, 13));
    }
}
