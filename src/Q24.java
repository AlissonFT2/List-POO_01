import java.util.Scanner;

public class Q24 {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);

        int arr_size = 3;

        int[] arr = new int[arr_size];

        for(int i = 0; i < arr_size; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            arr[i] = Teclado.nextInt();
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

        System.out.printf("\nMaior = %d\nMenor = %d\n",arr[arr_size - 1], arr[0]);
    }
}
