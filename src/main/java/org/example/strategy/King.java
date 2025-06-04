package org.example.strategy;

import org.example.entity.Position;

import java.util.ArrayList;
import java.util.List;

public class King implements Piece {

    private static final int[][] DIRECTIONS = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    @Override
    public List<Position> getPossibleMoves(Position current) {
        List<Position> moves = new ArrayList<>();
        for (int[] dir : DIRECTIONS) {
            Position next = current.move(dir[0], dir[1]);
            if (next != null)
                moves.add(next);
        }
        return moves;
    }
}
