import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<> ();
        Scanner scanner = new Scanner (System.in);
        while (scanner.hasNextInt()) {
            int k = scanner.nextInt();
            boolean found = false;
            int foundind = 0;
            for (int i = 0; i < list.size(); i++){
                if (k == list.get(i)){
                    found = true;
                    foundind = i;
                    break;
                }
            }
            if (found){
                list.addFirst(list.remove(foundind));
            }
            else
                list.addFirst(k);
        }
        System.out.println(list);
    }
}