package de.faeuster.bosstimer.irc;

import de.faeuster.bosstimer.irc.listeners.MainListener;
import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

public class BotManager {


    private final String BOTNAME = "T0nd3-BotManager";

    private final String OAUTH = ResourceBundle.getBundle("config").getString("OAUTHTOKEN");
    private final String CHANNEL = ResourceBundle.getBundle("config").getString("CHANNEL");

    private List<PircBotX> bots = new ArrayList<>();


    public void addBot(Optional<Configuration> configuration) {
        Logger log = LoggerFactory.getLogger(this.getClass());
        PircBotX pircBotX;
        if (configuration.isPresent()) {
            pircBotX = new PircBotX(configuration.get());
        } else {
            pircBotX = new PircBotX(getConfig());
        }
        bots.add(pircBotX);
        try {
            pircBotX.startBot();
            log.info(pircBotX.toString());
        } catch (IOException | IrcException e) {
            log.error(e.getMessage());
        }
    }


    private Configuration getConfig() {
        Configuration config = new Configuration.Builder()
                .setName(BOTNAME)
                .setServer("irc.chat.twitch.tv", 6667)
                .setServerPassword(OAUTH)
                .addListener(new MainListener()).setAutoReconnect(true)
                .addAutoJoinChannel("#" + CHANNEL)
                .buildConfiguration();
        return config;
    }

}