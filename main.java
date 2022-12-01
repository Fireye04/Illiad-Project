import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("\nDear Fabled hero, \nyou have been summoned by his majesty Agamemnon of Argos. \nYou are required to set sail for Troy with great haste or we will set Corinth to flames.\n");
        
        int cNum = 0;
        String choice = "";
        boolean inloop = true;
        while (inloop) {

            System.out.println("Do you accept? (1 for yes, 2 for no) ");
            choice = in.nextLine();
            

            try {
                cNum = Integer.parseInt(choice);
                if (cNum == 1 || cNum == 2) {
                    inloop = false;
                } else {
                    System.out.println("bad numberz");
                }
                
             }
             catch (NumberFormatException e) {
                System.out.println("that's a word. words are not numbers.");
             }

        }
        
        if (cNum == 1) {
            System.out.println("You have chosen to set sail at dawn, \nyour wife sends you off with her best wishes and only mildly threatens to castrate you if you don't return with honour.");
        } else {
            System.out.println("You have chosen not to set sail, \nyour wife and her lover from Lesbos have killed you with arsenic in your soup. \nYou are dead.");
            dead();
        }
        
        System.out.println("Before you set sail you chose to recruit a first officer for your fleet. \n Select a first officer. \n1) Ophelia, Daughter of Athena, Great hero of Athens \n2) Atlas, Son Of Poseidon, Great saviour of Myceaene \n3) Daryl, Some Guy");
        
        int cNum = 0;
        String choice = "";
        boolean inloop = true;

        while (inloop) {

            System.out.println("Who do you chose? 1 for Ophelia, 2 for Atlas, 3 for Daryl");
            choice = in.nextLine();
            

            try {
                cNum = Integer.parseInt(choice);
                if (cNum == 1 || cNum == 2 || cNum == 3) {
                    inloop = false;
                } else {
                    System.out.println("bad numberz");
                }
                
            } catch (NumberFormatException e) {
                System.out.println("that's a word. words are not numbers.");
            }

        }

        System.out.println("Go to the shop?");
        System.out.println("Rope \nEarwax \nMagic Mirror \n Wood");

    }
    //haha penis so gay haha
    public static int inputLoop (String prompt, int options) {

    }

    public static void dead () {
        System.out.println("u ded");
        return;
    }

}