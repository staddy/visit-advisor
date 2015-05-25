package org.ipccenter.visitadvisor.model;

import java.sql.Timestamp;
import javax.persistence.*;


/**
 *
 * @author spitty
 */
@Entity
@Table(name = "events")
@NamedQuery(name = "Event.getAll", query = "SELECT e from Event e")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 254)
    private String name;

    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Timestamp time;

    public Event() {
    }

    public Event(String name, Timestamp time) {
        this.name = name;
        this.time = time;
    }

    // TODO: String to LocalDateTime
    public Event(String name, String time) {
        this.name = name;
        this.time = null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" + "name=" + name + ", time=" + time + '}';
    }
    
}
