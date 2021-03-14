package container;

import model.Track;
import service.Manipulate;
import static model.enums.MusicStyle.*;
import java.util.ArrayList;
import java.util.List;



public class Disk {
    private List<Track> tracklist = new ArrayList<>();
    private Manipulate service = new Manipulate();

    public void disc() {
        tracklist.add(new Track("Avenged Sevenfold - Nightmare ", 6.11, ROCK));
        tracklist.add(new Track("Jay-Z feat. Alicia Keys - Empire State of Mind ", 4.41, HIPHOP));
        tracklist.add(new Track("Five Finger Death Punch - Jekyll And Hyde", 4.59, ROCK));
        tracklist.add(new Track("Fort Minor - Remember The Name ", 3.48, HIPHOP));
        tracklist.add(new Track("Ed Sheeran - Shape of You", 4.23, POP));
        tracklist.add(new Track("Slipknot - Unsainted ", 4.20, ROCK));
        tracklist.add(new Track("Adele - Skyfall ", 4.46, POP));
        tracklist.add(new Track("Ludovico Einaudi - Fly", 4.39, CLASSIC));

        service.getTrackList(tracklist);
        service.getTotalDuration(tracklist);
        service.sortingByStyle(tracklist, HIPHOP);
        service.findByRange(4.21, 4.40, tracklist);
    }
}
