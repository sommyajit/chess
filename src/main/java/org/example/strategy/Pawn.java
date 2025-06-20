package org.example.strategy;

import org.example.entity.Directions;
import org.example.entity.Position;

import java.util.List;

public class Pawn extends Piece {

    public Pawn() {
        super(new Directions[]{Directions.UP}, 1);
    }
}
