package org.example.strategy;

import org.example.entity.Position;

import java.util.List;

public interface Piece {
    List<Position> getPossibleMoves(Position current);
}
