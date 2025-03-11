import java.util.Scanner;

public class Q30 {
        public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        int conta = 0, soma_idade = 0;

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

        for(int i = 0; i < conta; i++){
            for(int j = 0; j < conta - 1; j++){
                if(arr[j] >= arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        media = (float) soma_idade / conta;
        
        System.out.printf("\nNumero de pessoas = %d\nMédia = %.2f\nMenor = %d\nMaior = %d\n",
            conta,
            media,
            arr[0],
            arr[conta-1]
        );

    }
}