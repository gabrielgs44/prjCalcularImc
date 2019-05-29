package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.CriancaFeminino;

public class CriancaFemininoTeste5 {
    CriancaFeminino criFemi;

    @BeforeEach
    public void setup() {
        criFemi = new CriancaFeminino();
    }

    @AfterEach
    public void tearDown() {
        criFemi = null;
    }

    // idade 18
    @Test
    public void testarBaixoPeso18() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(18.20, 18));
    }

    @Test
    public void testarPesoNormal18() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(18.21, 18));
    }

    @Test
    public void testarSobrepeso18() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(25.61, 18));
    }

    @Test
    public void testarObesidade18() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(30.21, 18));
    }

    // idade 19
    @Test
    public void testarBaixoPeso19() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(18.40, 19));
    }

    @Test
    public void testarPesoNormal19() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(18.41, 19));
    }

    @Test
    public void testarSobrepeso19() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(26.11, 19));
    }

    @Test
    public void testarObesidade19() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(30.99, 19));
    }

    // idade20
    @Test
    public void testarBaixoPeso20() {
        Assertions.assertEquals("Baixo peso", criFemi.calcularPercentil(18.45, 20));
    }

    @Test
    public void testarPesoNormal20() {
        Assertions.assertEquals("Peso normal", criFemi.calcularPercentil(18.46, 20));
    }

    @Test
    public void testarSobrepeso20() {
        Assertions.assertEquals("Sobrepeso", criFemi.calcularPercentil(26.61, 20));
    }

    @Test
    public void testarObesidade20() {
        Assertions.assertEquals("Obesidade", criFemi.calcularPercentil(31.76, 20));
    }

}
