
package com.project.kakaduexp;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarCatalog extends JpaRepository<Car, Long> {
    //Car Repository
    ArrayList<Car> findByName(String plate_no);
    Long deleteByModel(String Model);

    //public void save(Car q);
}
