package com.hossvel.service;

import com.hossvel.model.Price;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.Date;
import java.util.List;

@ApplicationScoped
public class ServicePrice implements IServicePrice{
   
    
    @Override
    public Uni<List<Price>> getHistoryPrice(){
                  Date now = new Date();
         
    return Uni.createFrom().item(List.of(
                new Price(now,120.98),
                new Price(now,140.99)
                
        ));
    }
    
    @Override
    public List<Price> getHistoryById(Long product_id) {
        Date now = new Date();

        return List.of(
                new Price(now,120.98),
                new Price(now,180.99)
        );
    }
}
