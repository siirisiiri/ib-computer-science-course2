public class Main {
    public static void main(String[] args) {
        int A[] = {-2, 9, 11, 12, 13, 14, 15, 22, 142};
        int key = 15;
        int lo = 0, hi = A.length - 1;
        boolean found = false;
        while (!found){
            System.out.println(A[( lo + hi ) / 2]);
            if (A[( lo + hi ) / 2] > key)
                hi = (lo + hi) / 2 - 1;
            else if (A[( lo + hi ) / 2] < key)
                lo = (lo + hi) / 2 + 1;
            else
                found = true;
        }
    }
}