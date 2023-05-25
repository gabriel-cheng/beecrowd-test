import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int i = x + 10;

        for(; x <= i; x++) {
            if(x % 2 != 0) {
                System.out.println(x);
            }
        }
    }
}