package de.faeuster.bosstimer.tray;

import de.faeuster.bosstimer.database.Database;
import de.faeuster.bosstimer.pojo.Boss;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;

@Service
public class NotifyServiceImpl implements NotifyService {
    Logger log = LoggerFactory.getLogger(this.getClass());
    TrayNotification trayNotification = new TrayNotification();
   Database db = Database.getInstance();



   @Scheduled(cron = "0 */15 * * * *")
    public void notifyUser() {
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
