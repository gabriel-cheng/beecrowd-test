import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> sortedNumbers = new ArrayList<Integer>();
        ArrayList<Integer> unsortedNumbers = new ArrayList<Integer>();
        
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        
        sortedNumbers.add(n1);
        sortedNumbers.add(n2);
        sortedNumbers.add(n3);
        
        unsortedNumbers.add(n1);
        unsortedNumbers.add(n2);
        unsortedNumbers.add(n3);

        Collections.sort(sortedNumbers);
        
        showArrListValues(sortedNumbers);
        System.out.print("\n");
        showArrListValues(unsortedNumbers);
    }
    public static void showArrListValues(ArrayList<Integer> arr) {
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}