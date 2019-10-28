import java.util.Scanner;

public class Main {
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
                      break;
                  case "front room":
                      frontRoom();
                      break;

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
        }
        return userInput;
    }

    public static String frontRoom(){
        Scanner kd = new Scanner(System.in);

        System.out.println("You are in room 2");
        System.out.println("paino");
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


}
