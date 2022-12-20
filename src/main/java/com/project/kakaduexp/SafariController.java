/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.project.kakaduexp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class SafariController {
    @GetMapping("/")
    //@ResponseBody
    public String getIndex(){
        return "index";
    }
    
    @GetMapping("*")
    public String redirectToIndex(){
        return "redirect:/";
    }
}
