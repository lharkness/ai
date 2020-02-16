package com.leeharkness.ai.vacuum;

import java.util.HashMap;
import java.util.Map;

import com.leeharkness.ai.Action;
import com.leeharkness.ai.Agent;
import com.leeharkness.ai.Percept;

public class VacuumAgent implements Agent {

    public VacuumEnvironment environment;

    @Override
    public Action perform(Percept percept) {
        int row = Integer.parseInt(percept.getValue("row"));
        int column = Integer.parseInt(percept.getValue("column"));
        // If my square is dirty clean it.
        // If my square is clean, move left
        Action action = null;
        Map<String, String> actionMap = new HashMap<>();
        if (environment.isDirty(row, column)) {
            actionMap.put("action", "clean");
        }
        else {
            actionMap = new HashMap<>();
            int columnToMoveTo;
            if (column == 0) {
                columnToMoveTo = 1;
            }
            else {
                columnToMoveTo = 0;
            }
            actionMap.put("action", "move");
            actionMap.put("columnToMoveTo", Integer.toString(columnToMoveTo));
        }

        return new VacuumAction(actionMap);
    }
}
