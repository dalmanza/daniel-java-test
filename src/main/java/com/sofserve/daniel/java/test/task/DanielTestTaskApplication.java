package com.sofserve.daniel.java.test.task;

import com.sofserve.daniel.java.test.task.solution.StringDuplicates;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DanielTestTaskApplication implements CommandLineRunner {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	private final StringDuplicates removeDuplicates;

	public DanielTestTaskApplication(StringDuplicates removeDuplicates) {
		this.removeDuplicates = removeDuplicates;
	}

	public static void main(String[] args) {
		SpringApplication.run(DanielTestTaskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String output = removeDuplicates.removeDuplicates("AAAa123123");
		log.info("Input without duplicates: {}", output);
	}
}
