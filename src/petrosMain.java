import java.util.Random;
import java.util.Scanner;

public class petrosMain {
    public static String userInput="";

    public static void main(String args[]) {

        Scanner kd = new Scanner(System.in);
        System.out.println("You are in room 1");
        System.out.println("Do you want to go north or quit?");
        String answer = kd.next();
        if(answer.equalsIgnoreCase("north")){
            userInput="front room";
        } else if (answer.equalsIgnoreCase("quit")){
            userInput="quit";
        }
        switch (userInput){
            case "foyer":
                foyer();

            case "front room":
                frontRoom();

            case "library":
                library();

            case "kitchen":
                kitchen();

            case "dining room":
                diningRoom();

            case "vault":
                vaultRoom();

            case "parlor":
                parlorRoom();

            case "secret room":
                secretRoom();

            case "quit":
                quit();

        }



    }
    public static String foyer(){
        Scanner kd = new Scanner(System.in);

        System.out.println("You are in room 1");
        System.out.println("dead scorpion");
        System.out.println("Do you want to go north or quit?");
        String answer= kd.next();
        if(answer.equalsIgnoreCase("north")){
            userInput="front room";
        }else{
            userInput="quit";
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
                userInput="kitchen";
                break;
            case "quit":
                userInput="quit";
                break;

        }

        return userInput;
    }

    public static String library(){
        Scanner kd = new Scanner(System.in);
        System.out.println("You are in room 3");
        System.out.println("spiders");
        System.out.println("Do you want to go north, east or quit?");
        String answer= kd.next();
        switch (answer) {
            case "north":
                userInput="dining room";
                break;

            case "east":
                userInput="front room";
                break;
            case "quit":
                userInput="quit";
                break;

        }

        return userInput;
    }
    public static String kitchen(){
        Scanner kd = new Scanner(System.in);
        System.out.println("You are in room 4");
        System.out.println("bats");
        System.out.println("Do you want to go west, north or quit?");
        String answer= kd.next();
        switch (answer) {
            case "north":
                userInput="parlor";
                break;
            case "west":
                userInput="front room";
                break;

            case "quit":
                userInput="quit";
                break;

        }

        return userInput;
    }
    public static String diningRoom(){
        Scanner kd = new Scanner(System.in);
        System.out.println("You are in room 5");
        System.out.println("dust and empty box");
        System.out.println("Do you want to go south or quit?");
        String answer= kd.next();
        switch (answer) {
            case "south":
                userInput="library";
                break;

            case "quit":
                userInput="quit";
                break;

        }

        return userInput;
    }

    public static String vaultRoom()
    {
        Scanner kd = new Scanner(System.in);

        System.out.println("You are in room 6 - Vault");
        System.out.println("3 walking skeletons");
        System.out.println("Do you want to go east");
        String answer = kd.nextLine();
        Random random = new Random();
        int nextInt = random.nextInt(25);
        if(answer.equalsIgnoreCase("east")) {
            if (nextInt==0) {
                  userInput="secret room";
            }else{
                userInput="palor";
            }
        }else if(answer.equalsIgnoreCase("quit")){
            userInput="quit";
        }
        return userInput;
    }

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
 public static String secretRoom() {
     Scanner kd = new Scanner(System.in);

     System.out.println("You are in room 8");
     System.out.println("pile if gold");
     System.out.println("Do you want to go west or quit?");
     String answer = kd.nextLine();
     switch (answer) {
         case "west":
             userInput="vault";
             break;

         case "quit":
             userInput="quit";
             break;
     }
     return userInput;
}

    public static void quit() {
        System.out.println("time to exit");
    }
}
