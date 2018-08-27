package de.faeuster.bosstimer.application;

import de.faeuster.bosstimer.irc.BotManager;
import de.faeuster.bosstimer.tray.NotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.ResourceBundle;

@Service
public class ApplicationServiceImpl  implements ApplicationService{

    Logger log = LoggerFactory.getLogger(this.getClass());
    private static ResourceBundle rb = ResourceBundle.getBundle("config");

@Autowired
NotifyService notifyService;

    public void init() {
        long timeToBoss = Long.valueOf(rb.getString("TIMETOBOSS"));
        log.info("START Service");
        notifyService.notifyUser();
        BotManager botManager = new BotManager();
        botManager.addBot(Optional.empty());
    }

}
