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
    artChallenge2(player, input);
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
}}



