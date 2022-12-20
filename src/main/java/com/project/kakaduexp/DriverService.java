
package com.project.kakaduexp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    private DriverCatalog driverCatalog;
    
    //@Autowired
    //private CarService carService;
    
     public List<Driver> getDrivers(){
        return this.driverCatalog.findAll();
    }
   
    public void addDrivers(String name) {
        Driver h = new Driver(name);
        this.driverCatalog.save(h);
    }

    public Driver findDriverByName(String Name) {
        return this.driverCatalog.findByName(Name).get(0);
       
    }
    
}
