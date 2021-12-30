//	Lemonade Stand Server
//	created by come219
//

package com.example.LemonadeStandSpringServer;

import com.example.LemonadeStandSpringServer.player.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.util.Date;
import java.util.List;

@SpringBootApplication

public class LemonadeStandSpringServerApplication {


	public static class GUI {

		//gui??

		// ways to consistently retrieve data or manage system

		//console commands or something


		public GUI() {
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();

			JButton button = new JButton("Refresh");
			//buton.addAction ...
			JLabel label = new JLabel("Current players: x");

			panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
			panel.setLayout(new GridLayout( 0, 1));
			panel.add(button);
			panel.add(label);

			frame.add(panel, BorderLayout.CENTER);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("Lemonade Stand Server GUI");
			frame.pack();
			frame.setVisible(true);
		}


	}


	/**
	 * Main Function
	 *
	 * Runs a Spring boot application which will create and run a database
	 * connected to 5432, link: localhost/5432/api/v1/player
	 * use postgres sql for dbms
	 * @param args stuff
	 */
	public static void main(String[] args) {

		System.out.println("________________________________");
		System.out.println("Lemonade Stand Server");
		System.out.println("created by 219");
		System.out.println("using Spring");
		System.out.println("________________________________");
		System.out.println("Generates: Player Table");
		System.out.println("Plans for: Inventory Table");

		new GUI();

		SpringApplication.run(LemonadeStandSpringServerApplication.class, args);









	}


}
