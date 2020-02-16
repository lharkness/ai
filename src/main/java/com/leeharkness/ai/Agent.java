package com.leeharkness.ai;

public interface Agent {

    // Registration to environment happens in the constructor of implementing classes

    Action perform(Percept percept);
    
}