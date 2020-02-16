package com.leeharkness.ai;

import java.util.Map;

public interface Percept {
    // There is almost certainly a better way to do this via function objects
    Map<String, String> getValues();
    String getValue(String key);
}