package com.afs.tdd;

import java.util.List;
import java.util.Objects;

public class Rover {
    private int x;
    private int y;
    private String direction;

    public Rover() {
        this.x = 0;
        this.y = 0;
        this.direction = "N";
    }

    public Rover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void runCommands(List<String> commands) {
        commands.forEach(s -> {
            if (Objects.equals(s.toUpperCase(), Commons.MOVE)) {
                this.move();
            }
            if (Objects.equals(s.toUpperCase(), Commons.LEFT)) {
                this.turnLeft();
            }
            if (Objects.equals(s.toUpperCase(), Commons.LEFT)) {
                this.turnRight();
            }
        });
    }

    private void setDirection(String direction) {
        this.direction = direction;
    }

    private void move() {
        switch (this.direction) {
            case Commons.EAST:
                this.x += 1;
                break;
            case Commons.WEST:
                this.x -= 1;
                break;
            case Commons.SOUTH:
                this.y -= 1;
                break;
            case Commons.NORTH:
                this.y += 1;
                break;
        }
    }

    private void turnLeft() {

    }

    private void turnRight() {

    }

    public String getLocation() {
        return String.format("(%d,%d %s)", this.getX(), this.getY(), this.getDirection());
    }
}
