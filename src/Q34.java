import java.util.Scanner;

public class Q34 {
    public static void main(String[] args){

        Scanner Teclado = new Scanner(System.in);
        
        double[][] notasAlunos = new double[5][10];

        int aprovados;

        for(int i = 0; i < notasAlunos.length - 1; i++){
            System.out.printf("%dº Nota\n",i+1);
            for(int j = 0; j < notasAlunos[0].length; j++){
                System.out.printf("%dº Aluno: ",j+1);
                notasAlunos[i][j] = Teclado.nextInt();
            }
        }

        Teclado.close();

        aprovados = checaAprovados(notasAlunos);

        System.out.printf("\nAprovados = %d\n", aprovados);
    }

    public static int checaAprovados(double[][] notasAlunos){
        int aprovados = 0;

        for(int i = 0; i < notasAlunos[0].length; i++){
            notasAlunos[4][i] = (notasAlunos[0][i] + notasAlunos[1][i] + notasAlunos[2][i] + notasAlunos[3][i]) / 4;
            if(notasAlunos[4][i] >= 7.0){
                aprovados++;
            }
        }

        return aprovados;
    }
}
