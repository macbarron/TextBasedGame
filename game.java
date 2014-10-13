import java.util.*;

public class game {
	
	public static void main(String[] args) {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
		System.out.println(" ______   _   _       _    _   ______ ");
		System.out.println("|  _   | | | | |     | |  |_| |  ____|");
		System.out.println("| |_|  | | | | |     | |      | |____ ");
		System.out.println("|  _  |  | | | |     | |      |____  |");
		System.out.println("| |_|  | | | | |___  | |___    ____| |");
		System.out.println("|______| |_| |_____| |_____|  |______|");
		System.out.println("\n\n\n");
        pauseTime(800);
		System.out.println(" _____  _____   _   _  _____  _    _  _____  _   _  ____    _____ ");
		System.out.println("|  _  ||  _  | | | | ||   __|| |  | ||_   _|| | | ||  _ |  |   __|");
		System.out.println("| |_| || | |  || |_| ||  |__ |  |_| |  | |  | | | || | ||  |  |__ ");
		System.out.println("|  _  || | |  ||     ||   __||  _   |  | |  | | | || |_||_ |   __|");
		System.out.println("| | | || |_|  | |   | |  |__ | | |  |  | |  | |_| ||  __  ||  |__ ");
		System.out.println("|_| |_||_____|   |_|  |_____||_|  |_|  |_|  |_____||_|  |_||_____|");
        System.out.println("\n\n\n");
        pauseTime(800);
        Scanner key = new Scanner(System.in);
        System.out.println("Press Enter!");
        key.nextLine();
        System.out.println("\n\n\n");
        mainMenu();
	}

    public static void pauseTime(int milliseconds) {
        try { 
            Thread.sleep(milliseconds); 
        } catch(InterruptedException e) { 
        } 
    }

	public static void mainMenu() {
        System.out.println("MAIN MENU");
        System.out.println();
        System.out.println("1. New Game");
        System.out.println("2. Load Game");
        System.out.println("3. How to Play");
        System.out.println("4. Quit Game\n");
        Scanner key = new Scanner(System.in);
        int option;
        try {
            option = key.nextInt();
            if (option == 1) {
                game();
            } else if (option == 2) {
                loadGame();
            } else if (option == 3) {
                howToPlay();
            } else if (option == 4) {
                System.exit(0);
            } else {
                System.out.println("\n -- Bitch, just pick one of the options"
                    + " below. \n");
                pauseTime(800);
                System.out.println(" -- Dumbass... \n");
                pauseTime(800);
                mainMenu();  
            }                 
        } catch(InputMismatchException e) {
            System.out.println("\n -- Bitch, just pick one of the options"
                + " below. \n");
            pauseTime(800);
            System.out.println(" -- Dumbass... \n");
            pauseTime(800);
            mainMenu();
        }
	}

    public static void game() {
        System.out.println("You wake up in" Player.getCurrentLocation());
        while (true) {
             Scanner scanner = new Scanner(System.in);
            ArrayList<String> list = new ArrayList<String>();
            System.out.println("What do /b/ ?");
            String[] input = scanner.nextLine().split("\\s+");        
            for (String i : input) {
                list.add(i);               
            }
            /*some function call */
            }
        }
        System.exit(0);
    }

    public static void

    public static void loadGame() {
        //Stuff for load game
        System.exit(0);
    }

    public static void howToPlay() {
        //Stuff for how to play
        System.exit(0);
    }
}