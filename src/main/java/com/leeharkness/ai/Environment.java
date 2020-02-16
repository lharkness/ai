package com.leeharkness.ai;

import java.util.Map;

public interface Environment <T extends Agent, P extends PerformanceMeasure> {
    void registerAgent(T agent);
    void unregisterAgent(T agent);
    PerformanceMetrics run();
    // There is almost certainly a better way to do this via 
    // Function objects
    void receiveAction(Map<String, String> action);  
    void setPerformanceMeasure(P performanceMeasure);
}