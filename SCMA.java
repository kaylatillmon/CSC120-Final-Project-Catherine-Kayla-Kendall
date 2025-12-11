import java.util.Random;
import java.util.Scanner;

public class SCMA extends Building {
    public SCMA() {
        super("Smith College Museum Of Art", 
        "With your newly found survivor and map, you make it to the Smith College Museum Of Art.");
    }

    @Override
    public void play(Player player, Scanner input) {
        System.out.println("You enter Smith College Museum Of Art."); 
        System.out.println("You have no time to stall as a HORDE of Zombies start chasing you");
        System.out.println("You grab your friends hand and you run");
        System.out.println("As you run, you realize the only way to escape to safety is through");
        System.out.println("Do you go back to Tyler for supplies or do you fight your way through the Zombies?");
        System.out.print("(\n1 for Tyler; 2 to fight)");

        String choice = input.nextLine();
        switch (choice){
            case "1" -> {
            //Tyler tyler = new Tyler();
            //tyler.play(player, input);  //
            System.out.println("After checking Tyler, you make your way back to Smith College Museum of Art...\n");
            play(player, input);        // back to SCMA menu
            return;
        }
            case "2" -> {
                playChallenges(player, input);
            }
        }

    }
    private void playChallenges(Player player, Scanner input) {
    System.out.println("\nYou have decided to fight");
    artChallenge1(player, input);
}


private void artChallenge1(Player player, Scanner input){
    System.out.println("For the next challenge the Museum Docent forces you to play rock, paper, scissors to pass.");
    System.out.println("Dare you say or spell the wrong thing, death may be at your door. ");
    Random random = new Random();
    String [] choices = {"rock","paper","scissors"};
    
    while (true) { 
        System.out.println("Enter your move (rock, paper or scissors):");
        String playerMove = input.nextLine().toLowerCase();

        if (!playerMove.equals("rock") && !playerMove.equals("scissors") && !playerMove.equals("paper")){
            System.out.println("HOW DARE YOU! Say a valid move, your life is on the line. (-10 Health)");
            player.changeHealth(-10);
            continue;
        }

        String docentMove = choices [random.nextInt(choices.length)];
        System.out.println("The docent chose: " + docentMove);

        if (playerMove.equals(docentMove)){
            System.out.println("It's a tie!");
        } else if (
            (playerMove.equals("rock") && docentMove.equals("scissors")) ||
            (playerMove.equals("paper") && docentMove.equals("rock")) ||
            (playerMove.equals ("scissors") && docentMove.equals("paper"))
        ) {
            System.out.println("Good job!");
            System.out.println("Now its time to try the next challenge!");
            artChallenge2(player,input);
        } else {
            System.out.println("TRY AGAIN!");
        }
        
        }
}

private void artChallenge2(Player player, Scanner input) {
    System.out.println("Your second challenge is to unscramble this word:");
    System.out.println("\nuvseriv");

    String correctAnswer = "survive";

    System.out.print("Your answer: ");
    String answer = input.nextLine();

    if (answer.equalsIgnoreCase(correctAnswer)) {
        System.out.println("Correct! You've defeated this batch of zombies and make your way to the next challenge!");
        artChallenge3(player, input);
    } else {
        System.out.println("Incorrect, the zombie attacks (-100 Health)");
        player.changeHealth(-100);
        System.out.println("\nENDING: You get eaten by zombies");
    }
}

 private void artChallenge3(Player player, Scanner input){
    System.out.println("After beating the past two obstacles, only one stands in the way of you and safety.");
    System.out.println("You and your Smithie friend are tirelessly persisting, but the door code to the room connected to the untouched exit in the museum needs to be entered.");
    System.out.println("It seems as though someone tried to enter the code, but ran out of time. Only one number remains to be entered.");
    System.out.println("Find the pattern and enter the final numbers to complete the door code.");
    System.out.println("Numbers entered: 3 7 15 31 63 __ __");

    String choice = input.nextLine();

    if (choice == "127 255"){
        System.out.println("You have beat the game! You and your Smithie survivor made it to the John M. Green Hall PVTA bus stop.");
        System.out.println("The national guard picked the two of you up from Smith campus and took you to safety.");
    } else {
        System.out.println("You died. Game over :(");
    }

}
}



