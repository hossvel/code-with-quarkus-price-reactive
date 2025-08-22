package com.hossvel.service;

import com.hossvel.model.Price;

import java.util.List;

public interface IServicePrice {
    public List<Price> getHistoryById(Long product_id);
}
