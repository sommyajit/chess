package org.example.entity;

public enum Directions {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0),
    RIGHT_DIAGONAL(1, 1),
    LEFT_DIAGONAL(1, -1),
    DOWN_RIGHT_DIAGONAL(-1, -1),
    DOWN_LEFT_DIAGONAL(-1, 1);
    final int x;
    final int y;
    Directions(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
