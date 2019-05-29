package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaFeminino;

public class CriancaFemininoTeste4 {
    CriancaFeminino criFemi;

    @BeforeEach
    public void setup() {
        criFemi = new CriancaFeminino();
    }

    @AfterEach
    public void tearDown() {
        criFemi = null;
    }

    // idade 14
    @Test
    public void testarBaixoPeso14() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(16.43, 14));
    }

    @Test
    public void testarPesoNormal14() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(16.44, 14));
    }

    @Test
    public void testarSobrepeso14() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(23.31, 14));
    }

    @Test
    public void testarObesidade14() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(27.41, 14));
    }

    // idade 15
    @Test
    public void testarBaixoPeso15() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(16.95, 15));
    }

    @Test
    public void testarPesoNormal15() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(16.96, 15));
    }

    @Test
    public void testarSobrepeso15() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(24.01, 15));
    }

    @Test
    public void testarObesidade15() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(28.04, 15));
    }

    // idade16
    @Test
    public void testarBaixoPeso16() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(17.40, 16));
    }

    @Test
    public void testarPesoNormal16() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(17.41, 16));
    }

    @Test
    public void testarSobrepeso16() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(26.61, 16));
    }

    @Test
    public void testarObesidade16() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(28.81, 16));
    }

    // idade17
    @Test
    public void testarBaixoPeso17() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(17.90, 17));
    }

    @Test
    public void testarPesoNormal17() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(17.91, 17));
    }

    @Test
    public void testarSobrepeso17() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(25.21, 17));
    }

    @Test
    public void testarObesidade17() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(29.61, 17));
    }
}
