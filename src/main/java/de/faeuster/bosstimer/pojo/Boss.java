package de.faeuster.bosstimer.pojo;

import lombok.*;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

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

    @NonNull
    private LocalTime spawnTime;
    @NonNull
    private DayOfWeek dayOfWeek;


    @Override
    public String toString() {
        return name + " Spawnzeit: " + dayOfWeek + " " + spawnTime.format(format);
    }
}
