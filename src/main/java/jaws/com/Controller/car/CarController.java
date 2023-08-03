package jaws.com.Controller.car;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jaws.com.Entity.Car;
import jaws.com.Repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@JsonIgnoreProperties
public class CarController {

    @Autowired
    private CarRepo carRepo;

    @RequestMapping("/cars")
    public Iterable<Car> getCars(){
        return carRepo.findAll();
    }

    @GetMapping("/api/hello")
    public String test() {
        return "tlqkf!";
    }
}
