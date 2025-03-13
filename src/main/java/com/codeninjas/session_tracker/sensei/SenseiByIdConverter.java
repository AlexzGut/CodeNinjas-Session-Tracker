package com.codeninjas.session_tracker.sensei;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SenseiByIdConverter implements Converter<String, Sensei> {

    Map<String, Sensei> senseiMap = new HashMap<>();

    public SenseiByIdConverter() {
        senseiMap.put("1",  new Sensei(1, "Alexander", "Gutierrez"));
        senseiMap.put("2",  new Sensei(2, "John", "Gaviria"));
    }

    @Override
    public Sensei convert(String id) {
        return senseiMap.get(id);
    }

}
