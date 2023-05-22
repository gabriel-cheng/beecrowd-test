import java.io.IOException;
import java.util.Scanner;
 
public class Array {
 
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int[] ddd = {61, 71, 11, 21, 32, 19, 27, 31};
        String[] estados = {
            "Brasilia", "Salvador", "Sao Paulo",
            "Rio de Janeiro", "Juiz de Fora",
            "Campinas", "Vitoria", "Belo Horizonte"
        };
        
        int dddInformado = in.nextInt();

        System.out.println(verify(dddInformado, ddd, estados));

        in.close();
    }
    
    public static String verify(int dddInformado, int[] ddd, String[] estados) {
        String estado = "";

        for(int i = 0; i < ddd.length; i++) {
            if(ddd[i] == dddInformado) {
                estado = estados[i];
            }
        }

        if(estado == "") {
            return "DDD nao cadastrado";
        }
        
        return estado;
    }
}