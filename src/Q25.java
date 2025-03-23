import java.util.Scanner;

public class Q25 {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        int arr_size = 10;
        int sum = 0;
        float media = 0;

        int[] arr = new int[arr_size];

        for(int i = 0; i < arr_size; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            arr[i] = Teclado.nextInt();
            sum += arr[i];
        }

        Teclado.close();

        int[] maiorMenor = maiorMenor(arr);

        media = (float) sum / arr_size;

        System.out.printf(
            "\nMaior = %d\nMenor = %d\nSoma = %d\nMédia = %.2f\n",
            maiorMenor[0], 
            maiorMenor[1],
            sum,
            media
        );
    }

    public static int[] maiorMenor(int[] arr){
        int maior = arr[0];
        int menor = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] >= maior){
                maior = arr[i];
            }
            if(arr[i] <= menor){
                menor = arr[i];
            }
        }

        return new int[]{maior, menor};
    }
}


