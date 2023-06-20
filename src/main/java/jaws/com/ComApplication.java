package jaws.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jaws.com.Entity.Car;
import jaws.com.Repository.CarRepo;

@SpringBootApplication
public class ComApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComApplication.class, args);
	}

}
