//	Lemonade Stand Server
//	created by come219
//

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

		System.out.println("________________________________");
		System.out.println("Lemonade Stand Server");
		System.out.println("created by 219");
		System.out.println("using Spring");
		System.out.println("________________________________");
		System.out.println("Generates: Player Table");
		System.out.println("Plans for: Inventory Table");



		SpringApplication.run(LemonadeStandSpringServerApplication.class, args);



		//gui??

		// ways to consistently retrieve data or manage system

		//console commands or something


	}


}
