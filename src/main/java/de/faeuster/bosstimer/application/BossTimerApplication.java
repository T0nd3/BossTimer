package de.faeuster.bosstimer.application;

import de.faeuster.bosstimer.tray.NotifyServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;

import java.util.ResourceBundle;


@SpringBootApplication(scanBasePackages = "de.faeuster.bosstimer")
public class BossTimerApplication  extends SpringBootServletInitializer {
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ApplicationService applicationService;


	public static void main(String[] args) {
		SpringApplication.run(BossTimerApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext applicationContext) {
		log.info("{} started.", this.getClass().getSimpleName());
		return args -> {
			log.info("Starting document processor service");
			applicationService.init();
		};
	}
}