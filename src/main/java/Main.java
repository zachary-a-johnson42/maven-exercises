import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean programRun = true;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter whatever you'd like!");

            String userInput = scanner.nextLine();

            if (StringUtils.isNumeric(userInput)) {
                System.out.println("You entered a number!");
            } else {
                System.out.println("Your input isn't a number..");
            }

            if (StringUtils.isAlphanumeric(userInput) || StringUtils.isAlpha(userInput)) {
                System.out.println("Your input contains letters! Your input with cases switched is...");
                System.out.println(StringUtils.swapCase(userInput));
            }


            System.out.println("Your input reversed is..");
            System.out.println(StringUtils.reverse(userInput));

            System.out.println("Would you like to enter something else? Enter y/n to continue.");
            String userChoice = scanner.nextLine();
            if(userChoice.equals("y")){
                continue;
            } else {programRun = false;}

        } while(programRun);



    }


}
