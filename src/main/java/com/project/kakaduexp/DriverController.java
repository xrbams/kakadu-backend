
package com.project.kakaduexp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class DriverController {
    @Autowired
    private DriverService driverService;

    @Autowired
    private CarService carService;
    
    @GetMapping("/drivers")
    public String getHero(Model Mod){
        List<Driver> dList =  driverService.getDrivers();

        Mod.addAttribute(" dList",  dList);
        return "driversPage";
    }

    @PostMapping("/drivers")
    public String addHeroes(@RequestParam String driversName) {
        driverService.addDrivers(driversName);
        return "redirect:/drivers";

    }

    @GetMapping("/drivers/{driverName}")
    public String getDriverInfo(@PathVariable String dName, Model mod){
        Driver drv = driverService.findDriverByName(dName);
        mod.addAttribute("drv", drv);

        List<Car> cList = carService.getCars();
        mod.addAttribute("cList", cList);

        return "driver";
    }
}
