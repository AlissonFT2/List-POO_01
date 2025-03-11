import java.util.Scanner;

public class Q34 {
        public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        double[][] notasAlunos = new double[10][5];

        int aprovados = 0;


        for(int i = 0; i < notasAlunos.length; i++){
            System.out.printf("%dº Aluno\n",i+1);
            for(int j = 0; j < notasAlunos[0].length - 1; j++){
                System.out.printf("%dº Nota: ",j+1);
                notasAlunos[i][j] = Teclado.nextInt();
            }
        }

        Teclado.close();

        for(int i = 0; i < notasAlunos.length; i++){
            notasAlunos[i][4] = (notasAlunos[i][0] + notasAlunos[i][1] + notasAlunos[i][2] + notasAlunos[i][3]) / 4;
            if(notasAlunos[i][4] >= 7.0){
                aprovados++;
            }
        }

        System.out.printf("\nAprovados = %d\n", aprovados);

    }
}
