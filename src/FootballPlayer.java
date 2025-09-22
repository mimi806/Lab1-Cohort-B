// Lab Session: Ashesi Premier League- Football Player Management System.
//Task 1- Declaring and using variables
import java.util.Scanner;
public class FootballPlayer{
    public static final double pound_to_kg = 0.45359237; // task 2 convention
    public static final int meter_to_cm = 100; // task 2 (convertion)
    public static void main(String[]args){

        // Taking input from the user
        Scanner scan = new Scanner(System.in);

        // Taking the name of the football player.
        System.out.print("Enter the name of the football player: ");
        String name = scan.nextLine();

        // taking the age of the player
        System.out.print("Enter the age of the football player: ");
        int age = scan.nextInt();

        //Taking the height of the player
        System.out.print("Enter the height of the football player(in meters):" );
        double height = scan.nextDouble();

        //Taking the weight of the player
        System.out.print("Enter the weight of the football player(in pounds): " );
        double weight = scan.nextDouble();

        //Taking the jersey number
        System.out.print("Enter the jersey number: ");
        int jerseynumber = scan.nextInt();

        //Displaying the jersey number information given by the user
        System.out.println("Player name - " + name );
        System.out.println("Age - " + age);
        System.out.println("Height - " + height + "m");
        System.out.println("Weight - " + weight + "lbs");
        System.out.println("Jersey Number - " + jerseynumber);


        // Task 2 (converting height and weight into centimeters and kilograms respectively)
        double centimeters = height * meter_to_cm;
        int roundcentimeters = (int)(height * meter_to_cm + 0.5);
        double kilograms = weight * pound_to_kg ;
        int roundkilograms = (int) (kilograms + 0.5);

        //Displaying the updated information
        System.out.println("Player name - " + name );
        System.out.println("Age - " + age);
        System.out.println("Height in centimeters - " + centimeters + "cm");
        System.out.println(" Weight in kilograms - " +  kilograms + "kg");
        System.out.println("Jersey Number - " + jerseynumber);

        // Task 3(increment and Decrement operators)
        age++;
        jerseynumber--;

        //Displays the updated age and jersey number
        System.out.println("Updated age -" + age);
        System.out.println("Updated Jersey Number -" + jerseynumber);

        //Task 4(Boolean Expressions and Logical Operators)
        /*boolean eligibility = (age >= 18 && age <= 35 &&  kilograms <90);
        if (eligibility) {
            System.out.println("Eligible");
        }else{
            System.out.println("Not eligible");
            }*/

        //Underage or overweight
        /*boolean age_weight = (age < 18 || kilograms >= 90);
        if (age_weight) {
            System.out.println("Player has a problem (either too young or too heavy)");
        }else{
            System.out.println("Player is fine");*/

            // Using Not (!)
        //original eligibility function
        boolean eligibility = (age >=  18 && age <= 35 &&  kilograms <90);
            //applying not operator(!)
        boolean noteligibility = !eligibility;
            // print result
        if  (noteligibility) {
            System.out.println("Not Eligible");
        }else{
            System.out.println("Eligible");

            //Task 5(Selection statements using if-else)
            // Checking each category and printing results
        if (age < 20) {
            System.out.println("Rising Star");
        }else if (age <= 30 ) {
            System.out.println("Prime player");
        } else{
            System.out.println("Veteran");

            //Task 6(Switch Cases)
            //switch statement for positions
        switch(jerseynumber){
            case 1:
                System.out.println("Goalkeeper");
                break;
            case 2:
            case 5:
                System.out.println("Defender");
                break;
            case 6:
            case 8:
                System.out.println("midfielder");
                break;
            case 7:
            case 11:
                System.out.println("Winger");
                break;
            case 9:
                System.out.println("Striker");
                break;
            case 10:
                System.out.println("Playmaker");
                break;
            default:
                System.out.println("Player cannot be identified");
                break;
        }

                //Task 7- Switch Cases(Running Case / Fall through)
            switch(jerseynumber) {
                case 1:
                    System.out.println("Goalkeeper");
                    break;
                case 2:
                case 5:
                    System.out.println("Defender");
                    //No break
                case 6:
                case 8:
                    System.out.println("midfielder");
                    break;
                case 7:
                case 11:
                    System.out.println("Winger");
                    //No break
                case 9:
                    System.out.println("Striker");
                    break;
                case 10:
                    System.out.println("Playmaker");
                    break;
                default:
                    System.out.println("Player cannot be identified");
                    break;
            }
                    //Task 8 (Nested Ifs)
            //Prime Player check
            if (age >= 20 && age <= 30){
                System.out.println("Category: Prime Player");
                if (kilograms < 80) {
                    System.out.println("Decision: Starting Lineup");
                } else {
                    System.out.println("Decision: Bench(overweight)");
                }
            }else{
                System.out.println("Decision(not a Prime Player)");
            }

            //Task 9 (Ternary Operator)
            String finalDecision = eligibility ? "Play" : "Rest";
            System.out.println("Final Decision - " + finalDecision);


                }
            }



        }





    }


