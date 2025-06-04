package org.example.strategy;

import org.example.entity.Position;

import java.util.ArrayList;
import java.util.List;

public class Queen implements Piece {

    private static final int[][] DIRECTIONS = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    @Override
    public List<Position> getPossibleMoves(Position current) {
        List<Position> moves = new ArrayList<>();
        for (int[] dir : DIRECTIONS) {
            int steps = 1;
            while (true) {
                Position next = current.move(dir[0] * steps, dir[1] * steps);
                if (next == null) break;
                moves.add(next);
                steps++;
            }
        }
        return moves;
    }
}
