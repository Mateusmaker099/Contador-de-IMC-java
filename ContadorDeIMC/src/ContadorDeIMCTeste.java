
import java.util.Scanner;

public class ContadorDeIMCTeste {
    public static void main(String[] args) {
        /*
         * O IMC é calculado por meio da divisão do peso
         * do indivíduo pela estatura, em
         * metros, ao quadrado. De forma simplificada,
         * temos: peso/(altura x altura).
         */

        /* Intancia scanner */
        Scanner objeto = new Scanner(System.in);
        /* Variaveis peso e altura */
        float peso = 0;
        /* Altura sempre em metros */
        float altura = 0;
        /* Calculo = peso / alturaAoQuadrado */

        /* Intancia cliente */
        /* Calculo do indice de massa corporal */
        System.out.println("Digite sua altura e peso calcularemos o seu imc");
        System.out.println("Digite seu peso em kilogramas");
        peso = objeto.nextFloat();
        System.out.println("Digite sua altura em centimetros exemplo : 150");
        altura = objeto.nextFloat();
        float alturaEmMetros = altura / 100;
        float alturaAoQuadrado = alturaEmMetros * alturaEmMetros;
        float imc = peso / alturaAoQuadrado;

        if (imc >= 40) {
            System.out.println("");
            System.out.println("____________________relatorio____________________");
            System.out.println("");
            System.out.println("Seu imc é " + imc);
            System.out.println("Classificação : Obesidade Grave ");
            System.out.println("Grau de obesidade III ");
            System.out.println("Risco de doenças : multissimo elevado");
            System.out.println("________________________________________");
        }

        if (imc >= 30 && imc <= 39.9) {
            System.out.println("");
            System.out.println("____________________relatorio____________________");
            System.out.println("");
            System.out.println("Seu imc é " + imc);
            System.out.println("Classificação : Obesidade ");
            System.out.println("Grau de obesidade II ");
            System.out.println("Risco de doenças : muito elevado");
            System.out.println("________________________________________");

            /* Obesidade 5 */
            /* Grau de obesidade II */

        }
        if (imc >= 30 && imc <= 34.9) {
            System.out.println("");
            System.out.println("____________________relatorio____________________");
            System.out.println("");
            System.out.println("Seu imc é " + imc);
            System.out.println("Classificação : Obesidade ");
            System.out.println("Grau de obesidade I ");
            System.out.println("Risco de doenças : elevado");
            System.out.println("________________________________________");

            /* Obesidade 4 */
            /* Grau de obesidade I */

        }
        if (imc >= 25 && imc <= 29.9) {
            System.out.println("");
            System.out.println("____________________relatorio____________________");
            System.out.println("");
            System.out.println("Seu imc é " + imc);
            System.out.println("Classificação : Sobrepeso ou pré-obeso ");
            System.out.println("Grau de obesidade 0 ");
            System.out.println("Risco de doenças : pouco elevado");
            System.out.println("________________________________________");

            /* Sobrepeso ou pré-obeso 3 */
            /* Grau de obesidade 0 */

        }
        if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("");
            System.out.println("____________________relatorio____________________");
            System.out.println("");
            System.out.println("Seu imc é " + imc);
            System.out.println("Classificação : Normal ou eutrófico");
            System.out.println("Grau de obesidade 0 ");
            System.out.println("Risco de doenças : normal");
            System.out.println("________________________________________");

            /* Normal ou eutrófico 2 */
            /* Grau de obesidade 0 */

        }
        if (imc < 18.5) {
            System.out.println("");
            System.out.println("____________________relatorio____________________");
            System.out.println("");
            System.out.println("Seu imc é " + imc);
            System.out.println("Classificação : Magro ou Baixo ");
            System.out.println("Grau de obesidade 0 ");
            System.out.println("Risco de doenças :Normal ou elevado");
            System.out.println("________________________________________");

            /* magro ou baixo 1 */
            /* Grau de obesidade 0 */
        }

        objeto.close();
    }

}
