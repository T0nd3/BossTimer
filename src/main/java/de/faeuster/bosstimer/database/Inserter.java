package de.faeuster.bosstimer.database;

import de.faeuster.bosstimer.pojo.Boss;

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
            Boss boss1 = new Boss("Kutum", x1, DayOfWeek.MONDAY);
            bosses.add(boss1);
            Boss boss2 = new Boss("Karanda", x2, DayOfWeek.MONDAY);
            bosses.add(boss2);
            Boss boss3 = new Boss("Kzarka", x3, DayOfWeek.MONDAY);
            bosses.add(boss3);
            Boss boss4 = new Boss("Kzarka", x4, DayOfWeek.MONDAY);
            bosses.add(boss4);
            Boss boss5 = new Boss("Nouver", x5, DayOfWeek.MONDAY);
            bosses.add(boss5);
            Boss boss6 = new Boss("Kutum", x6, DayOfWeek.MONDAY);
            bosses.add(boss6);
            Boss boss7 = new Boss("Nouver", x7, DayOfWeek.MONDAY);
            bosses.add(boss7);
            Boss boss8 = new Boss("Kzarka", x8, DayOfWeek.MONDAY);
            bosses.add(boss8);

            Boss boss9 = new Boss("Karanda", x1, DayOfWeek.TUESDAY);
            bosses.add(boss9);
            Boss boss10 = new Boss("Kutum", x2, DayOfWeek.TUESDAY);
            bosses.add(boss10);
            Boss boss11 = new Boss("Kzarka", x3, DayOfWeek.TUESDAY);
            bosses.add(boss11);
            Boss boss12 = new Boss("Kutum", x4, DayOfWeek.TUESDAY);
            bosses.add(boss12);
            Boss boss13 = new Boss("Offin", x5, DayOfWeek.TUESDAY);
            bosses.add(boss13);
            Boss boss14 = new Boss("Nouver", x6, DayOfWeek.TUESDAY);
            bosses.add(boss14);
            Boss boss15 = new Boss("Karanda", x7, DayOfWeek.TUESDAY);
            bosses.add(boss15);
            Boss boss16 = new Boss("Kzarka", x8, DayOfWeek.TUESDAY);
            bosses.add(boss16);
            Boss boss17 = new Boss("Nouver", x8, DayOfWeek.TUESDAY);
            bosses.add(boss17);

            Boss boss18 = new Boss("Kutum", x1, DayOfWeek.WEDNESDAY);
            bosses.add(boss18);
            Boss boss19 = new Boss("Karanda", x2, DayOfWeek.WEDNESDAY);
            bosses.add(boss19);
            Boss boss20 = new Boss("Kzarka", x3, DayOfWeek.WEDNESDAY);
            bosses.add(boss20);
            Boss boss21 = new Boss("Karanda", x4, DayOfWeek.WEDNESDAY);
            bosses.add(boss21);
            Boss boss23 = new Boss("Kzarka", x6, DayOfWeek.WEDNESDAY);
            bosses.add(boss23);
            Boss boss24 = new Boss("Kutum", x7, DayOfWeek.WEDNESDAY);
            bosses.add(boss24);
            Boss boss25 = new Boss("Kzarka", x8, DayOfWeek.WEDNESDAY);
            bosses.add(boss25);
            Boss boss26 = new Boss("Karanda", x8, DayOfWeek.WEDNESDAY);
            bosses.add(boss26);

            Boss boss27 = new Boss("Nouver", x1, DayOfWeek.THURSDAY);
            bosses.add(boss27);
            Boss boss28 = new Boss("Kutum", x2, DayOfWeek.THURSDAY);
            bosses.add(boss28);
            Boss boss29 = new Boss("Nouver", x3, DayOfWeek.THURSDAY);
            bosses.add(boss29);
            Boss boss30 = new Boss("Kutum", x4, DayOfWeek.THURSDAY);
            bosses.add(boss30);
            Boss boss31 = new Boss("Nouver", x5, DayOfWeek.THURSDAY);
            bosses.add(boss31);
            Boss boss32 = new Boss("Kutum", x6, DayOfWeek.THURSDAY);
            bosses.add(boss32);
            Boss boss33 = new Boss("Offin", x7, DayOfWeek.THURSDAY);
            bosses.add(boss33);
            Boss boss34 = new Boss("Karanda", x8, DayOfWeek.THURSDAY);
            bosses.add(boss34);

            Boss boss35 = new Boss("Kzarka", x1, DayOfWeek.FRIDAY);
            bosses.add(boss35);
            Boss boss36 = new Boss("Nouver", x2, DayOfWeek.FRIDAY);
            bosses.add(boss36);
            Boss boss37 = new Boss("Karanda", x3, DayOfWeek.FRIDAY);
            bosses.add(boss37);
            Boss boss38 = new Boss("Kutum", x4, DayOfWeek.FRIDAY);
            bosses.add(boss38);
            Boss boss39 = new Boss("Karanda", x5, DayOfWeek.FRIDAY);
            bosses.add(boss39);
            Boss boss40 = new Boss("Nouver", x6, DayOfWeek.FRIDAY);
            bosses.add(boss40);
            Boss boss41 = new Boss("Kzarka", x7, DayOfWeek.FRIDAY);
            bosses.add(boss41);
            Boss boss42 = new Boss("Kutum", x8, DayOfWeek.FRIDAY);
            bosses.add(boss42);
            Boss boss43 = new Boss("Kzarka", x8, DayOfWeek.FRIDAY);
            bosses.add(boss43);


            Boss boss44 = new Boss("Karanda", x1, DayOfWeek.SATURDAY);
            bosses.add(boss44);
            Boss boss45 = new Boss("Offin", x2, DayOfWeek.SATURDAY);
            bosses.add(boss45);
            Boss boss46 = new Boss("Nouver", x3, DayOfWeek.SATURDAY);
            bosses.add(boss46);
            Boss boss47 = new Boss("Kutum", x4, DayOfWeek.SATURDAY);
            bosses.add(boss47);
            Boss boss48 = new Boss("Nouver", x5, DayOfWeek.SATURDAY);
            bosses.add(boss48);
            Boss boss49 = new Boss("Quint/Muraka", x6, DayOfWeek.SATURDAY);
            bosses.add(boss49);
            Boss boss50 = new Boss("Karanda", x7, DayOfWeek.SATURDAY);
            bosses.add(boss50);
            Boss boss51 = new Boss("Kzarka", x7, DayOfWeek.SATURDAY);
            bosses.add(boss51);


            Boss boss52 = new Boss("Nouver", x1, DayOfWeek.SUNDAY);
            bosses.add(boss52);
            Boss boss521 = new Boss("Kutum", x1, DayOfWeek.SUNDAY);
            bosses.add(boss521);
            Boss boss53 = new Boss("Kzarka", x2, DayOfWeek.SUNDAY);
            bosses.add(boss53);
            Boss boss54 = new Boss("Kutum", x3, DayOfWeek.SUNDAY);
            bosses.add(boss54);
            Boss boss55 = new Boss("Nouver", x4, DayOfWeek.SUNDAY);
            bosses.add(boss55);
            Boss boss56 = new Boss("Kzarka", x5, DayOfWeek.SUNDAY);
            bosses.add(boss56);
            Boss boss57 = new Boss("Vell", x6, DayOfWeek.SUNDAY);
            bosses.add(boss57);
            Boss boss58 = new Boss("Karanda", x7, DayOfWeek.SUNDAY);
            bosses.add(boss58);
            Boss boss59 = new Boss("Nouver", x8, DayOfWeek.SUNDAY);
            bosses.add(boss59);
            Boss boss60 = new Boss("Kzarka", x8, DayOfWeek.SUNDAY);
            bosses.add(boss60);

            instance.bulkImport(bosses);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.exit(0);
        }
    }
}
