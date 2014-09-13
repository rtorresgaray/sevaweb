/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crm.sevaweb.controllers.admin.vendedor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author rtorres
 */
@Controller
@RequestMapping("/adm/vendedor")
public class VendedorController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        return "adm/vendedor/index";
    }
    
}
