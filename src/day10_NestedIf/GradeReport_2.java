package day10_NestedIf;

public class GradeReport_2 {
    public static void main(String[] args) {
          /*
        90 ~ 100: excellent
        80~89: Great
        70~79:good
        60~69:passed
        0~59:Failed
         */

        int S = 99;
        String result = ""; // Assign it empty value tempreraly

        if (S >= 0 && S <= 100) { // if the S is valid (0 ~100)
            // 5 possibilities :=> A,B,C,D,F
            if (S >= 90) { // if the score is less than 90 the condition failed// (score >=90 && score <= 100) the Logic and no need koz the pre-condition checked by compiler.
                result = " Excellent ";
            } else if (S >= 80) {  // false:score <80 // (score >= 80 && score <90)
                result = "Great";
            } else if (S >= 70) { // false : score <70
                result = "Good";
            } else if (S >= 60) { // false if score <60
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else { //if the score is not valid
            result = "Invalid Score";
        }
        System.out.println(result);

        System.out.println("__________________");
        // solution2: use the ternaries ONLY
        String Result = (S >= 0 && S <= 100) ? (S >= 90) ? "Excellent" : (S >= 80) ? "Great" : (S >= 70) ? "Good" : (S >= 60) ? "Passed" : "Failed"
                : "Invalid Score";
        System.out.println(Result);
    }
}

/*
                 int score = 55;

        if (score >= 0 && score <= 100) { // if the score is valid (0 ~100)
            // 5 possibilities :=> A,B,C,D,F
            if (score >= 90) { // if the score is less than 90 the condition failed// (score >=90 && score <= 100) the Logic and no need koz the pre-condition checked by compiler.
                System.out.println(" Excellent ");
            } else if (score >= 80) {  // false:score <80 // (score >= 80 && score <90)
                System.out.println("Great");
            } else if (score >= 70) { // false : score <70
                System.out.println("Good");
            } else if (score >= 60) { // false if score <60
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else { //if the score is not valid
            System.out.println("INVALID score.");
        }

 */