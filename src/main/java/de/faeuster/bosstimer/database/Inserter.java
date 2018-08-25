package de.faeuster.bosstimer.database;

import de.faeuster.bosstimer.pojo.Boss;
import de.faeuster.bosstimer.pojo.TimeSlot;
import org.omg.CORBA.TIMEOUT;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Inserter {


    public static void main(String[] args) {
        Inserter i = new Inserter();
        i.insert();
    }

    LocalTime x1 = LocalTime.of(0, 15, 0, 0);
    LocalTime x2 = LocalTime.of(2, 0, 0, 0);
    LocalTime x3 = LocalTime.of(5, 0, 0, 0);
    LocalTime x4 = LocalTime.of(9, 0, 0, 0);
    LocalTime x5 = LocalTime.of(12, 0, 0, 0);
    LocalTime x6 = LocalTime.of(16, 0, 0, 0);
    LocalTime x7 = LocalTime.of(19, 0, 0, 0);
    LocalTime x8 = LocalTime.of(22, 15, 0, 0);

    public void insert() {
        try {


            Database instance = Database.getInstance();

            //Monday
            List<Boss> bosses = new ArrayList<>();
            Boss boss1 = new Boss("Kutum", DayOfWeek.MONDAY, TimeSlot.SLOT1);
            bosses.add(boss1);
            Boss boss2 = new Boss("Karanda", DayOfWeek.MONDAY, TimeSlot.SLOT2);
            bosses.add(boss2);
            Boss boss3 = new Boss("Kzarka", DayOfWeek.MONDAY, TimeSlot.SLOT3);
            bosses.add(boss3);
            Boss boss4 = new Boss("Kzarka", DayOfWeek.MONDAY, TimeSlot.SLOT4);
            bosses.add(boss4);
            Boss boss5 = new Boss("Nouver", DayOfWeek.MONDAY, TimeSlot.SLOT5);
            bosses.add(boss5);
            Boss boss6 = new Boss("Kutum", DayOfWeek.MONDAY, TimeSlot.SLOT6);
            bosses.add(boss6);
            Boss boss7 = new Boss("Nouver", DayOfWeek.MONDAY, TimeSlot.SLOT7);
            bosses.add(boss7);
            Boss boss8 = new Boss("Kzarka", DayOfWeek.MONDAY, TimeSlot.SLOT8);
            bosses.add(boss8);

            Boss boss9 = new Boss("Karanda", DayOfWeek.TUESDAY, TimeSlot.SLOT1);
            bosses.add(boss9);
            Boss boss10 = new Boss("Kutum", DayOfWeek.TUESDAY, TimeSlot.SLOT2);
            bosses.add(boss10);
            Boss boss11 = new Boss("Kzarka", DayOfWeek.TUESDAY, TimeSlot.SLOT3);
            bosses.add(boss11);
            Boss boss12 = new Boss("Kutum", DayOfWeek.TUESDAY, TimeSlot.SLOT4);
            bosses.add(boss12);
            Boss boss13 = new Boss("Offin", DayOfWeek.TUESDAY, TimeSlot.SLOT5);
            bosses.add(boss13);
            Boss boss14 = new Boss("Nouver", DayOfWeek.TUESDAY, TimeSlot.SLOT6);
            bosses.add(boss14);
            Boss boss15 = new Boss("Karanda", DayOfWeek.TUESDAY, TimeSlot.SLOT7);
            bosses.add(boss15);
            Boss boss16 = new Boss("Kzarka", DayOfWeek.TUESDAY, TimeSlot.SLOT8);
            bosses.add(boss16);
            Boss boss17 = new Boss("Nouver", DayOfWeek.TUESDAY, TimeSlot.SLOT8);
            bosses.add(boss17);

            Boss boss18 = new Boss("Kutum", DayOfWeek.WEDNESDAY, TimeSlot.SLOT1);
            bosses.add(boss18);
            Boss boss19 = new Boss("Karanda", DayOfWeek.WEDNESDAY, TimeSlot.SLOT2);
            bosses.add(boss19);
            Boss boss20 = new Boss("Kzarka", DayOfWeek.WEDNESDAY, TimeSlot.SLOT3);
            bosses.add(boss20);
            Boss boss21 = new Boss("Karanda", DayOfWeek.WEDNESDAY, TimeSlot.SLOT4);
            bosses.add(boss21);
            Boss boss23 = new Boss("Kzarka", DayOfWeek.WEDNESDAY, TimeSlot.SLOT6);
            bosses.add(boss23);
            Boss boss24 = new Boss("Kutum", DayOfWeek.WEDNESDAY, TimeSlot.SLOT7);
            bosses.add(boss24);
            Boss boss25 = new Boss("Kzarka", DayOfWeek.WEDNESDAY, TimeSlot.SLOT8);
            bosses.add(boss25);
            Boss boss26 = new Boss("Karanda", DayOfWeek.WEDNESDAY, TimeSlot.SLOT8);
            bosses.add(boss26);

            Boss boss27 = new Boss("Nouver", DayOfWeek.THURSDAY, TimeSlot.SLOT1);
            bosses.add(boss27);
            Boss boss28 = new Boss("Kutum", DayOfWeek.THURSDAY, TimeSlot.SLOT2);
            bosses.add(boss28);
            Boss boss29 = new Boss("Nouver", DayOfWeek.THURSDAY, TimeSlot.SLOT3);
            bosses.add(boss29);
            Boss boss30 = new Boss("Kutum", DayOfWeek.THURSDAY, TimeSlot.SLOT4);
            bosses.add(boss30);
            Boss boss31 = new Boss("Nouver", DayOfWeek.THURSDAY, TimeSlot.SLOT5);
            bosses.add(boss31);
            Boss boss32 = new Boss("Kutum", DayOfWeek.THURSDAY, TimeSlot.SLOT6);
            bosses.add(boss32);
            Boss boss33 = new Boss("Offin", DayOfWeek.THURSDAY, TimeSlot.SLOT7);
            bosses.add(boss33);
            Boss boss34 = new Boss("Karanda", DayOfWeek.THURSDAY, TimeSlot.SLOT8);
            bosses.add(boss34);

            Boss boss35 = new Boss("Kzarka", DayOfWeek.FRIDAY, TimeSlot.SLOT1);
            bosses.add(boss35);
            Boss boss36 = new Boss("Nouver", DayOfWeek.FRIDAY, TimeSlot.SLOT2);
            bosses.add(boss36);
            Boss boss37 = new Boss("Karanda", DayOfWeek.FRIDAY, TimeSlot.SLOT3);
            bosses.add(boss37);
            Boss boss38 = new Boss("Kutum", DayOfWeek.FRIDAY, TimeSlot.SLOT4);
            bosses.add(boss38);
            Boss boss39 = new Boss("Karanda", DayOfWeek.FRIDAY, TimeSlot.SLOT5);
            bosses.add(boss39);
            Boss boss40 = new Boss("Nouver", DayOfWeek.FRIDAY, TimeSlot.SLOT6);
            bosses.add(boss40);
            Boss boss41 = new Boss("Kzarka", DayOfWeek.FRIDAY, TimeSlot.SLOT7);
            bosses.add(boss41);
            Boss boss42 = new Boss("Kutum", DayOfWeek.FRIDAY, TimeSlot.SLOT8);
            bosses.add(boss42);
            Boss boss43 = new Boss("Kzarka", DayOfWeek.FRIDAY, TimeSlot.SLOT8);
            bosses.add(boss43);


            Boss boss44 = new Boss("Karanda", DayOfWeek.SATURDAY, TimeSlot.SLOT1);
            bosses.add(boss44);
            Boss boss45 = new Boss("Offin", DayOfWeek.SATURDAY, TimeSlot.SLOT2);
            bosses.add(boss45);
            Boss boss46 = new Boss("Nouver", DayOfWeek.SATURDAY, TimeSlot.SLOT3);
            bosses.add(boss46);
            Boss boss47 = new Boss("Kutum", DayOfWeek.SATURDAY, TimeSlot.SLOT4);
            bosses.add(boss47);
            Boss boss48 = new Boss("Nouver", DayOfWeek.SATURDAY, TimeSlot.SLOT5);
            bosses.add(boss48);
            Boss boss49 = new Boss("Quint/Muraka", DayOfWeek.SATURDAY, TimeSlot.SLOT6);
            bosses.add(boss49);
            Boss boss50 = new Boss("Karanda", DayOfWeek.SATURDAY, TimeSlot.SLOT7);
            bosses.add(boss50);
            Boss boss51 = new Boss("Kzarka", DayOfWeek.SATURDAY, TimeSlot.SLOT7);
            bosses.add(boss51);


            Boss boss52 = new Boss("Nouver", DayOfWeek.SUNDAY, TimeSlot.SLOT1);
            bosses.add(boss52);
            Boss boss521 = new Boss("Kutum", DayOfWeek.SUNDAY, TimeSlot.SLOT1);
            bosses.add(boss521);
            Boss boss53 = new Boss("Kzarka", DayOfWeek.SUNDAY, TimeSlot.SLOT2);
            bosses.add(boss53);
            Boss boss54 = new Boss("Kutum", DayOfWeek.SUNDAY, TimeSlot.SLOT3);
            bosses.add(boss54);
            Boss boss55 = new Boss("Nouver", DayOfWeek.SUNDAY, TimeSlot.SLOT4);
            bosses.add(boss55);
            Boss boss56 = new Boss("Kzarka", DayOfWeek.SUNDAY, TimeSlot.SLOT5);
            bosses.add(boss56);
            Boss boss57 = new Boss("Vell", DayOfWeek.SUNDAY, TimeSlot.SLOT6);
            bosses.add(boss57);
            Boss boss58 = new Boss("Karanda", DayOfWeek.SUNDAY, TimeSlot.SLOT7);
            bosses.add(boss58);
            Boss boss59 = new Boss("Nouver", DayOfWeek.SUNDAY, TimeSlot.SLOT8);
            bosses.add(boss59);
            Boss boss60 = new Boss("Kzarka", DayOfWeek.SUNDAY, TimeSlot.SLOT8);
            bosses.add(boss60);

            instance.bulkImport(bosses);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.exit(0);
        }
    }
}
