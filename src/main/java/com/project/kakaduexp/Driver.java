package com.project.kakaduexp;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Driver extends AbstractPersistable<Long> {
    private String Name;
    private int Age;
    private int experience;
    private int accidents;
    
    public Driver(String name){
        this.Name = name;
        this.Age = 35;
        this.experience = 10;
        this.accidents = 1;
    }
    public void newbie(){
        this.experience -= 3;
        this.accidents += 4;
    }
    public void advanced(){
        this.experience += 10;
        this.accidents -= 5;
    }
    public int getExp(){
        return this.experience;
    }
}
