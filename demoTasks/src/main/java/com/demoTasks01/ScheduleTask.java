package com.demoTasks01;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTask {
	private static final Logger log = LoggerFactory.getLogger(ScheduleTask.class); 
	private static final SimpleDateFormat dateFormat = new SimpleDateFormat ("hh:mm:ss");
	@Scheduled(fixedRate = 5000)
	
	public void reportTime(){
		log.info("Time time {}", dateFormat.format(new Date ()));
	}	
}
