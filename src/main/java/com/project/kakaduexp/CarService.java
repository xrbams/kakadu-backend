/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.kakaduexp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarService {
    @Autowired
    private CarCatalog carCatalog;
    
    public List<Car> getCars(){
        return this.carCatalog.findAll();
    }
    public void addCars(Car q){this.carCatalog.save(q);}
    public void addCars( String plate, String Model){
        Car q = new Car(plate, Model);
        this.carCatalog.save(q);
    }
    
    @Transactional
    public void deleteCarByPlate(String Plate) {
        this.carCatalog.deleteByModel(Plate);
    }

    Car findCarByPlateNo(String Plate) {
       
        return this.carCatalog.findByName(Plate).get(0);
    }
    
}
