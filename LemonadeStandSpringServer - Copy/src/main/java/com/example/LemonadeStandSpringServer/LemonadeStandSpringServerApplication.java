package com.example.LemonadeStandSpringServer;

import com.example.LemonadeStandSpringServer.player.Player;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.Date;
import java.util.List;

@SpringBootApplication

public class LemonadeStandSpringServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LemonadeStandSpringServerApplication.class, args);
	}


}
