package de.faeuster.bosstimer.application;

import de.faeuster.bosstimer.irc.BotManager;
import de.faeuster.bosstimer.tray.NotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ApplicationService {
    Logger log = LoggerFactory.getLogger(this.getClass());
    private static ResourceBundle rb = ResourceBundle.getBundle("config");

    public void init() {
        long timeToBoss = Long.valueOf(rb.getString("TIMETOBOSS"));
        log.info("START Service");
        TimeUnit unit = TimeUnit.MINUTES;
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(new NotifyService(), 0l, timeToBoss, unit);
        BotManager botManager = new BotManager();
        botManager.addBot(Optional.empty());
    }

}
