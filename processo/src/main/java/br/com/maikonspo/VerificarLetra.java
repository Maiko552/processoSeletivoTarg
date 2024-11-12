package br.com.maikonspo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.Normalizer;


public class VerificarLetra {

    //remover acentos caso a string utilize
    public static String removerAcentos(String texto) {
        String textoSemAcento = Normalizer.normalize(texto, Normalizer.Form.NFD);
        textoSemAcento = textoSemAcento.replaceAll("[^\\p{ASCII}]", "");
        return textoSemAcento;
    }

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            System.out.println("Digite uma palavra: ");
            //pode se definir a palavra nessa variavel p
           String p = reader.readLine().trim();  //trim para remover espaços em branco

            System.out.println("Digite a letra que deseja verificar: ");
            char letra = reader.readLine().trim().charAt(0);


            p = removerAcentos(p.toLowerCase()); //remover os acentos e toLowerCase
            letra = removerAcentos(Character.toString(letra).toLowerCase()).charAt(0);

            //vezes letra
            int c = 0;
            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == letra) {
                    c++;
                }
            }

            //decoração de erro
            System.err.printf("A letra %s apareceu %s vez ou vezes na sua palavra. ", letra, c);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
