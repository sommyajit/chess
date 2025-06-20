package org.example.strategy;

import org.example.entity.Directions;
import org.example.entity.Position;

import java.util.ArrayList;
import java.util.List;

public class King extends Piece {
    public King() {
        super(new Directions[]{Directions.UP, Directions.DOWN, Directions.LEFT, Directions.RIGHT,
                Directions.LEFT_DIAGONAL, Directions.DOWN_LEFT_DIAGONAL, Directions.DOWN_RIGHT_DIAGONAL, Directions.RIGHT_DIAGONAL}, 1);
    }
}
