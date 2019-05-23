package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.IdosoMasculino;

public class IdosoMasculinoTeste {
    IdosoMasculino idoMasc;

    @BeforeEach
    public void setup() {
        idoMasc = new IdosoMasculino();
    }

    @AfterEach
    public void tearDown() {
        idoMasc = null;
    }

    @Test
    public void testarBaixoPeso() {
        Assertions.assertEquals("Baixo peso", idoMasc.calcularResultado(idoMasc.calcularImc(66.6, 1.74)));
    }

    @Test
    public void testarPesoNormal() {
        Assertions.assertEquals("Peso normal", idoMasc.calcularResultado(idoMasc.calcularImc(66.61, 1.74)));
    }

    @Test
    public void testarSobrepeso() {
        Assertions.assertEquals("Sobrepeso", idoMasc.calcularResultado(idoMasc.calcularImc(82.05, 1.74)));
    }

    @Test
    public void testarObesidadeI() {
        Assertions.assertEquals("Obesidade grau I", idoMasc.calcularResultado(idoMasc.calcularImc(94.2, 1.74)));
    }

    @Test
    public void testarObesidadeII() {
        Assertions.assertEquals("Obesidade grau II", idoMasc.calcularResultado(idoMasc.calcularImc(106, 1.74)));
    }

    @Test
    public void testarObesidadeIII() {
        Assertions.assertEquals("Obesidade grau III (obesidade mórbida)",
                idoMasc.calcularResultado(idoMasc.calcularImc(121.11, 1.74)));
    }
}
