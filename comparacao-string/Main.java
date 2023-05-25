import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        String tipo1 = in.next();
        String tipo2 = in.next();
        String tipo3 = in.next();
        
        System.out.println(animal(tipo1, tipo2, tipo3));
        in.close();
    }

    public static String animal(String tipo1, String tipo2, String tipo3) {
        String resultado = "";

        if(tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("carnivoro")) {
            resultado = "aguia";
        } else if(tipo1.equals("vertebrado") && tipo2.equals("ave") && tipo3.equals("onivoro")) {
            resultado = "pomba";
        } else if(tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("onivoro")) {
            resultado = "homem";
        } else if(tipo1.equals("vertebrado") && tipo2.equals("mamifero") && tipo3.equals("herbivoro")) {
            resultado = "vaca";
        } else if(tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("hematofago")) {
            resultado = "pulga";
        } else if(tipo1.equals("invertebrado") && tipo2.equals("inseto") && tipo3.equals("herbivoro")) {
            resultado = "lagarta";
        } else if(tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("hematofago")) {
            resultado = "sanguessuga";
        } else if(tipo1.equals("invertebrado") && tipo2.equals("anelideo") && tipo3.equals("onivoro")) {
            resultado = "minhoca";
        } else {
            resultado = "Erro";
        }

        return resultado;
    }
}