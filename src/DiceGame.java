import java.util.Scanner;
import java.util.*;
import java.io.*;
public class DiceGame {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the number of players:");
            int numPlayers = in.nextInt();
            System.out.println("How many sides is your dice?");
            int numSides = in.nextInt();

            ArrayList<Player> players = new ArrayList<Player>();


            for (int i = 0; i < numPlayers; i++){
                System.out.println("Enter the player's name:");
                String name = in.next();
                Die die = new Die(numSides, 1);
                players.add(new Player(name, die));
                players.get(i).getDie().setNumSides(numSides);
                players.get(i).getDie().roll(numSides);
            }

            in.close();

            System.out.println(players.toString());

            decideWinner(players);

            File output = new File("output.txt");
            try {
                FileWriter fileWriter = new FileWriter(output);
                fileWriter.write(players.toString());
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("File should be found...");
            }

        }

        public static void decideWinner (ArrayList<Player> players){
            int max = 0;
            Player maxPlayer = players.get(0);



            for(int i = 0 ; i < players.size(); i++)
            {
                if(max < players.get(i).getDie().getValue())
                {
                    max = players.get(i).getDie().getValue();
                    maxPlayer = players.get(i);

                }
            }
            System.out.println(maxPlayer.getName() + " won the game.");
        }

    }


