import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static String userInput="";
    public static int count=0;
    public static boolean key=true;
    public static int earning=0;
    public static HashMap<String, Boolean> myMap = new HashMap<String, Boolean>();
    public static String[] arr=new String[10];
    public static int i=0;

    public static void main(String[] args) {

        Scanner kd = new Scanner(System.in);
        myMap.put("foyer",true);
        myMap.put("front room",true);
        myMap.put("library",true);
        myMap.put("kitchen",true);
        myMap.put("dining room",true);
        myMap.put("vault",true);
        myMap.put("parlor",true);
        myMap.put("secret room",true);
        foyer();
        while(!userInput.equalsIgnoreCase("word")) {
            switch (userInput) {
                case "foyer":
                    foyer();
                    break;
                case "front room":
                    frontRoom();
                    break;
                case "library":
                    library();
                    break;
                case "kitchen":
                    kitchen();
                    break;
                case "dining room":
                    diningRoom();
                    break;
                case "vault":
                    vaultRoom();
                    break;
                case "parlor":
                    parlorRoom();
                    break;
                case "secret room":
                    secretRoom();
                    break;
                case "quit":
                    quit();
                    break;
            }

        }

    }
    public static String foyer(){
        Scanner kd = new Scanner(System.in);
        count+=1;
        if(myMap.get("foyer")) {
            earning += getRandomNumberInRange(0, 1000);
            myMap.put("foyer",false);
            arr[i]="dead scorpion";
            i++;
        }
        System.out.println("You are in room 1");
        System.out.println("dead scorpion");
        System.out.println("Until now you have earned: " + earning);
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
        count+=1;
        if(myMap.get("front room")) {
            earning += getRandomNumberInRange(0, 1000);
            myMap.put("front room",false);
            arr[i]="piano";
            i++;
        }
        System.out.println("You are in room 2");
        System.out.println("piano");
        System.out.println("Until now you have earned: " + earning);
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
        count+=1;
        if(myMap.get("library")) {
            earning += getRandomNumberInRange(0, 1000);
            myMap.put("library",false);
            arr[i]="spiders";
            i++;
        }
        System.out.println("You are in room 3");
        System.out.println("spiders");
        System.out.println("Until now you have earned: " + earning);
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
        count+=1;
        if(myMap.get("kitchen")) {
            earning += getRandomNumberInRange(0, 1000);
            myMap.put("kitchen",false);
            arr[i]="bats";
            i++;
        }
        System.out.println("You are in room 4");
        System.out.println("bats");
        System.out.println("Until now you have earned: " + earning);
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
        count+=1;
        if(myMap.get("dining room")) {
            earning += getRandomNumberInRange(0, 1000);
            myMap.put("dining room",false);
            arr[i]="dust adn empty box";
            i++;
        }
        System.out.println("You are in room 5");
        System.out.println("dust and empty box");
        System.out.println("Until now you have earned: " + earning);
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

    public static String vaultRoom() {
        Scanner kd = new Scanner(System.in);
        count += 1;
        if(myMap.get("vault")) {
            earning += getRandomNumberInRange(0, 1000);
            myMap.put("vault",false);
            arr[i]="3 walking skeletons";
            i++;
        }

        System.out.println("You are in room 6 - Vault");
        System.out.println("3 walking skeletons");
        System.out.println("Until now you have earned: " + earning);
        if (key) {
            System.out.println("Do you want to go east?");
            String answer = kd.nextLine();
            Random random = new Random();
            int nextInt = random.nextInt(4);
            if (answer.equalsIgnoreCase("east")) {

                if (nextInt == 0) {
                    userInput = "secret room";
                    key = false;
                } else {
                    userInput = "parlor";
                }

            } else if (answer.equalsIgnoreCase("quit")) {
                userInput = "quit";
            }
        } else {

            System.out.println("Do you want to go to room 7 or 8?");
            String answer = kd.nextLine();

            if (answer.equalsIgnoreCase("eight")) {
                userInput = "secret room";

            } else if (answer.equalsIgnoreCase("seven")) {
                userInput = "parlor";
            } else {
                userInput = "quit";

            }

        }
        return userInput;
    }
    public static String parlorRoom()
    {
        Scanner kd = new Scanner(System.in);
        count+=1;
        if(myMap.get("parlor")) {
            earning += getRandomNumberInRange(0, 1000);
            myMap.put("parlor",false);
            arr[i]="Treasure chest";
            i++;
        }
        System.out.println("You are in room 7 - Parlor");
        System.out.println("Treasure chest");
        System.out.println("Until now you have earned: " + earning);
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
        count+=1;
        if(myMap.get("secret room")) {
            earning += getRandomNumberInRange(0, 1000);
            myMap.put("secret room",false);
            arr[i]="pile of gold";
            i++;
        }
        System.out.println("You are in room 8");
        System.out.println("pile of gold");
        System.out.println("Until now you have earned: " + earning);
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

    public static String quit() {
        Random random=new Random();
        int nextInt = random.nextInt(4);
        if (nextInt == 0) {
            System.out.println("A ghost is following you");

        }
        System.out.println("The number of rooms you visited:" + count);
        System.out.println("The amount of money you have earned :" + earning);
        System.out.println("You have seen :" + Arrays.toString(arr));
        userInput="word";
        return userInput;
    }
    public static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
