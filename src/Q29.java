import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        
        System.out.print("Digite o valor da temperatura: ");
        double temperatura = Teclado.nextDouble();
        
        System.out.print("Digite a escala atual (Celsius, Fahrenheit, Kelvin): ");
        String escalaAtual = Teclado.next().toLowerCase();
        
        System.out.print("Digite a escala para a qual deseja converter (Celsius, Fahrenheit, Kelvin): ");
        String escalaDesejada = Teclado.next().toLowerCase();
        
        double resultado = 0;
        
        Teclado.close();
        

        resultado = converter(escalaAtual, escalaDesejada, temperatura);

        System.out.printf("Resultado: %.2f %s%n", resultado, escalaDesejada);
    }
    public static double converter(String escalaAtual, String escalaDesejada, double temperatura){
        switch (escalaAtual) {
            case "celsius":
                switch (escalaDesejada) {
                    case "fahrenheit":
                        return temperatura * 1.8 + 32;
                    case "kelvin":
                        return temperatura + 273.15;
                    default:
                        System.out.println("Escala de destino inválida!");
                        return Double.NaN;
                }
            case "fahrenheit":
                switch (escalaDesejada) {
                    case "celsius":
                        return (temperatura - 32) / 1.8;
                    default:
                        System.out.println("Escala de destino inválida!");
                        return Double.NaN;
                }
            case "kelvin":
                switch (escalaDesejada) {
                    case "celsius":
                        return temperatura - 273.15;
                    case "fahrenheit":
                        return 1.8 * (temperatura - 273) + 32;
                    default:
                        System.out.println("Escala de destino inválida!");
                        return Double.NaN;
                }
            default:
                System.out.println("Escala de origem inválida!");
                return Double.NaN; 
        }
    }
}

