package com.afs.tdd;

import java.util.List;

public class Application {
    public String reportLocation(Rover rover,List<String> commands){
        rover.runCommands(commands);
        return rover.getLocation();
    }
}
