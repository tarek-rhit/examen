package tn.suptech.examen.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.suptech.examen.Entities.Hopital;

import tn.suptech.examen.Services.HopitalService;

import java.util.List;

@RestController
@RequestMapping("/hopital")
public class HopitalController {


    @Autowired
    private HopitalService hopitalService;

    @GetMapping("/hopitaux")
    public List<Hopital> getAll(){

        return this.hopitalService.getAll();
    }


    @PostMapping("/save")
    public Hopital createHopital(@RequestBody Hopital hopital){

        return this.hopitalService.createHopital(hopital);
    }
    @RequestMapping(name ="/update",method = RequestMethod.POST)
    public Hopital updateHopital (@RequestBody Hopital hopital){

        return this.hopitalService.updateHopital(hopital);
    }

    @DeleteMapping("/{hid}")
    public boolean deleteHopital (@PathVariable Long hid){
        return this.hopitalService.deleteHopital(hid);
    }
    @GetMapping("/{hid}")
    public Hopital getHopitalById(@PathVariable Long hid){
        return this.hopitalService.getHopitalById(hid);
    }
}
