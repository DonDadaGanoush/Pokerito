import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /**
         * Explains rules of Pokerito (Poker but easy mode): 
         *  - User plays against computer 
         *  - The dealer issues user and computer one card 
         *  - The dealer will draw five cards 
         *  - The player with the most matches wins 
         *  - If matches are equal, everyone wins
         */

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine(); 
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("\t- There are two players, you and the computer.");
        System.out.println("\t- The dealer will give each player one card.");
        System.out.println("\t- Then, the dealer will draw five cards (the river).");
        System.out.println("\t- The player with the most river matches wins!");
        System.out.println("\t= If the matches are equal, everyone's a winner!\n");
        System.out.println("Ready? Type anything if you are.");
        scan.nextLine(); 

        // user and computer are given random cards (refer to function)
        String userCard = randomCard(); 
        String computerCard = randomCard(); 

        // displays user and computer card
        System.out.println("Here's you card:\n\n " + userCard );
        System.out.println("Here's the computer's card:\n\n " + computerCard + "\n\n");

        // initiates counter variables for matches
        int yourMatches = 0;
        int computerMatches =0;

        // now dealer draws 5 cards
        System.out.println("Now, the dealer will draw five card. Press enter to continue. ");
        scan.nextLine(); 

        // dealer draws 5 random cards using function and each is displayed
        for (int i = 1; i <= 5; i++) { 
            String draw = randomCard(); 
            System.out.println("Card " + i);
            System.out.println(draw + "\n");

            // increases counter depending on matches
            if(userCard.equals(draw)){
                yourMatches++; 
            } 
            if(computerCard.equals(draw)) { 
                computerMatches++; 
            }
        } 

        // displays number of matches for each player
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        // prints results depending on number of matches
        if(yourMatches > computerMatches) { 
            System.out.println("\nYou win!");
        } else if (computerMatches > yourMatches) { 
            System.out.println("\nThe computer wins!");
        } else { 
            System.out.println("\nEveryone wins!");
        }
        
         scan.close();
    }

    /** 
     * Function name – randomCard
     * @return (String)
     * 
     * Using math.random(), gives a random number between 1-13
     * This number references a card (refer to cards.txt)
     */
    public static String randomCard() { 
        double randomDouble = Math.random() * 13; 
        randomDouble += 1; 
        int randomNumber = (int)randomDouble; 
        
        switch (randomNumber) { 
            case 1: return  "   _____\n"+
                            "  |A _  |\n"+ 
                            "  | ( ) |\n"+
                            "  |(_'_)|\n"+
                            "  |  |  |\n"+
                            "  |____V|\n";

            case 2: return  "   _____\n"+              
                            "  |2    |\n"+ 
                            "  |  o  |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____Z|\n";
                        
            case 3: return  "   _____\n" +
                            "  |3    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  |  o  |\n"+
                            "  |____E|\n";

            case 4: return  "   _____\n" +
                            "  |4    |\n"+
                            "  | o o |\n"+
                            "  |     |\n"+
                            "  | o o |\n"+
                            "  |____h|\n";

            case 5: return  "   _____ \n" +
                            "  |5    |\n" +
                            "  | o o |\n" +
                            "  |  o  |\n" +
                            "  | o o |\n" +
                            "  |____S|\n";

            case 6: return  "   _____ \n" +
                            "  |6    |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  | o o |\n" +
                            "  |____6|\n";

            case 7: return  "   _____ \n" +
                            "  |7    |\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |____7|\n";
                
            case 8: return  "   _____ \n" +
                            "  |8    |\n" +
                            "  |o o o|\n" +
                            "  | o o |\n" +
                            "  |o o o|\n" +
                            "  |____8|\n";

            case 9: return  "   _____ \n" +
                            "  |9    |\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |____9|\n";

            case 10: return "   _____ \n" +
                            "  |10  o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |o o o|\n" +
                            "  |___10|\n";

            case 11: return "   _____\n" +
                            "  |J  ww|\n"+ 
                            "  | o {)|\n"+ 
                            "  |o o% |\n"+ 
                            "  | | % |\n"+ 
                            "  |__%%[|\n";

            case 12: return "   _____\n" +
                            "  |Q  ww|\n"+ 
                            "  | o {(|\n"+ 
                            "  |o o%%|\n"+ 
                            "  | |%%%|\n"+ 
                            "  |_%%%O|\n";

            case 13: return "   _____\n" +
                            "  |K  WW|\n"+ 
                            "  | o {)|\n"+ 
                            "  |o o%%|\n"+ 
                            "  | |%%%|\n"+ 
                            "  |_%%%>|\n";

            default: return ("This shouldn't get called"); 
        }
    }

}
