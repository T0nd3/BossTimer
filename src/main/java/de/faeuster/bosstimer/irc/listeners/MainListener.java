package de.faeuster.bosstimer.irc.listeners;

import de.faeuster.bosstimer.database.Database;
import de.faeuster.bosstimer.pojo.Boss;
import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.types.GenericMessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MainListener extends ListenerAdapter {
    Database db = Database.getInstance();

    @Override
    public void onGenericMessage(GenericMessageEvent event) {
        Logger log = LoggerFactory.getLogger(this.getClass());
        if (event.getMessage().startsWith("!boss")) {
            List<Boss> data = db.getNextData();

            if (data.isEmpty()) {
                log.info("no bosses in the next hour");
                event.respondWith("no bosses in the next hour");
            } else {
                for (Boss boss : data) {
                    log.info(boss.toString());
                    event.respondWith(boss.toString());
                }
            }
        }
    }
}
