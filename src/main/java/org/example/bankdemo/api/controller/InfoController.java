package org.example.bankdemo.api.controller;

import org.example.bankdemo.api.model.Info;
import org.example.bankdemo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class InfoController {

    private InfoService infoService;

    @Autowired
    public InfoController(InfoService infoService){
        this.infoService = infoService;
    }

    @GetMapping("/info")
    public Info getInfo(@RequestParam int id) {
        Optional info = infoService.getInfo(id);

        if(info.isPresent()){
            return (Info) info.get();
        }

        return null;
    };

}
