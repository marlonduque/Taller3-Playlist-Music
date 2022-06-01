package filterStream;


import Model.Song;
import main.Main;

import java.util.List;


public class Filter {

    /**
     *
     * @param args   To make the print in console, you must leave line 20 free .filter,
     *               and there are 3 lines more for what you want to inform you that if
     *               you must comment the 2 lines to not generate error
     */
    public static void main(String[] args) {
        List<Song> songList = Main.loadSongs();

        songList.stream()

                //Genres: Rock, Pop, Soul Classic, Music Electronic

                .filter(song -> song.getGnre().equalsIgnoreCase("Pop"))
               // .forEach(song ->System.out.println(song.getTitle()));
             //.forEach(song ->System.out.println(song.getDate()));
             //.forEach(song ->System.out.println(song.getDuration()));
                .forEach(song ->System.out.println(song.getFrontPage()));


    }
}
