import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int choice = 0;
        boolean iterate = true;

        /*
            Here's some sample code for some user input.
            It's a bit complicated, but that's for a reason.
            see, users are dumb. We can't let their dumbness crash the program.
            I'll explain what the code's doing line by line
         */

        // creating a Scanner object for User Input
        Scanner input = new Scanner(System.in);




        //do while loop to iterate until the user inputs a correct value
        //do while is used to run the code at least once,
        // and it will run until the iterate variable is set to false.
        // This is to guarantee the user has inputted either a 1 or a 2 and nothing else that will break the program
        do {
            // User input Prompt
            System.out.print("\nDo you want to (1) stab the monster or (2) make friends with it? ");

            //makes a new string called in and sets it to the user input
            String in = input.nextLine();

            //try is badass. It lets you run code that might throw an error,
            //then do things when an error is thrown
            //in this case, if the user inputs a word instead of a number java gets angry and throws an error
            //I'm using try here to make sure the user has inputted a number
            try {

                //choice is an int, so if the user inputs a string instead of an int this line throws an error
                //instead of stopping the program, the try automatically runs the code in "catch" below
                choice = Integer.parseInt(in);

                //if no error was thrown, that means the user inputted an int not a string. Yay!
                //That means the code moves on to here only if the user gave us an int
                // if you want to test it out uncomment the next line, run it, and try inputting a string. You won't see "got here!"
                //System.out.println("got here!");

                //Now we're checking if the user inputted one of the right numbers
                // this if statment makes sure choice is either 1 or 2 before setting iterate to false and ending the loop.
                if (choice == 1 || choice == 2) {
                    //sets iterate to false, ending the loop
                    iterate = false;

                } // if choice isn't a 1 or a 2, then it yells at the user.
                else {
                    System.out.println("Uh oh! Make sure you input just a 1 or a 2!");
                }
            } // First catch is only for a certain kind of error: a NumberFormatException.
            // That's what is thrown when a user inputs a string instead of an int
            catch (NumberFormatException nf) {
                //yells at the user
                System.out.println("Fun fact: words are, in fact, not numbers! Make sure you input just a 1 or a 2!");
            } //second catch will only run if there was an error of any kind, except the NumberFormatException above
            //which should never happen, but it's better to be safe than sorry
            //Fun fact: OW2 had some bad code that allowed people to glitch an ultimate by clicking 2 buttons at the same time
            //causing D-Day level bombardment on the enemy team just because some programmer thought "I'll just use a == instead of a >=
            // it'll never exceed 3, so we don't need a >=". dumbass.
            catch (Exception e) {
                System.out.println("What the hell happened here? Make sure you input just a 1 or a 2 for goodness sake!!");
            }

        } //finishes the do while loop
        //will only restart the loop if iterate = true
        while (iterate);
        //resets iterate for the next loop
        iterate = true;

        // runs eventA if choice is 1
        if (choice == 1) {
            eventA();
        } //runs eventB if choice is anything else
        //you could technically do an else if (choice == 2) here, but else is safer
        //because if choice isn't 1 or 2, then nothing happens and the program breaks
        //again this shouldn't be possible, but as a programmer you never know what's actually possible. NEVER.
        else {
            eventB();
        }

    }
    //function for eventA
    public static void eventA () {
        System.out.println("The monster dies");
    }
    //function for eventB
    public static void eventB () {
        System.out.println("The monster eats you");
    }

}
