import ibcsutils.ReadViaURL;
public class Main {
    public static void main(String[] args) {
        String addr = "https://www-personal.umich.edu/~jlawler/wordlist";
        String[] words =
                ReadViaURL.readWords (addr, true, true, true);
        System.out.println("2. sequential search:");
        String word = "apple";
        for (int i = 0; i < words.length; i++){
            if (words[i].equals(word)){
                System.out.println("the word was found at " + i);
                break;
            }
            if (i == words.length - 1){
                System.out.println("the word was not found");
            }
        }
        System.out.println("3. binary search:");
        boolean found = false;
        int s = 0;
        for (int b = words.length / 2; b >= 1; b /= 2) {
            while (s + b < words.length && words[s + b].compareTo(word) <= 0) {
                s += b;
            }
            }
        if (words[s].compareTo(word) == 0){
            System.out.println("the word was found at " + s);
        }
        else {
            System.out.println("the word was not found");
        }
    }
}
