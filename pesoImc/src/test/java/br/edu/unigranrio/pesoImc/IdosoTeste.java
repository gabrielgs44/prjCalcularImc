package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IdosoTeste {
    Idoso idoso;
    
    @BeforeEach
    public void setup() {
        idoso = new Idoso();
    }
    
    @AfterEach
    public void tearDown() {
        idoso = null;
    }
    
    @Test
    public void testarResultadoFemininoBaixoPeso() {
        Assertions.assertEquals("Baixo peso", idoso.calcularResultado(idoso.calcularImc((float)60.0, (float)1.70), 'f'));
    }
    @Test
    public void testarResultadoFemininoPesoNormal() {
        Assertions.assertEquals("Peso normal", idoso.calcularResultado(idoso.calcularImc((float)64.0, (float)1.70), 'f'));
    }
    @Test
    public void testarResultadoFemininoSobrePeso() {
        Assertions.assertEquals("Sobrepeso", idoso.calcularResultado(idoso.calcularImc((float)78.2, (float)1.70), 'f'));
    }
    @Test
    public void testarResultadoFemininoObesidadeI() {
        Assertions.assertEquals("Obesidade grau I", idoso.calcularResultado(idoso.calcularImc((float)93.0, (float)1.70), 'f'));
    }
    @Test
    public void testarResultadoFemininoObesidadeII() {
        Assertions.assertEquals("Obesidade grau II", idoso.calcularResultado(idoso.calcularImc((float)107.0, (float)1.70), 'f'));
    }
    @Test
    public void testarResultadoFemininoObesidadeIII() {
        Assertions.assertEquals("Obesidade grau III (obesidade mórbida)", idoso.calcularResultado(idoso.calcularImc((float)121.4, (float)1.70), 'f'));
    }
    
    //Teste do sexo Masculino
    
    @Test
    public void testarResultadoMascBaixoPeso() {
        Assertions.assertEquals("Baixo peso", idoso.calcularResultado(idoso.calcularImc((float)60.0, (float)1.70), 'm'));
    }
    @Test
    public void testarResultadoMascPesoNormal() {
        Assertions.assertEquals("Peso normal", idoso.calcularResultado(idoso.calcularImc((float)64.0, (float)1.70), 'm'));
    }
    @Test
    public void testarResultadoMascSobrePeso() {
        Assertions.assertEquals("Sobrepeso", idoso.calcularResultado(idoso.calcularImc((float)78.2, (float)1.70), 'm'));
    }
    @Test
    public void testarResultadoMascObesidadeI() {
        Assertions.assertEquals("Obesidade grau I", idoso.calcularResultado(idoso.calcularImc((float)93.0, (float)1.70), 'm'));
    }
    @Test
    public void testarResultadoMascObesidadeII() {
        Assertions.assertEquals("Obesidade grau II", idoso.calcularResultado(idoso.calcularImc((float)107.0, (float)1.70), 'm'));
    }
    @Test
    public void testarResultadoMascObesidadeIII() {
        Assertions.assertEquals("Obesidade grau III (obesidade mórbida)", idoso.calcularResultado(idoso.calcularImc((float)121.4, (float)1.70), 'm'));
    }
    
}
