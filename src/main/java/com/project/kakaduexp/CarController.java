
package com.project.kakaduexp;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class CarController {
    @Autowired
    private CarService carService;
    
    @GetMapping("/cars")
    public String getCars(Model Mod){
       List<Car> carList = carService.getCars();
       
        Mod.addAttribute("carL", carList);
        return "carPage ";
    }
    
    @PostMapping("/cars")
    public String addCars(@RequestParam String Plate_no, String Name){
        carService.addCars(Plate_no, Name);
        return "redirect:/cars";
    }
    @PostMapping("/deletecar")
    public String deleteCars(@RequestParam String Plate_no){
       carService.deleteCarByPlate(Plate_no);
        return "redirect:/cars";
    }
}
