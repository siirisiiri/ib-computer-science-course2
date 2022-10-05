public class Main {
    public static void main(String[] args) {
        int len = 3;
        int [] NUMS = {3, 7, 4};
        for (int k = 0; k < len; k++){
            for (int l = 0; l < len; l++){
                if (k != l)
                    System.out.println(10 * NUMS [k] + NUMS [l]);
            }
        }
    }
}