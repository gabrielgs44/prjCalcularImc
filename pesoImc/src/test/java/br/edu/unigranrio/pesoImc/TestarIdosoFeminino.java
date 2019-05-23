package br.edu.unigranrio.pesoImc;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.IdosoFeminino;

public class TestarIdosoFeminino {
    IdosoFeminino idoFemi;

    @BeforeEach
    public void setup() {
        idoFemi = new IdosoFeminino();
    }

    @AfterEach
    public void tearDown() {
        idoFemi = null;
    }

    @Test
    public void testarBaixoPeso() {
        Assertions.assertEquals("Baixo peso", idoFemi.calcularResultado(idoFemi.calcularImc(66.6, 1.74)));
    }

    @Test
    public void testarPesoNormal() {
        Assertions.assertEquals("Peso normal", idoFemi.calcularResultado(idoFemi.calcularImc(66.61, 1.74)));
    }

    @Test
    public void testarSobrepeso() {
        Assertions.assertEquals("Sobrepeso", idoFemi.calcularResultado(idoFemi.calcularImc(82.05, 1.74)));
    }

    @Test
    public void testarObesidadeI() {
        Assertions.assertEquals("Obesidade grau I", idoFemi.calcularResultado(idoFemi.calcularImc(97.19, 1.74)));
    }

    @Test
    public void testarObesidadeII() {
        Assertions.assertEquals("Obesidade grau II", idoFemi.calcularResultado(idoFemi.calcularImc(112.33, 1.74)));
    }

    @Test
    public void testarObesidadeIII() {
        Assertions.assertEquals("Obesidade grau III (obesidade mórbida)",
                idoFemi.calcularResultado(idoFemi.calcularImc(127.16, 1.74)));
    }
}
