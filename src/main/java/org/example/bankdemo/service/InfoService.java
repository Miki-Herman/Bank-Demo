package org.example.bankdemo.service;


import org.example.bankdemo.api.model.Info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class InfoService {

    private List<Info> infoList;

    public InfoService() {
        infoList = new ArrayList<>();

        Info info1 = new Info(1, "Hello World!");
        Info info2 = new Info(200, "OK");
        Info info3 = new Info(404, "Not Found");
        Info info4 = new Info(500, "Internal Server Error");

        infoList.addAll(Arrays.asList(info1, info2, info3, info4));
    }


    public Optional getInfo(Integer id){

        Optional optional = Optional.empty();

        for (Info info: infoList){
            if(id == info.getCode()){
                optional = Optional.of(info);
                return optional;
            }
        }
        return optional;
    }

}
