public class Main {
    public static void main(String[] args) {
        int [] data = {7, 9 , 11, 2};
        boolean changed = true;
        while (changed){
            changed = false;
            for (int i = 1; i < data.length; i++)
                if (data [i - 1] > data [i]){
                    swap (data, i - 1, i);
                    changed = true;
                }
        }
    }
    static void swap (int [] arr, int i, int j){
        int tmp = arr [i];
        arr [i] = arr [j];
        arr [j] = tmp;
    }
}