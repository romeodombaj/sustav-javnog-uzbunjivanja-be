package romeodombaj.sustavjavnoguzbunjivanjabe;

import jakarta.persistence.*;

@Entity
@Table(name = "siren")
public class Siren {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    protected Siren() {}

    public Siren(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(
                "Siren[id=%d, name='%s']",
                id, name);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
