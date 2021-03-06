package mainPlaylist;

import Model.Song;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    /**
     *
     * @return list 7 song
     */
    public static List<Song> loadSongs() {

        List<Song> listSong = new ArrayList<>();


        Song song1 = new Song("Dress you up", 1, 1984, "Pop", 3, new File("R-666382-1577578098-2518.jpg"), "The lyrics are based on a metaphor of fashion and sex, where he compares the act of dressing with passion.");
        Song song2 = new Song("Never", 1, 1985, "Rock", 4, new File("EhuFZuuWkAA5y0r.jpg"), " Is a song by the American band Heart. It was released as a single from the 1985 album");
        Song song3 = new Song("Smooth criminal", 1, 1988, "Pop", 4, new File("R-330401-1572223716-8688.jpg"), "The song is about a woman named Annie, who has been attacked in her apartment by an assailant.");
        Song song4 = new Song("Viva la vida", 1, 2011, "Pop", 6, new File("Viva-La-Vida-1-700x552.jpg"), " after the start of the French Revolution, in which the people rose up against the government.");
        Song song5 = new Song("I Want To Break Free", 1, 1984, "Rock", 4, new File("Freddie mercury (2).png"), "The theme of this mythical song could be translated as \"I want to free myself\".");
        Song song6 = new Song("Lonely together", 1, 2017, "Electronic Music", 3, new File("artworks-000345561189-aayaeg-t500x500.jpg"), "A song by Swedish disc jockey Avicii in collaboration with British singer Rita Ora.");
        Song song7 = new Song("Only the strong survive", 1, 1977, "Soul Classic", 5, new File("61SOyKnU1aL.jpg"), "This expression can describe the cruel world where only the strongest survive.");

        listSong.add(song1);
        listSong.add(song2);
        listSong.add(song3);
        listSong.add(song4);
        listSong.add(song5);
        listSong.add(song6);
        listSong.add(song7);


        return listSong;
    }
}
