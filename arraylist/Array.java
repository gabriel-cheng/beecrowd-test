import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();

        numbers.add(n1);
        numbers.add(n2);
        numbers.add(n3);
        numbers.add(n4);
        numbers.add(n5);

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}