public class Main {
    public static void main(String[] args) {
        int [] a = {4, 4, 6, 11, -2, 3};
        int [] b = {5, 11, 11, -3, 3, 5};
        boolean f = false;
        for (int k : a){
            f = false;
            for (int s : b){
                if (s == k) {
                    f = true;
                    break;
                }
            }
            if (f == false){
                System.out.println(k);
            }
        }
        for (int k : b){
            f = false;
            for (int s : a){
                if (s == k) {
                    f = true;
                    break;
                }
            }
            if (f == false){
                System.out.println(k);
            }
        }
    }
}