package com.hossvel.service;

import com.hossvel.model.Price;

import io.smallrye.mutiny.Uni;

import java.util.List;

public interface IServicePrice {
     Uni<List<Price>> getHistoryPrice();
    public List<Price> getHistoryById(Long product_id);
}
