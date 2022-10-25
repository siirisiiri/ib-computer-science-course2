public class Main {
    public static void main(String[] args) {
        String[] students = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades = {"B", "D", "B", "A"};
        int ind = 0;
        for (int i = 0; i < students.length; i++){
            if (students[i].equals("Charlie")){
                ind = i;
            }
        }
        System.out.println(grades[ind]);
    }
}