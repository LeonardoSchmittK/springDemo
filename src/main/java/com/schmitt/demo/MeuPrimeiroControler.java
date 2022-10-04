package com.schmitt.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/teste")
public class MeuPrimeiroControler {
    @GetMapping("/nome")
    public String getMeuNome(){
        return "Leonardo Schmitt :) \nThis is me";
    }
    @GetMapping("/idade")
    public int getMinhaIdade(){
        return 22;
    }
}
