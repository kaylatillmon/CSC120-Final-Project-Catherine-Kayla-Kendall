import java.util.Scanner;

public class AinsworthGym extends Building {

    public AinsworthGym() {
        super(
            "Ainsworth Gym",
            "You wake up alone in Ainsworth. The lights flicker and distant groans echo off the walls."
        );
    }

    /**
     * This is the sequence logic for Ainsworth. 
     * For Ainsworth, players have a choice to explore the locker room, basketball court, and the climbing wall.
     * 
     */
    @Override
    public void play(Player player, Scanner input) {
        System.out.println("\nYou look around the gym. You see:");
        System.out.println("1) The Locker Room door, slightly open");
        System.out.println("2) The Basketball Court, lights flickering");
        System.out.println("3) The Climbing Wall, cords hanging");

        System.out.print("\nWhere do you go? (1/2/3) ");
        String choice = input.nextLine();

        switch (choice) {
            case "1" -> exploreLockerRoom(player, input);
            case "2" -> exploreBasketballCourt(player, input);
            case "3" -> exploreclimbingWall(player, input);
            default -> {
                System.out.println("\nYou freeze, unable to decide where to go to next, you hear groaning in the distance. The groans get closer...");
                System.out.println("\nA group of zombies surround you as you're stuck, unable to decide where to go next");
                player.changeHealth(-100);
                System.out.println("\nYou are now dead");
            }
        }
    }

    // Locker room path
    private void exploreLockerRoom(Player player, Scanner input) {
        System.out.println("You walk towards the door of the locker room.");
        System.out.println("You hear something in the distance");
        System.out.println("\nYou push the door open and squint, you see a dark shadow-y figure like at the end of hallway");
        System.out.println("Do you: ");
        System.out.println("a) Quietly sneak past this figure and make your way toward the glowing red sign that says 'EXIT'");
        System.out.println("b) Push down a metal locker door to try and draw attention from you to the sound, distracting the dark shadowy figure");
        
        System.out.print("\nWhat's your choice, a or b? ");
        String action = input.nextLine().toLowerCase();

        switch (action) {
            case "a" -> {
                System.out.println("You move towards the exit sign slowly, as quiet as a mouse.");
                System.out.println("As you get closer to the shape, you see it's a zombie athlete staring blankly at their shoes");
                System.out.println("You maneuver slowly and quietly pass the athlete, letting the glow of the 'EXIT' sign guide your movement");
                System.out.println("\nCHALLENGE: You need to open the exit door without making ANY noise.");
                System.out.println("Pick a number between 1 and 10. If you pick the quiet number, you escape");
                System.out.print("Your number: ");
                String num = input.nextLine();
                if (num.equals("4")){
                    System.out.println("You quietly pry the door open. It barely creaks.");
                    System.out.println("\nYou easily slip out into the cool air and leave Ainsworth in the distance.");
                    System.out.println("\nYour happiness is short lived as you realize you need to make your way to Tyler to get supplies");
                    //play.Tyler
                }
                else {
                    System.out.println("\nThe door lets out a loud screech.");
                    System.out.println("The athlete breaks out of their trance and charges towards you");
                    System.out.println("It pulls you back from the door and slams your head into the locker (-30 health)");
                    player.changeHealth(-30);
                    System.out.println("You kick it away and manage to escape the locker room, injured");
                    System.out.println("You feel air on your skin and you know you're in dire need of supplies");
                    System.out.println("\nYou remember that Tyler House has aid supplies so you make your way to Tyler, stumbling");
                    System.out.println("\nCurrent health: " + player.getHealth());
                }
            }
            case "b" -> {
                System.out.println("\nThe locker comes tumbling down, the sound of metal echoes through the locker room");
                System.out.println("\nThe dark shadow-y figure starts moving towards the noise");
                System.out.println("Do you: ");
                System.out.println("1) Hide in a locker");
                System.out.println("2) Crawl under a bench");
                System.out.print("\nYour choice? (1/2)");
                String hideChoice = input.nextLine();
                if (hideChoice.equals("1")) {
                    System.out.println("You squeeze into the locker, close the door and peak out");
                    System.out.println("The zombie walks past your locker");
                    System.out.println("When you see the Zombie is far enough from your locker, you slip out");
                    System.out.println("You see a side door propped open");
                    System.out.println("You sprint through it out of Ainsworth");
                }
                else if(hideChoice.equals("2")){
                    System.out.println("You dive under the bench, holding your breath");
                    System.out.println("The zombie sees your shoelace peaking out of the bench");
                    System.out.println("The zombie pulls you out from the bench and slams you down");
                    player.changeHealth(-100);
                    System.out.println("\nENDING: Found under the bench");
                }
            }
            default -> {
                System.out.println("You stand in the doorway, unable to make a decision");
                System.out.println("The dark figure at the end of the hallway spots you and charges towards you");
                player.changeHealth(-100);
                System.out.println("\nENDING: Unable to decide, the Zombie catches you");
            }
        }

    }

    // Basketball court path 
    private void exploreBasketballCourt(Player player, Scanner input) {
        System.out.println("\nYou step onto the basketball court, sneakers squeaking.");
        System.out.println("\nThe scoreboard is still on from an old game... Smith lost");
        System.out.println("\nA basketball slowly rolls across the floor, like someones pushed it towards you");

        System.out.println("Do you:");
        System.out.println("a) Pick up the ball and dribble it to see if anyone reacts to the sound");
        System.out.println("b) Ignore the ball and move along the edge of the court towards the exit door");

        System.out.print("\nYour choice? (a/b)");
        String action = input.nextLine().toLowerCase();

        switch (action) {
            case "a" -> {
                System.out.println("You grab the ball and start dribbling");
                System.out.println("\nCHALLENGE: A zombie player, attracted by the sound starts moving towards you");
                System.out.println("Do you:");
                System.out.println("1) Break their ankles, and run past them");
                System.out.println("2) Throw the ball at them as hard as you can");
                System.out.println("\nYour choice? (1/2) ");
                String num = input.nextLine();
                if (num.equals("1")){
                    System.out.println("You fake a crossover, then run to the other side");
                    System.out.println("The zombie stumbles. You reach the doors and shove them open");
                    System.out.println("\nYou escape");
                }
                else if (num.equals("2")){
                    System.out.println("\nYou throw the ball at them hard with all your strength");
                    System.out.println("It hits them but doesn't do anything to the Zombie ");
                    System.out.println("The Zombie, now upset, pushes you to the floor (-50 Health)");
                    player.changeHealth(-50);
                    System.out.println("You crawl away bleeding and hiding under the announcers table");
                    System.out.println("The zombie is now distracted with the ball");
                    System.out.println("\nYou take this time to escape towards the door, stumbling your way out");
                    System.out.println("\nYou know you're injured and that Tyler has aid supplies, so you make your way towards Tyler");
                    
                    
                }
            }
            case "b" -> {
                System.out.println("You move along the edge of the court");
                System.out.println("\nCHALLENGE: A zombie player steps in front of you, to defeat it, you must complete this riddle");
                System.out.println("\nHow do basketball players eat oreos? ");
                String correctAnswer = "they dunk them";
                String answer = input.nextLine();
                if (answer.equalsIgnoreCase(correctAnswer)) {
                    System.out.println("Correct! You've defeated the zombie and make your way to the exit");
                    System.out.println("\nYou make your way to Tyler because you have supplies to pick up");
                    
                }
                else {
                    System.out.println("Incorrect, the zombie attacks (-100 Health)");
                    player.changeHealth(-100);
                    System.out.println("\nENDING: You get eaten by zombies");
                }
            }
            default -> {
                System.out.println("You stand there doing nothing");
                System.out.println("Zombies slowly surround you");
                player.changeHealth(-100);
                System.out.println("\nENDING: Surrounded by Zombies, eaten");
            }
        }
        
    }

    // Climbing Wall Path 
    private void exploreclimbingWall(Player player, Scanner input) {
        System.out.println("\nYou head toward the climbing wall");
        System.out.println("The crash pads are messy and you notice ropes hanging down from the top of the wall");

        System.out.println("Do you:");
        System.out.println("a) Climb the wall to get a better view of the room and plan an escape route");
        System.out.println("b) Stay on the ground and search the crash pads for helpful clues and/or supplies");
        
        System.out.println("\nYour choice? (a/b) ");
        String action = input.nextLine().toLowerCase();

        switch (action) {
            case "a" -> {
                System.out.println("\nYou grab the rocks and start climbing");
                System.out.println("\nCHALLENGE: Halfway up, you hear zombies entering the room");
                System.out.println("\nIf you rush to the top, you might fall. If you go slowly the Zombies might spot you and attack");
                System.out.println("Do you: ");
                System.out.println("1) Climb quickly to the top");
                System.out.println("2) Move slowly and carefully, trying to be silent");
                
                System.out.print("\nYour choice? (1/2) ");
                String num = input.nextLine();

                if (num.equals("1")) {
                    System.out.println("You rush the next couple of rock holds");
                    System.out.println("One hand slips and you're hanging by one hand, burning. (-15 health) ");
                    player.changeHealth(-15);
                    System.out.println("\nYou somehow regain your footing and you see an upper-level exit door. You escape through there.");
                    System.out.println("\nYou're hand aches and you decide to go to Tyler to get some supplies");

                } else if (num.equals("2")) {
                    System.out.println("You climb very carefully, not making a sound");
                    System.out.println("\nYou make it to the top and see an upper-level exit door. You escape through the door");
                    System.out.println("\nYou know that there is somethings you must get at Tyler, so you make your way there.");

                } else {
                    System.out.println("\nYou hesitate mid-climb");
                    System.out.println("You lose your grip and fall to the floor (-100 health");
                    System.out.println("You're knocked out cold");
                    player.changeHealth(-100);
                    System.out.println("\nENDING: You fall to your death");
                }
            }
            case "b" -> {
                System.out.println("\nYou kneel down and start checking under the crash pads.");
                System.out.println("You don't find any supplies");
                System.out.println("\nCHALLENGE: As you stand up you hear shuffling near you");
                System.out.println("\nYou need to hide, quickly");
                System.out.println("Do you: ");
                System.out.println("1) Lie between to crash pads and pull one over you");
                System.out.println("2) Run behind the climbing wall structure");

                System.out.print("\nYour choice? (1/2) ");
                String num = input.nextLine();

                if (num.equals("1")) {
                    System.out.println("\nYou hide between the pads and pull one over yourself");
                    System.out.println("\nThe zombies shuffle past, stepping on you under the pads but not noticing you're there");
                    System.out.println("Eventually the shuffling gets quieter and quieter, until it stops all together");
                    System.out.println("You peak from under the pads and don't see any zombies");
                    System.out.println("\nYou get out from under and escape through the exit");
                    System.out.println("\nYou need supplies, so you make your way to Tyler ");

                } else if (num.equals("2")) {
                    System.out.println("\nYou hide behind the climbing wall");
                    System.out.println("\nA zombie rounds the corner and spots you, it attacks ! (-60 health) ");
                    player.changeHealth(-60);
                    System.out.println("You lead the zombie behind the wall and it gets stuck");
                    System.out.println("\nYou're able to escape!");
                    System.out.println("\nYou decide to go to Tyler to try and find supplies");
                    
                }
            } default -> {
                System.out.println("\nYou stand between the crash pads and the climbing wall, unsure what to do.");
                System.out.println("Zombies pour in and attack! (-100 health) ");
                player.changeHealth(-100);
                System.out.println("\nENDING: Death because you couldn't choose");
            }
        }  
        
    }
}
