import java.util.Scanner;

public class Medidor {

    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        int sexo, qMulher = 0, qHomem = 0;
        float altura, somaH=0, mediaH=0, maior=0, menor=0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o sexo: \n1-Mulher\n2-Homem");
            sexo = scam.nextInt();
            System.out.println("Digite a altura: ");
            altura = scam.nextFloat();
            menor = altura;
            maior = altura;


            if (sexo == 1){
                qMulher++;
            } else if (sexo == 2) {
                qHomem++;
                somaH += somaH + altura;
            } else {
                System.out.println("VTMNC");
            }
            if (altura > maior){
                maior = altura;
            } else if (altura < menor) {
                menor = altura;
            }

        }
        mediaH = somaH / qHomem;

        System.out.println("A maior altura é: " + maior + "m\nE a menor é: " + menor + "m");
        System.out.println("A média de altura dos homens é: " + mediaH +"m");
        System.out.println("O número de mulheres é: " + qMulher);
    }
}
