package container;

import model.Track;
import service.Manipulate;

import java.util.ArrayList;
import java.util.List;

import static model.enums.MusicStyle.*;



public class Disk {
    private List<Track> trackList = new ArrayList<>();
    private Manipulate service = new Manipulate();

    public void disc() {
        trackList.add(new Track("Avenged Sevenfold - Nightmare ", 6.11, ROCK));
        trackList.add(new Track("Jay-Z feat. Alicia Keys - Empire State of Mind ", 4.41, HIPHOP));
        trackList.add(new Track("Five Finger Death Punch - Jekyll And Hyde", 4.59, ROCK));
        trackList.add(new Track("Fort Minor - Remember The Name ", 3.48, HIPHOP));
        trackList.add(new Track("Ed Sheeran - Shape of You", 4.23, POP));
        trackList.add(new Track("Slipknot - Unsainted ", 4.20, ROCK));
        trackList.add(new Track("Adele - Skyfall ", 4.46, POP));
        trackList.add(new Track("Ludovico Einaudi - Fly", 4.39, CLASSIC));

        service.getTrackList(trackList);
        service.getTotalDuration(trackList);
        service.sortingByStyle(trackList, HIPHOP);
        service.findByRange(4.21, 4.40, trackList);
    }
}
