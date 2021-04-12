package service;

import model.Track;
import model.enums.MusicStyle;

import java.util.List;

import static java.lang.System.*;

public class Manipulate {
    private static final String TOTAL_DURATION = "Total duration: ";
    private static final String MIN = "min";
    private Double duration = 0.0;

    public void getTrackList(List<Track> trackList) {
        for (Track t : trackList) out.println(t.toString());
        out.println();
    }

    public void getTotalDuration(List<Track> trackList) {
        for (Track track : trackList) {
            duration += track.getDuration();
        }
        out.println(TOTAL_DURATION + duration + MIN);
        out.println();
    }

    public void sortingByStyle(List<Track> trackList, MusicStyle style) {
        for (Track t : trackList) {
            if (t.getStyle() == style) {
                out.println(t.toString());
            }
        }
        for (Track t : trackList) {
            if (t.getStyle() != style) {
                out.println(t.toString());
            }
        }
        out.println();
    }

    public void findByRange(Double from, Double to, List<Track> trackList) {
        for (Track track : trackList) {
            if (track.getDuration() >= from && track.getDuration() <= to) {
                out.println(track.toString());
            }
        }
    }
}
