import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<> ();
        Scanner scanner = new Scanner (System.in);
        while (scanner.hasNextLine()) {
            String k = scanner.nextLine();
            if (k.length() == 1)
                break;
            else
                list.add(k);
            }
        System.out.println(list);
        while (scanner.hasNextLine()) {
            String k = scanner.nextLine();
            if (k.length() == 1)
                break;
            for (String a : list){
                if (k.equals(a)){
                    System.out.println("hit");
                }
            }
        }
    }
}