import java.io.IOException;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class DuasLinhas {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int codPeca1 = in.nextInt();
        int numPeca1 = in.nextInt();
        double valorPeca1 = in.nextDouble();
        
        System.out.printf("");

        int codPeca2 = in.nextInt();
        int numPeca2 = in.nextInt();
        double valorPeca2 = in.nextDouble();
        
        double somaInicial = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);
        
        BigDecimal total = new BigDecimal(somaInicial).setScale(2, RoundingMode.HALF_UP);
        
        System.out.print("VALOR A PAGAR: " + total);
    }
 
}