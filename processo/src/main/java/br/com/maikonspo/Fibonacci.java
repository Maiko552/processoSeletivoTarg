package br.com.maikonspo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Fibonacci {

    static boolean pertenceFibonacci(long numero) {
        long a = 0;  //n1  pode ser definido
        long b = 1;  //n2  pode ser definido

        //eles já pertence à sequência de Fibonacci
        if (numero == 0 || numero == 1) {
            return true;
        }

        while (b < numero) {
            //decoração
            System.err.println("Fibonacci: " + a + ", " + b);
            long temp = b;
            b = a + b;
            a = temp;
        }
        return b == numero;
    }

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
            long numero = Long.parseLong(reader.readLine());

            // verificação
            if (pertenceFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
            }
        } catch (IOException e) {
            System.out.println("Erro na leitura da entrada.");
        } catch (NumberFormatException e) {
            System.out.println("Por favor, digite um número válido.");
        }
    }
}
