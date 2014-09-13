
package com.crm.sevaweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value={"/","pruebas","test"})
public class TestController {
    
    public String index(){
        return "test/index";
    }
    
}
