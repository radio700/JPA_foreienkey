package jaws.com.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import jaws.com.Entity.Car;
import java.util.List;


public interface CarRepo extends CrudRepository<Car,Long>{
    // List<Car> findByBrand(String brand);
    List<Car> findByColor(String Color);
    List<Car> findByYear(int year);

    List<Car> findByBrandAndModel(String Brand, String Model);
    List<Car> findByBrandAndColor(String Brand, String Color);

    // //정렬
    List<Car> findByBrandOrderByYearAsc(String Brand);
    
    //row query
    //@Query("select c from Car c where c.brand = ?1")
    //@Query("SELECT C.* FROM Car C WHERE C.brand = ?1")
    @Query(value = "SELECT C FROM Car C WHERE C.brand = ?1")
    List<Car> findByBrand(String brand);
    // @Query(value = "SELECT * FROM CAR WHERE BRAND = ?1")
    // List<Car> findByBrand(String brand);

    // @Query(value = "SELECT * FROM CAR WHERE BRAND LIKE %?%1")
    // List<Car> findByBrandEndsWith(String brand);

}