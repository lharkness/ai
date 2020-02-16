package com.leeharkness.ai.vacuum;

public class App {
    public static void main( String[] args ) {
    
        VacuumEnvironment vacuumEnvironment = new VacuumEnvironment(1, 2);
        vacuumEnvironment.setDirty(0, 0);
        vacuumEnvironment.setDirty(0, 1);
        vacuumEnvironment.setLimit(10);
        vacuumEnvironment.setPerformanceMeasure(new VacuumPerformanceMeasure());

        VacuumAgent vacuumAgent = new VacuumAgent();

        vacuumEnvironment.registerAgent(vacuumAgent);

        System.out.println(vacuumEnvironment.run());

    }
}
