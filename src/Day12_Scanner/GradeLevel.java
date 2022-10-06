package Day12_Scanner;

import com.sun.source.tree.CaseTree;

public class GradeLevel {
    public static void main(String[] args) {

        byte GradeLevel = 21;
        String Level ="";

        //if(GradeLevel >= 1 && GradeLevel <= 18) { // we will have 5 possibilities
        // if you don't wanna use if statement you have to do more cas blocks to make sure.
            switch (GradeLevel){ // we have to use case blocks back to back to put OR logic.

                case 1: case 2: case 3: case 4:
                    Level = "Elementary School.";
                    break;

                case 6: case 7: case 8:
                    Level = "Middle School.";
                            break;

                case 9: case 10: case 11: case 12:
                    Level = " High School.";
                    break;

                case 13: case 14: case 15: case 16:
                    Level = "College.";
                    break;

                case 17: case 18:
                    Level = "Grad School.";
                    break;


                default:// if the nu,ber is from 1 to 5
                    Level = "INVALID GRADE LEVEL";

            }

       // }else{
          //  Level = "INVALID GRADE";



        System.out.println("School Level is ==> " + Level);

    }
}
/*
 1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both
 */