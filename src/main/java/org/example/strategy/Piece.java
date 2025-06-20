package org.example.strategy;

import org.example.entity.Directions;
import org.example.entity.Position;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {

    private final Directions[] directions;
    private final int possibleMoves;

    protected Piece(Directions[] directions, int possibleMoves) {
        this.directions = directions;
        this.possibleMoves = possibleMoves;
    }

    public List<Position> getPossibleMoves(Position current) {
        List<Position> moves = new ArrayList<>();
        for (Directions dir : directions) {
            int steps = 1;
            while (true) {
                if(steps>possibleMoves){
                    break;
                }
                Position next = current.move( dir.getX()* steps, dir.getY() * steps);
                if (next == null) break;
                moves.add(next);
                steps++;
            }
        }
        return moves;
    }
}
