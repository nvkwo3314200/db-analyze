package com.peak.service.dbanalyze.util;

import com.fasterxml.jackson.databind.util.LRUMap;

public class LRUCache {
    private static LRUMap<String, Object> lruMap = new LRUMap<>(100, 300);

    public void put(String key, Object value) {
        lruMap.put(key, value);
    }

    public LRUMap<String, Object> getCacheInfo() {
        return lruMap;
    }
}
