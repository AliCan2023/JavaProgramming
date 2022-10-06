package day08_$09_IfStatements;

public class GradeReport {
    public static void main(String[] args) {
        int score = 85; // 0 ~ 100;

        boolean A = score >= 90 && score <= 100; // Don't use || and logic;
        boolean B = score >= 80 && score <= 89; // boolean b = score >= 80 && !a;
        boolean C = score >= 70 && score <= 79; // boolean c = !A && !B && score >=70;
        boolean D = score >= 60 && score <= 69;
        boolean F = score >= 0 && score <= 59; // boolean F = !A && !B && !C && !D;

        if (A) {
            System.out.println("Excellent");
        }
        if (B) {
            System.out.println("Great");
        }
        if (C) {
            System.out.println("Great");
        }
        if (D) {
            System.out.println("Passed");
        }
        if (F) {
            System.out.println("Failed");
        }


    }
}
/*
90~ 100 ==> Excellent
90 ~ 89 ==> Great
70 ~ 79 ==> Good
60 ~ 69 ==> Passed
0 ~ 59 ==> Failed
 */