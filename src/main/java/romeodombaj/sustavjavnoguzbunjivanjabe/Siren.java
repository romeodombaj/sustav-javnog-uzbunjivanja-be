package romeodombaj.sustavjavnoguzbunjivanjabe;

import jakarta.persistence.*;

@Entity
@Table(name = "sirens")
public class Siren {

    @Id
    private int id;
    private String name;
    private String state;
    private int soundType;
    private int activity;

    protected Siren() {}

    public Siren(int id, String name, String state, int soundType, int activity) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.soundType = soundType;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return String.format(
                "Siren[id=%d, name='%s', state='%s', soundType=%d, activity=%d]",
                id, name, state, soundType, activity);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public int getSoundType() {
        return soundType;
    }

    public int getActivity() {
        return activity;
    }
}
