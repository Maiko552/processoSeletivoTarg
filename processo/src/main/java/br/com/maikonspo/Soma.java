package br.com.maikonspo;

public class Soma {
    public static void main(String[] args) {
        int indice = 12 ,soma = 0, k = 1;

        while (k < indice){
            k = k +1;
            soma = soma + k;
        }
        System.out.println(soma);
    }
}
