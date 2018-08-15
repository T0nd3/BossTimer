package de.faeuster.bosstimer.application;

import de.faeuster.bosstimer.irc.BotManager;
import de.faeuster.bosstimer.tray.NotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Optional;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@EnableScheduling
@SpringBootApplication
public class BossTimerApplication {
	public static void main(String[] args) {
		SpringApplication.run(BossTimerApplication.class, args);
	}

public void run(){

	Logger log = LoggerFactory.getLogger(this.getClass());
	  ResourceBundle rb = ResourceBundle.getBundle("config");

		long timeToBoss = Long.valueOf(rb.getString("TIMETOBOSS"));
		log.info("START Service");
		TimeUnit unit = TimeUnit.MINUTES;
		ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
		scheduledExecutorService.scheduleAtFixedRate(new NotifyService(), 0l, timeToBoss, unit);
		BotManager botManager = new BotManager();
		botManager.addBot(Optional.empty());
	}
}