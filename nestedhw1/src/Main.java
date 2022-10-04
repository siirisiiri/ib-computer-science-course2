public class Main {
    public static void main(String[] args) {
        System.out.println("output 1: ");
        for (int i = 1; i <= 5; i++){
            for (int k = 1; k <= 5; k++){
                System.out.print(k);
            }
            System.out.println();
        }
        System.out.println("output 2: ");
        for (int i = 1; i <= 5; i++){
            for (int k = i; k <= i + 4; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}