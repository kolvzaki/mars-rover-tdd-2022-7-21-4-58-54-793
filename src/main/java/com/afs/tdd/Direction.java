/*package com.afs.tdd;

public enum Direction {
    EAST("E"),SOUTH("S"),WEST("W"),NORTH("N");

    private String direction;
    Direction(String direction){
        this.direction = direction;
    }

    public String getDirection(){
        return this.direction;
    }

    public static String GET_DIRECTION(int num){
        switch (num){
            case -1: case 0:
                return EAST.getDirection();
            case 1:
                return SOUTH.getDirection();
            case 2:
                return WEST.getDirection();
            case 3: case 4:
        }
    }
    public static int GET(String s){
        switch (s.toUpperCase()){
            case "E":
                return 0;
            case "S":
                return 1;
            case "W":
                return 2;
            case "N":
                return 3;
        }
        return -1;
    }
}*/
