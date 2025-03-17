import java.util.Scanner;

public class Q30 {
        public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        int conta = 0, soma_idade = 0, maior, menor;

        float media;

        int[] arr = new int[1000];

        while (true) {

            int idade = Teclado.nextInt();

            if(idade == 0){
                break;
            }

            arr[conta] = idade;
            soma_idade += idade;
            conta++;
        }

        Teclado.close();

        maior = arr[0];
        menor = arr[0];


        for(int i = 1; i < conta; i++){
            if(arr[i] >= maior){
                maior = arr[i];
            }
            if(arr[i] <= menor){
                menor = arr[i];
            }
        }

        media = (float) soma_idade / conta;
        
        System.out.printf("\nNumero de pessoas = %d\nMédia = %.2f\nMenor = %d\nMaior = %d\n",
            conta,
            media,
            menor,
            maior
        );

    }
}