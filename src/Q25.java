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

        for(int i = 0; i < arr_size; i++){
            for(int j = 0; j < arr_size - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        media = (float) sum / arr_size;

        System.out.printf(
            "\nMaior = %d\nMenor = %d\nSoma = %d\nMédia = %.2f\n",
            arr[arr_size - 1], 
            arr[0],
            sum,
            media
        );
    }
}
