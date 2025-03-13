package com.codeninjas.session_tracker.belt;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component // needed for Spring to discover this class and initialize it in the Spring Application Context
public class BeltByIdConverter implements Converter<String, Belt> {

    private Map<String, Belt> beltMap = new HashMap<>();

    public BeltByIdConverter() {
        beltMap.put("1", new Belt(1, "White"));
        beltMap.put("2", new Belt(2, "yellow"));
        beltMap.put("3", new Belt(3, "Orange"));
        beltMap.put("4", new Belt(4, "Green"));
    }

    @Override
    public Belt convert(String id) {
        return beltMap.get(id);
    }
}
