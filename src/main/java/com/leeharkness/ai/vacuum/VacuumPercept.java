package com.leeharkness.ai.vacuum;

import java.util.HashMap;
import java.util.Map;

import com.leeharkness.ai.Percept;

public class VacuumPercept implements Percept {

    Map<String, String> values;

    public VacuumPercept() {
        values = new HashMap<>();
    }

    @Override
    public Map<String, String> getValues() {
        return values; // TODO: make immutable copy
    }

    @Override
    public String getValue(String key) {
        return values.get(key);
    }

}