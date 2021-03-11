package service;

import model.Track;
import model.enums.MusicStyle;

import java.util.List;

import static java.lang.System.*;

public class Manipulate {
    private static final String TOTAL_DURATION = "Total duration: ";
    private static final String MIN = " min";
    private Double duration = 0.0;

    public void getTracklist(List<Track> tracklist) {
        for (Track t : tracklist) out.println(t.toString());
        out.println();
    }

    public void getTotalDuration(List<Track> tracklist) {
        for (Track track : tracklist) {
            duration += track.getDuration();
        }
        out.println(TOTAL_DURATION + duration + MIN);
        out.println();
    }

    public void sortingByStyle(List<Track> tracklist, MusicStyle style) {
        for (Track t : tracklist) {
            if (t.getStyle() == style) {
                out.println(t.toString());
            }
        }
        for (Track t : tracklist) {
            if (t.getStyle() != style) {
                out.println(t.toString());
            }
        }
        out.println();
    }

    public void findByRange(Double from, Double to, List<Track> tracklist) {
        for (Track track : tracklist) {
            if (track.getDuration() >= from && track.getDuration() <= to) {
                out.println(track.toString());
            }
        }
    }
}
