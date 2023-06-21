package jaws.com.Repository;

import org.springframework.data.repository.CrudRepository;

import jaws.com.Entity.Owner;

public interface OwnerRepo extends CrudRepository<Owner,Long>{
    
}
