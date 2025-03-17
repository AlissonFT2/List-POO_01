import java.util.Scanner;

public class Q25 {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        int arr_size = 10;
        int maior, menor;
        int sum = 0;
        float media = 0;

        int[] arr = new int[arr_size];

        for(int i = 0; i < arr_size; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            arr[i] = Teclado.nextInt();
            sum += arr[i];
        }

        Teclado.close();

        maior = arr[0];
        menor = arr[0];


        for(int i = 1; i < arr_size; i++){
            if(arr[i] >= maior){
                maior = arr[i];
            }
            if(arr[i] <= menor){
                menor = arr[i];
            }
        }

        media = (float) sum / arr_size;

        System.out.printf(
            "\nMaior = %d\nMenor = %d\nSoma = %d\nMédia = %.2f\n",
            maior, 
            menor,
            sum,
            media
        );
    }
}
