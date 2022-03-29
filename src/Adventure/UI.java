package Adventure;

import java.util.Scanner;

public class UI {
  Map map = new Map();
  Player player = new Player();

  UI() {
    player.getInventory().add(map.itemManager.getFist());
    System.out.println("Enter player name: ");
    player.setName(new Scanner(System.in).nextLine());

    int i = 0;
    Scanner scanner = new Scanner(System.in);
    String help = """
        Instructions:
        
        Enter N to go north.
        Enter S to go south.
        Enter W to go west.
        Enter E to go east.
        
        Write "Look" to get information about the room you are in.
        Write "Take" and then type the exact name of the item you want to take.
        Write "Inventory" to see the items you have picked up in your inventory.
        Write "Consume" to eat some food and replenish your health.
         
        Additionally, you can write HELP to view instructions again, or write EXIT to exit the program. ";
        
        """;
    player.setCurrentRoom(map.getRoom1());
    player.getCurrentRoom().addToCounter();
    System.out.println("Welcome to the game " + player.getName() + "!\n\n" + help);
    player.look();
    boolean loop = true;

    while (loop) {
      String gameFlow = scanner.nextLine();
      gameFlow = gameFlow.toUpperCase();

      switch (gameFlow) {
        case "E" -> {player.goEast() ;
          if (player.getCurrentRoom().getEnemies().size()>0)player.getCurrentRoom().fight(player,player.getCurrentRoom().getEnemies().get(0));
          player.look();
        }

        case "W" -> {player.goWest() ;
          if (player.getCurrentRoom().getEnemies().size()>0)player.getCurrentRoom().fight(player,player.getCurrentRoom().getEnemies().get(0));
          player.look();
        }
        case "S" -> {player.goSouth();
          if (player.getCurrentRoom().getEnemies().size()>0)player.getCurrentRoom().fight(player,player.getCurrentRoom().getEnemies().get(0));
          player.look();
        }
        case "N" -> {player.goNorth();
          if (player.getCurrentRoom().getEnemies().size()>0)
            player.getCurrentRoom().fight(player,player.getCurrentRoom().getEnemies().get(0));
          player.look();
        }

        case "HELP" -> System.out.println(help);

        case "LOOK" -> player.look();

        case "TAKE"       -> {
          System.out.println("Type the name of the item you want to pick up.");
          player.takeItem(scanner.nextLine());
        }
        case "DROP"       -> {
          System.out.println("Type the name of the item you want to drop.");
          player.dropItem(scanner.nextLine());
        }

        case "CONSUME"        -> {System.out.println("Type in the name of the item you want to eat, or type CANCEL.");
          player.eat(scanner.nextLine());
        }

        case "STATS"      -> System.out.println("You have "+player.getHealth()+" HP.");

        case "INVENTORY"  -> player.showInventory();

        case "EXIT"       -> loop = false;

        default -> {
          System.out.println("Wrong input.");
          i++;
          if (i > 2) {
            System.out.println("It seems you are confused. Here are the instructions again");
            System.out.println(help);
            i = 0;
          }
        }
      }
      if (player.getHealth()<=0){
        System.out.println("YOU DIED :-(...EXITING GAME...BEEP..BOOP....");loop=false;}
    }
  }
}
