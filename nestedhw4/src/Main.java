public class Main {
    public static void main(String[] args) {
        System.out.println("output 1: ");
        for (int i = 6; i > 0; i = i - 1){
            for (int k = 0; k < i; k++)
                System.out.print("*");
            System.out.println();
        }
        System.out.println("output 2: ");
        for (int i = 1; i < 7; i++){
            for (int k = 0; k < i; k++)
                System.out.print("*");
            for (int s = 0; s < 6 - i; s++)
                System.out.print("-");
            System.out.println();
        }
    }
}