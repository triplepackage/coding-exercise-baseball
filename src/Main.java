import com.Inning;
import com.Player;
import com.Game;
import com.PlayerGamePerformance;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {
        Hashtable<String, Player> players = new Hashtable<>();

		List<String> fileContents = Files.readAllLines(Paths.get("data").resolve("players.txt"));

		for(String line: fileContents){
		    String[]  t = line.split(",");
		    players.put(t[0], new Player(t[0], t[1], t[2]));
        }

        List<Path> gameFiles = Files.walk(Paths.get("data").toAbsolutePath())
                .filter(p -> p.toString().contains("game_"))
                .collect(Collectors.toList());



        for(Path path: gameFiles) {
            processGame(players, path);
        }
	}

	public static void processGame(Hashtable<String, Player> players, Path path){
	    try {
            List<String> fileContents = Files.readAllLines(path);

            String[] gameNumberArray = path.getFileName().toString().split("_");
            Integer gameNumber = Integer.parseInt(gameNumberArray[gameNumberArray.length-1].replace(".txt", ""));

            Game game = new Game(gameNumber);
            ArrayList<PlayerGamePerformance> playersGamePerformance = new ArrayList<>();
            for (int i = 0; i < fileContents.size(); i++) {
                //Read innings
                if (i == 0) {
                    game.setInnings(parseInning(fileContents.get(0)));
                } else {
                    //Read and process players performance
                    playersGamePerformance.add(parsePlayerGamePerformance(fileContents.get(i), players));
                }
            }

            printGameStats(game, playersGamePerformance);
        }
        catch (IOException error){
            System.out.println(error.toString());
        }
    }

	public static void printGameStats(Game game, ArrayList<PlayerGamePerformance> playersGamePerformance){
        System.out.println("**********************************************");
        System.out.println(String.format("Game: %-20s", game.getGameId()));
	    System.out.println("Visitor: " + game.getRunsAway());
        System.out.println("Home: " + game.getRunsHome());
        System.out.println("----------------------------------------------");
        System.out.println("Name                    Bat Avg   Slugging");

        for(PlayerGamePerformance playerPerformance: playersGamePerformance){
            String output = String.format("%-20s %10.3f %10.3f", playerPerformance.getPlayer().getFirstName() + " " + playerPerformance.getPlayer().getLastName(),
                    playerPerformance.getGameBattingAverage(), playerPerformance.getGameSluggingPercentage());
            System.out.println(output);
        }
    }

	public static ArrayList<Inning> parseInning(String csv){

        ArrayList<Inning> innings = new ArrayList<>();
        String[]  t = csv.split(",");

        for(int j = 0; j < t.length - 1; j = j+2){

            Inning inning;

            inning = new Inning(j/2 + 1, Integer.parseInt(t[j]), Integer.parseInt(t[j + 1]));
            innings.add(inning);
        }

        return innings;
    }

    public static PlayerGamePerformance parsePlayerGamePerformance(String csv, Hashtable<String, Player> players){
        String[] line = csv.split(",");
        PlayerGamePerformance performance = new PlayerGamePerformance(players.get(line[0]), Integer.parseInt(line[1]),
                Integer.parseInt(line[2]), Integer.parseInt(line[3]), Integer.parseInt(line[4]),
                Integer.parseInt(line[5]));

        return performance;
    }
}

