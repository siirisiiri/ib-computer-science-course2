import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 1. it finds out if arrays contain same values.
        // 2. The time consumption is n^2, because it has two nested loops. It could also stop, when it finds one same value.
        int [] A = {1, 2, 3, 4, 5};
        int [] B = {1, 9, 8, 7, 6};
        boolean flag = false;
        for (int k : A){
            for (int s : B){
                if (k == s){
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag);
    }
}