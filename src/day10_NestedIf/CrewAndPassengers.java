package day10_NestedIf;

public class CrewAndPassengers {
    public static void main(String[] args) {

        int numberOfPeople = 100;
        String Result;  // Requirement is DO NOT USE more than one print statement

        boolean validNumber = numberOfPeople == 50 || numberOfPeople == 75 || numberOfPeople == 100;

        if (validNumber) {  // numberOfPeople : 50, 75, 100
            if (numberOfPeople == 50) {
                Result = numberOfPeople + " people is consists of 20 crew, 30 passengers. ";
            } else if (numberOfPeople == 75) {
                Result = numberOfPeople + " people is consists of 25 crew, 50 passengers. ";
            } else {
                Result = numberOfPeople + " people is consists of 30 crew, 70 passengers. ";
            }
        } else {
            Result = " INVALID number of people";
        }
        System.out.println(Result);

    }
}
/*
2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number), determine how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */