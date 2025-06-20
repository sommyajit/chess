package org.example.strategy;

import org.example.entity.Directions;

public class Bishop extends Piece{
    public Bishop() {
        super(new Directions[]{Directions.LEFT_DIAGONAL, Directions.DOWN_LEFT_DIAGONAL, Directions.DOWN_RIGHT_DIAGONAL, Directions.RIGHT_DIAGONAL}, 8);
    }
}
