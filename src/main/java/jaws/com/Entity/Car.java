package jaws.com.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
// @AllArgsConstructor
// @NoArgsConstructor
@Getter
@Setter
//@Table(name = "CAR")
//@Data
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String brand;
    private String model;
    private String color;
    private String registerNumber;
	// @Column(name="`year`")
	private int year;
	private int price;
	
	public Car() {}
	
	public Car(String brand, String model, String color, String registerNumber, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registerNumber = registerNumber;
		this.year = year;
		this.price = price;
	}

}
