package jaws.com;

import jaws.com.Entity.Car;
import jaws.com.Entity.Owner;
import jaws.com.Repository.CarRepo;
import jaws.com.Repository.OwnerRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;


@SpringBootApplication
public class ComApplication implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(ComApplication.class);

	@Autowired
	private CarRepo carRepo;

	@Autowired
	private OwnerRepo ownerRepo;

	public static void main(String[] args) {
		SpringApplication.run(ComApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Add owner objects and save these to db
		Owner owner1 = new Owner("John" , "Johnson");
		Owner owner2 = new  Owner("Mary" , "Robinson");
		ownerRepo.saveAll(Arrays.asList(owner1, owner2));

		// Add car object and link to owners and save these to db
		Car car1 = new Car("Ford", "Mustang", "Red", "ADF-1121", 2021, 59000, owner1);
		Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000, owner2);
		Car car3 = new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000, owner2);
		carRepo.saveAll(Arrays.asList(car1, car2, car3));

		for (Car car : carRepo.findAll()) {
			logger.info(car.getBrand() + " " + car.getModel());
		}
	}
}
