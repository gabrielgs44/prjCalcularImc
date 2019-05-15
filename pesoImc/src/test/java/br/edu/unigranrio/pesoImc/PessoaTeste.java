package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PessoaTeste {
    Pessoa pessoa;
    
    @BeforeEach
    public void setup(){
        pessoa = new Pessoa();
    }
    @AfterEach
    public void tearDown() {
        pessoa = null;
    }
    
    @Test
    public void testarImcMuitoGrave() {
        Assertions.assertEquals("Baixo peso muito grave", pessoa.calcularResultado(pessoa.calcularImc((float)45.0, (float)1.74)));
    }
    @Test
    public void testaImcGrave() {
        Assertions.assertEquals("Baixo peso grave", pessoa.calcularResultado(pessoa.calcularImc((float)48.5, (float)1.74)));
    }
    @Test
    public void testarImcBaixoPeso() {
        Assertions.assertEquals("Baixo peso", pessoa.calcularResultado(pessoa.calcularImc((float)55.0, (float)1.74)));
    }
    @Test
    public void testarImcPesoNormal() {
        Assertions.assertEquals("Peso normal", pessoa.calcularResultado(pessoa.calcularImc((float)56.5, (float)1.74)));
    }
    @Test
    public void testarImcSobrePeso() {
        Assertions.assertEquals("Sobrepeso", pessoa.calcularResultado(pessoa.calcularImc((float)76.0, (float)1.74)));
    }
    @Test
    public void testarImcObesidadeGrauI() {
        Assertions.assertEquals("Obesidade grau I", pessoa.calcularResultado(pessoa.calcularImc((float)91.0, (float)1.74)));
    }
    @Test
    public void testarImcObesidadeGrauII() {
        Assertions.assertEquals("Obesidade grau II", pessoa.calcularResultado(pessoa.calcularImc((float)106.0, (float)1.74)));
    }
    @Test
    public void testarImcObesidadeGrauMorbida() {
        Assertions.assertEquals("Obesidade grau III (obesidade mórbida)", pessoa.calcularResultado(pessoa.calcularImc((float)121.5, (float)1.74)));
    }
}
