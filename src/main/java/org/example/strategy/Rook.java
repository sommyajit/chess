package org.example.strategy;

import org.example.entity.Directions;
import org.example.entity.Position;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece{


    public Rook() {
        super(new Directions[]{Directions.UP, Directions.DOWN, Directions.LEFT, Directions.RIGHT}, 8);
    }

}
