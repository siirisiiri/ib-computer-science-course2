import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<> ();
        Scanner scanner = new Scanner (System.in);
        while (scanner.hasNextInt())
            list.add (scanner.nextInt ());
        System.out.println(list);
    }
}