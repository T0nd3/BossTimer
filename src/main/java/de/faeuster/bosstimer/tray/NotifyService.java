package de.faeuster.bosstimer.tray;

import de.faeuster.bosstimer.database.Database;
import de.faeuster.bosstimer.pojo.Boss;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.util.List;

public class NotifyService implements Runnable {
    Logger log = LoggerFactory.getLogger(this.getClass());
    TrayNotification trayNotification = new TrayNotification();
   Database db = Database.getInstance();

    @Override
    public void run() {
        List<Boss> nextData = null;
        try {
            nextData = db.getNextData();
            for (Boss boss : nextData) {
                trayNotification.notifyOverTray(boss.toString());
            }
        } catch (AWTException e) {
            log.error(e.getMessage());
        }
    }
}
