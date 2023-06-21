package jaws.com.Entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "OWNER")
public class Owner {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long ownerid;

    private String firstname;
    private String lastname;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<Car> cars;//소유자는 여러대의 차를 가지니까

	// public List<Car> getCars() {
	// 	return cars;
	// }

	// public void setCars(List<Car> cars) {
	// 	this.cars = cars;
	// }

}