package com.luiza.estudos.service;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class Service {

     @RequestMapping("/product")
     public String product(){
          Product product = new Product();
          product.setName("potatoes");
          return product.getName();
     }
}
