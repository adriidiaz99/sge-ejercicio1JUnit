package com.salesianostriana.ejercicioJUnit1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.salesianostriana.ejercicioJUnit1.modelo.CuentaCorriente;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    CuentaCorriente c1 = new CuentaCorriente("Wola", 231251, 2421621);

    //Cobertura del método deposit

    @Test
    //Resultado esperado = True
    public void depositarPositivo() {
        assertTrue(c1.deposit(1001));
    }

    @Test
    //Resultado esperado = False
    public void depositarNegativo() {
        assertFalse(c1.deposit(-1001));
    }


    //Cobertura del método withdraw

    //Vamos a retirar una cantidad positiva y normal que no excceda
    //Tanto de cuota como de importe
    //Resultado esperado = true
    @Test
    public void noExcederNinguno() {
        assertTrue(c1.withdraw(1200, 12));
    }

    //Vamos a retirar una cantidad positiva y normal que no excceda
    //Tanto de cuota negativa como de importe positivo
    //Resultado esperado = false
    @Test
    public void noExcederNingunoCuotaNegativa() {
        assertFalse(c1.withdraw(1200, -12));
    }

    //Vamos a retirar una cantidad negativa y normal que no excceda
    //Tanto de cuota positiva como de importe negativo
    //Resultado esperado = false
    @Test
    public void noExcederNingunoImporteNEgativo() {
        assertFalse(c1.withdraw(-1200, 12));
    }

    //Vamos a retirar una cantidad negativa y normal que no excceda
    //Tanto de cuota negativa como de importe negativo
    //Resultado esperado = false
    @Test
    public void noExcederNingunoImporteCuotaNegativo() {
        assertFalse(c1.withdraw(-1200, -12));
    }

}
