package com.leeharkness.ai.vacuum;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.leeharkness.ai.Environment;
import com.leeharkness.ai.PerformanceMetrics;

public class VacuumEnvironment implements Environment<VacuumAgent, VacuumPerformanceMeasure> {

    private boolean[][] envArray;
    private Set<VacuumAgent> agents = new HashSet<>();
    private int limit = 10;

    public VacuumEnvironment(int i, int j) {
        envArray = new boolean[i][j];
    }

    public void setDirty(int i, int j) {
        envArray[i][j] = true;
    }

    public boolean isDirty(int i, int j) {
        return envArray[i][j];
    }

    @Override
    public void registerAgent(VacuumAgent agent) {
        agents.add(agent);
    }

    @Override
    public void unregisterAgent(VacuumAgent agent) {
       agents.remove(agent);
    }

    @Override
    public PerformanceMetrics run() {
        return null;
    }

    @Override
    public void receiveAction(Map<String, String> action) {
        // Pull out the action name and go from there

    }

    public void setLimit(int i) {
        this.limit = i;
    }

    @Override
    public void setPerformanceMeasure(VacuumPerformanceMeasure performanceMeasure) {
        // TODO Auto-generated method stub

    }

}
