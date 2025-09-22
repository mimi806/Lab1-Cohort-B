// Project: Ashesi Premier League
// Class:PlayerSelection

// Allows the use of Scanner class
import java.util.Scanner;
public class PlayerSelection{
    public static final double pound_to_kg = 0.45359237;
    public static final int meter_to_cm = 100;
    public static void main (String[]args){
        //Taking input from the user
        Scanner input = new Scanner(System.in);

        // Taking the name of the football player
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        // Taking the age of the football player
        System.out.print("Please enter your age: ");
        int age = input.nextInt();


        //Taking the height of the football player
        System.out.print("Please enter your height(in meters): ");
        double height = input.nextDouble();

        //Taking the weight of the football player
        System.out.print("Please enter your weight(in pounds): ");
        double weight = input.nextDouble();

        //Taking the jersey number of the football player
        System.out.print("Please enter your jersey number: ");
        int jerseyNumber = input.nextInt();

        // Using original number
        int originalJerseyNumber = jerseyNumber;

        // Converting meters to centimeters
        double heightCentimeters = height * meter_to_cm;
        double roundheightCentimeters = (int)(heightCentimeters * meter_to_cm + 0.5);

        // Converting pounds to kilograms
        double weightKilograms = weight * pound_to_kg;
        double roundweightKilograms = (int)(weight * pound_to_kg + 0.5);

        //Increment
        //increasing age
        ++ age;

        //decreasing jersey number
        -- jerseyNumber;


        //Checking eligibility
        //Using the updated age and weight in kilograms
        boolean eligibility = (age >= 18 && age <= 35 && weightKilograms < 90);

        //Underage or overweight
        boolean age_weight = (age < 18 || weightKilograms >= 90);

        //Not operator
        boolean noteligibility = !eligibility;

        //Checking categories of football player
        String category;
        if (age < 20){
            category = "Rising Star";
        }else if (age <= 30){
            category = "Prime Player";
        }else{
            category = "Veteran";
        }

        //Position mapping using original jersey number
        String position;
        switch (originalJerseyNumber) {
            case 1:
                position = "Goalkeeper";
                break;
            case 2:
            case 5:
                position = "Defender";
                break;
            case 6:
            case 8:
                position = "Midfielder";
                break;
            case 7:
            case 11:
                position = "Winger";
                break;
            case 9:
                position = "Striker";
                break;
            case 10:
                position = "Playmaker";
                break;
            default:
                position = "position not known.";
                break;
        }

        //Attacker status
        boolean isAttacker = position.equals("Striker") || position.equals("Winger") || position.equals("Playmaker");
        String AttackerText = isAttacker ? "Yes" : "No";

        //Nested Ifs
        String lineupDecision;
        if  (age >= 20 && age <= 30){
            if (weightKilograms < 80) {
                lineupDecision = "Starting Lineup";
            }else{
                lineupDecision = "Bench (overweight)";
            }
        }else{
            lineupDecision = "Bench (not a Prime Player)";
        }

        // Final Decision
        String finalDecision = eligibility ? "Play" : "Rest";

        // Displays Player's information
        System.out.println("\n ======= Player Report =======");
        System.out.println("Player: " + name);
        System.out.println("Age: " + age + " (" + category + ")");
        System.out.println("Height: " + roundheightCentimeters + "cm");
        System.out.println("Weight: " + roundweightKilograms + "kg");
        System.out.println("Jersey: " + originalJerseyNumber);
        System.out.println("Position: " + position);
        System.out.println("Attacker Jersey: " + AttackerText);
        System.out.println("Eligibility: " + (eligibility ? "Eligible" : "Not Eligible"));
        System.out.println("Lineup Decision: " + lineupDecision);
        System.out.println("Final Decision: " + finalDecision);
        System.out.println("========================\n");

        //optional
        if (age_weight){
            System.out.println("Player has a problem (either too young or too heavy)");
        }
        if (noteligibility){
            System.out.println("NOT(eligibility) is true.");
        }

        //Unwanted fall-through-demo
        System.out.println("\n ======= Unwanted fall-through demo=========");
        System.out.println("Using the coach-entered Jersey number: " +  originalJerseyNumber);
        System.out.println("(If original jersey is 2, 6 or 7 you will see multiple lines below due to fall-through)");

        switch (originalJerseyNumber){
            case 1:
                System.out.println("Goalkeeper");
                break;
                //intentionally no break ; fall through
            case 2:
                System.out.println("Defender");
                //intentionally no break ; fall through
            case 6:
                System.out.println("Midfielder");
            case 7:
                System.out.println("Winger");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            case 11:
                System.out.println("Winger");
                break;
            default:
                System.out.println("Player position not known.");
                break;
        }










    }

}


