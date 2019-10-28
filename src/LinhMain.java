import java.util.Scanner;

public class LinhMain {
    public static String userInput="";

    public static void main(String args[]) {

        Scanner kd = new Scanner(System.in);

        boolean continueToPlay = true;
        System.out.println("You are in room 1");
        System.out.println("Do you want to go north or quit?");
        String answer = kd.next();
        while(continueToPlay) {
            if (answer.equalsIgnoreCase("north")) {
                userInput = "front room";
            } else if (answer.equalsIgnoreCase("quit")) {
                userInput = "quit";
                System.out.println("Exiting the program");
                continueToPlay = false;
            }

            if (userInput == "front room")
                userInput = frontRoom();
            if(userInput == "foyer")
                userInput = foyer();

            }//end while




    }
    public static String foyer(){
        Scanner kd = new Scanner(System.in);

        System.out.println("You are in room 1");
        System.out.println("dead scorpion");
        System.out.println("Do you want to go north or quit?");
        String answer= kd.next();
        if(answer.equalsIgnoreCase("north")){
            userInput="front room";
        }
        return userInput;
    }

    public static String frontRoom(){
        Scanner kd = new Scanner(System.in);
        System.out.println("You are in room 2");
        System.out.println("piano");
        System.out.println("Do you want to go south,west, east or quit?");
        String answer= kd.next();
        switch (answer) {
            case "south":
                userInput="foyer";
                break;
            case "west":
                userInput="library";
                break;
            case "east":
                userInput="Kitchen";
                break;
            case "quit":
                userInput="quit";
                break;

        }

        return userInput;
    }

 /*   public static String vaultRoom()
    {
        Scanner kd = new Scanner(System.in);

        System.out.println("You are in room 6 - Vault");
        System.out.println("3 walking skeletons");
        System.out.println("Do you want to go east");
        String answer = kd.nextLine();

    }
    */

    public static String parlorRoom()
    {
        Scanner kd = new Scanner(System.in);

        System.out.println("You are in room 7 - Parlor");
        System.out.println("Treasure chest");
        System.out.println("Do you want to go west, south, or quit?");
        String answer = kd.nextLine();
        switch (answer) {
            case "west":
                userInput="vault";
                break;
            case "south":
                userInput="kitchen";
                break;
            case "quit":
                userInput="quit";
                break;
        }//end switch
        return userInput;
    }
// public static String secretRoom()
// {
//     System.out.println("You are in room 8 - secret room");
//     System.out.println("Piles of gold");
//
//
// }


}
