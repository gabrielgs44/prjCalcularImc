package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MeninaTeste {
    Menina menina;
    
    @BeforeEach
    public void setup() {
        menina = new Menina();
    }
    
    @AfterEach
    public void tearDown() {
        menina = null;
    }
    
    @Test
    public void testarImcBaixoPeso() {
        Assertions.assertEquals("Baixo Peso", menina.calcularResultado(menina.calcularImc((float)14.9, (float)2.0)));
    }
    @Test
    public void testarImcPesoNormal() {
        Assertions.assertEquals("Peso Normal", menina.calcularResultado(menina.calcularImc((float)15.1, (float)3.0)));
    }
    @Test
    public void testarImcSobrePeso() {
        Assertions.assertEquals("Sobrepeso", menina.calcularResultado(menina.calcularImc((float)19.1, (float)19.0)));
    }
    @Test
    public void testarImcObesidadeGrauI() {
        Assertions.assertEquals("Obesidade", menina.calcularResultado(menina.calcularImc((float)19.3, (float)20.0)));
    }

}
