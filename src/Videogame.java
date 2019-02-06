public class Videogame
{
    //instance variables
    private String game;
    private String genre;
    private String creator;
    private int year;
    private boolean singleplayer;
    private boolean multiplayer;
    private double gbSize;

   //constructor
   public Videogame(String game, String genre, String creator, int year, boolean singleplayer, boolean multiplayer, double gbSize)
   {
       this.game = game;
       this.genre = genre;
       this.creator = creator;
       this.year = year;
       this.singleplayer = singleplayer;
       this.multiplayer = multiplayer;
       this.gbSize = gbSize;
   }

   //accessors
   public String getGame()         {return game;}
   public String getGenre()        {return genre;}
   public String getCreator()      {return creator;}
   public int getYear()            {return year;}
   public boolean isSingleplayer() {return singleplayer;}
   public boolean isMultiplayer()  {return multiplayer;}
   public double getGbSize()       {return gbSize;}

   public String toString()
   {
       return game + ", " + genre + ", " + creator + ", " + year + ", " + singleplayer + ", " + multiplayer + ", " + gbSize;
   }

}
