package com.aedemirsen.countriesbe.service.interfaces;

import com.aedemirsen.countriesbe.entity.Country;

import java.util.List;

public interface ICacheService {

    public void evictCacheValues(String cacheName);

}
