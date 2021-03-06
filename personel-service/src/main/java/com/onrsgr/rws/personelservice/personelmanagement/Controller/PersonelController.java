package com.onrsgr.rws.personelservice.personelmanagement.Controller;

import com.onrsgr.rws.personelservice.personelmanagement.Model.Personel;
import com.onrsgr.rws.personelservice.personelmanagement.Service.PersonelControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RestController
@RequestScope
public class PersonelController {

    private PersonelControlService personelControlService;

    @Autowired
    public PersonelController(PersonelControlService personelControlService) {
        this.personelControlService = personelControlService;
    }

    // Return All Pilots
    @GetMapping("/getpersonel")
    @ResponseBody public List<Personel> getAllPersonel() {
        return personelControlService.getAllPersonel();
    }

    // Return Personel Data for Public List
    @GetMapping( "/getpersonelmain")
    @ResponseBody public String getAllPersonelForMainPage() {
       // personelControlService.getAllPersonelForMainPage();
        return "Personel List";
    }

    // Add new personel
    @PostMapping("/addnewpersonel")
    @ResponseBody public String addNewPersonel(@RequestBody Personel personel) {
        personelControlService.addNewPersonel(personel);
        return "test1";
    }

    // Update exiting personel
    @PostMapping( "/updatepersonel")
    @ResponseBody public String updatePersonel(@RequestBody Personel personel) {
        personelControlService.updateCurrentPersonel(personel);
        return "test2";
    }

    //Delete Personel
    @DeleteMapping(value = "deletepersonel")
    @ResponseBody public String deletePersonel(Personel personel) {
        personelControlService.deletePersonel(personel);
        return "test3";
    }


}
