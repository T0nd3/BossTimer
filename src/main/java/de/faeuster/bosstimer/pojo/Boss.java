package de.faeuster.bosstimer.pojo;

import lombok.*;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import static javax.persistence.GenerationType.AUTO;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Boss {
    @Transient
    private DateTimeFormatter format = DateTimeFormatter.ISO_TIME;
    @Id
    @GeneratedValue(strategy = AUTO)
    private int id;
    @NonNull
    private String name;

//  private LocalTime spawnTime;
    @NonNull
    private DayOfWeek dayOfWeek;

    @NonNull
    private TimeSlot timeSlot;

    @Override
    public String toString() {
        return name + " Spawnzeit: " + dayOfWeek + " TimeSlot: "+timeSlot;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }
}
