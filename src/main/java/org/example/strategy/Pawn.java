package org.example.strategy;

import org.example.entity.Position;

import java.util.List;

public class Pawn implements Piece {
    @Override
    public List<Position> getPossibleMoves(Position current) {
        Position next = current.move(-1, 0);
        return next != null ? List.of(next) : List.of();
    }
}
