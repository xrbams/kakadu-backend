
package com.project.kakaduexp;

import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverCatalog extends JpaRepository<Driver, Long> {
    //Driver Repository
    ArrayList<Driver> findByName(String Name);
    Long deleteByName(String Name);

    //public void save(Driver h);
}
