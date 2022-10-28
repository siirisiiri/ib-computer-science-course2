import ibcsutils.ReadViaURL;

public class Main {
    public static void main(String[] args) {
        String addr = "https://www-personal.umich.edu/~jlawler/wordlist";
        String[] words =
                ReadViaURL.readWords (addr, true, true, true);
        System.out.println(words [99]);
    }
}