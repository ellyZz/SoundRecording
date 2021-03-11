package model;

import model.enums.MusicStyle;

import java.util.Objects;

public abstract class Track {
    private String name;
    private double duration;
    private MusicStyle style;

    protected Track(String name, double duration, MusicStyle style) {
        this.name = name;
        this.duration = duration;
        this.style = style;
    }

    public String getName() {
        return name;
    }

    public double getDuration() {
        return duration;
    }

    public MusicStyle getStyle() {
        return style;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setStyle(MusicStyle style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(name, track.name) && Objects.equals(duration, track.duration) && style == track.style;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, duration, style);
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", style=" + style +
                '}';
    }
}
