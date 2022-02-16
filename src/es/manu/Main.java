package es.manu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero, factorial = 1;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Dame un número mayor que 0: ");
            numero = entrada.nextInt();
        } while (numero < 0);

        for (int i = 0; i <= numero; i++) {
            System.out.println("!" + i + " = " + factorial);
            factorial *= (i + 1);
        }
    }
}
