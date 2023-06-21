package jaws.com.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@Table(name = "CAR")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String brand;
    private String model;
    private String color;
	@Column(length = 500, nullable = true)
    private String registerNumber;
	
	private int year;
	private int price;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner", foreignKey = @ForeignKey(name = "CAR_FK"))
	private Owner owner;
}
