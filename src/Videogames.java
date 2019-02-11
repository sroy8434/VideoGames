import java.util.ArrayList;
import java.util.List;

public class Videogames
{
    private ArrayList<Videogame> collection;

    public Videogames()
    {
        collection = new ArrayList<Videogame>();
    }

    public void addGame(Videogame v)
    {
        collection.add(v);
    }

    public Videogame getVideogame(String game)
    {
        for (Videogame v : collection)
            if (v.getGame().equals(game))
                return v;
        return null;
    }

    public List<Videogame> getGenre(String genre)
    {
        List<Videogame> theGenre = new ArrayList<Videogame>();
        for (Videogame v : collection)
            if (v.getGenre().equals(genre))
                theGenre.add(v);

        return theGenre;
    }

    public String toString()
    {
        String output = "";
        for (Videogame v : collection)
            output += v.toString() + "\n";

        return output;
    }

    public void sortByName()
    {
        for (int j = 0; j < collection.size(); j++)
        {

        }
    }
}
