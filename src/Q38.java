import java.util.Scanner;

public class Q38 {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args){
        int[] notas = new int[]{     100, 50, 10, 5, 2};
        int[] quantNotas = new int[]{  2,  3,  5, 6, 9};
        int minimo=10, maximo=2000;

        int saque;

        boolean rodando = true;

        while (rodando) {

            saque = possivelSaque(minimo, maximo, notas, quantNotas);
            
            int aproximaSaque = 0;

            System.out.println("Notas Retiradas");
            
            for(int i = 0; i < notas.length; i++){
                int quant = quantNotas[i];
                int somaNotas = 0;

                for(int j = 0; j < quant; j++){

                    if(aproximaSaque + notas[i] > saque){
                        break;
                    }
                    somaNotas++;
                    aproximaSaque += notas[i];
                }
                quantNotas[i] -= somaNotas;

                System.out.printf("%d \t: %d\n", notas[i], somaNotas);
            }

            System.out.println("Notas Restantes");
            for(int i = 0; i < notas.length; i++){
                System.out.printf("%d \t: %d\n", notas[i], quantNotas[i]);
            }

            System.out.print("Repetir transação\n(1) Sim \n(0) Não\n-> ");

            if (Teclado.nextInt() == 0){
                break;
            }
        }
    }
    public static int possivelSaque(int minimo, int maximo, int[] notas, int[] quantNotas){
        int saque;

        System.out.print("Digite o valor de saque: ");
        saque = Teclado.nextInt();
        while ((saque < minimo || saque > maximo) || aproximaPossivel(notas, quantNotas, saque)) {
            if(saque < minimo){
                System.out.printf("\nValor abaixo do minimo: %d", minimo);
            }else if(saque > maximo) {
                System.out.printf("\nValor acima do maximo: %d", maximo);
            } else {
                System.out.println("Saque impossivel");
            }
            System.out.print("\nDigite novamente: ");
            saque = Teclado.nextInt();
        }

        return saque;
    }
    public static boolean aproximaPossivel(int[] notas, int[] quantNotas, int saque){
        int aproximaSaque = 0;
            
        for(int i = 0; i < notas.length; i++){
            int quant = quantNotas[i];

            for(int j = 0; j < quant; j++){

                if(aproximaSaque + notas[i] > saque){
                    break;
                }
                //quantNotas[i]--;
                aproximaSaque += notas[i];
            }
        }

        if (aproximaSaque == saque){
            return false;
        } else {
            return true;
        }
    }
}
