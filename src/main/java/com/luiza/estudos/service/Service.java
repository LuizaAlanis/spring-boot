package com.luiza.estudos.service;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class Service {

     @RequestMapping(
          method = {RequestMethod.GET},
          path = {"/{product}"}
     )
     public String getProduct(@PathVariable Product product){
          return product.getName();
     }

     @RequestMapping(
             method = {RequestMethod.PUT},
             path = {"/{product}/{name}"}
     )
     public void updateProduct(@PathVariable Product product, @PathVariable String name){
          product.setName(name);
     }
}
