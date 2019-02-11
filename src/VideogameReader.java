import java.io.File;
import java.util.Scanner;
import java.util.List;

public class VideogameReader
{
    public static void main(String[] args) throws Exception {
        String filename = "Game Spreadsheet.csv";
        File inputFile = new File(filename);
        if (!inputFile.exists())
            System.out.println(filename + " cannot be found.");
        else {

            Scanner input = new Scanner(inputFile);

            Videogames games = new Videogames();

            String currentLine;
            String[] gameData;
            Videogame game;
            String name, genre, creator;
            int year;
            double gigs;
            boolean single, multi;

            input.nextLine();
            while (input.hasNextLine()) {
                currentLine = input.nextLine();
                gameData = currentLine.split(",");
                name = gameData[0];
                genre = gameData[1];
                creator = gameData[2];
                year = Integer.parseInt(gameData[3]);

                if (gameData[4].equals("1"))
                    single = true;
                else
                    single = false;
                if (gameData[5].equals("1"))
                    multi = true;
                else
                    multi = false;
                gigs = Double.parseDouble(gameData[6]);
                game = new Videogame(name, genre, creator, year,
                        single, multi, gigs);

                games.addGame(game);
            } //end while hasNext
            input.close();

            System.out.println(games);
            System.out.println();
            Videogame theGame = games.getVideogame("God Of War");
            System.out.println(theGame);
            System.out.println();
            List<Videogame> someGames = games.getGenre("Action Adventure");
            for (Videogame v : someGames)
                System.out.println(v);
        }
    }
}
