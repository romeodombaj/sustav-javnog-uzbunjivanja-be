package romeodombaj.sustavjavnoguzbunjivanjabe;

import jakarta.persistence.*;

@Entity
@Table(name = "sirens")
public class Siren {

    @Id
    private int id;
    private String name;
    private String state;
    private String sound;
    private boolean activity;

    protected Siren() {}

    public Siren(int id, String name, String state, String sound, boolean activity) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.sound = sound;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return String.format(
                "Siren[id=%d, name='%s', state='%s', sound='%s', activity=%b]",
                id, name, state, sound, activity);
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

    public String getSound() {
        return sound;
    }

    public boolean getActivity() {
        return activity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void setActivity(boolean activity) {
        this.activity = activity;
    }
}
