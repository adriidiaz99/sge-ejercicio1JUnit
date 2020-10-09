package com.salesianostriana.ejercicioJUnit1;

import com.salesianostriana.ejercicioJUnit1.modelo.CuentaCorriente;

public class App {

        public static void main(String[] args) {

            CuentaCorriente c1 = new CuentaCorriente("Wola", 231251, 2421621);

            //Cobertura del método deposit

            //Resultado esperado = True
            System.out.println(c1.deposit(1001));

            //Resultado esperado = False
            System.out.println(c1.deposit(-1001));


            //Cobertura del método withdraw

            //Vamos a retirar una cantidad positiva y normal que no excceda
            //Tanto de cuota como de importe
            //Resultado esperado = true
            System.out.println(c1.withdraw(1200, 12));

            //Vamos a retirar una cantidad positiva y normal que no excceda
            //Tanto de cuota negativa como de importe positivo
            //Resultado esperado = false
            System.out.println(c1.withdraw(1200, -12));

            //Vamos a retirar una cantidad negativa y normal que no excceda
            //Tanto de cuota positiva como de importe negativo
            //Resultado esperado = false
            System.out.println(c1.withdraw(-1200, 12));

            //Vamos a retirar una cantidad negativa y normal que no excceda
            //Tanto de cuota negativa como de importe negativo
            //Resultado esperado = false
            System.out.println(c1.withdraw(-1200, -12));




        }
    
}
