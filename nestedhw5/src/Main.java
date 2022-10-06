public class Main {
    public static void main(String[] args) {
    int [] A = {1, 2, 3, 4, 5};
    System.out.println(uniques(A));
    }
    static boolean uniques (int [] numbers) {
        int[] co = numbers;
        boolean flaa = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length; k++) {
                if (k != i && numbers [k] == co [i]) {
                    flaa = true;
                    break;
                }
            }
        }
        return flaa;
    }
}
