package de.faeuster.bosstimer.database;

import de.faeuster.bosstimer.pojo.Boss;
import de.faeuster.bosstimer.pojo.TimeSlot;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Database {
    private static Database database;

    private Database() {
    }

    public static Database getInstance() {
        if (database != null) {
            return database;
        } else {
            return database = new Database();
        }
    }

    private EntityManager createEntityManager() {
        return Persistence.createEntityManagerFactory("test").createEntityManager();
    }

    public void bulkImport(List<Boss> bosses) {
        EntityManager entityManager = createEntityManager();
        entityManager.getTransaction().begin();
        for (Boss boss : bosses) {
            entityManager.persist(boss);
        }
        entityManager.getTransaction().commit();
        entityManager.close();

    }


    public void insertData(Boss boss) {
        EntityManager entityManager = createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(boss);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public List<Boss> getAllData() {
        EntityManager entityManager = createEntityManager();
        entityManager.getTransaction().begin();
        List<Boss> rs = entityManager.createQuery("from Boss", Boss.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return rs;
    }

    public List<Boss> getNextData() {
        List<Boss> next = new ArrayList<>();
        EntityManager entityManager = createEntityManager();
        entityManager.getTransaction().begin();
        List<Boss> rs = entityManager.createQuery("from Boss ", Boss.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        boolean nextDay = true;
        for (Boss boss : rs) {
            if (LocalDateTime.now().getDayOfWeek().equals(boss.getDayOfWeek())) {
                if (LocalTime.now().isBefore(boss.getTimeSlot().getSlotTime())) {
                    nextDay = false;
                    if (LocalTime.now().until(boss.getTimeSlot().getSlotTime(), ChronoUnit.HOURS) < 2){
//                            && LocalTime.now().until(boss.getTimeSlot().getSlotTime(), ChronoUnit.MINUTES) > 30) {
                            next.add(boss);
                    }
                }

            }

        }
        if (nextDay) {
            DayOfWeek plus = LocalDateTime.now().getDayOfWeek().plus(1);
            for (Boss r : rs) {
                if (r.getDayOfWeek() == plus) {
                    if (r.getTimeSlot().getSlotNumber() == 1) {
                        next.add(r);
                    }
                }
            }
        }
        return next;
    }

}
