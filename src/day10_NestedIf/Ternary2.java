package day10_NestedIf;

public class Ternary2 {
    public static void main(String[] args) {

        int score = 88;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println(grade);

        System.out.println("-------------------------------");

        int score1 = 66;
        char grade1;

        char grade2 = (score1 >= 90) ? 'A' : (score1 >= 80) ? 'B' : (score1 >= 70) ? 'C' : (score1 >= 60) ? 'D' : 'F';
        System.out.println(grade2);
    }
}
