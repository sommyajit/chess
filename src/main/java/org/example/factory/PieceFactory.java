package org.example.factory;

import org.example.strategy.King;
import org.example.strategy.Pawn;
import org.example.strategy.Piece;
import org.example.strategy.Queen;

public class PieceFactory {
    public static Piece createPiece(String name) {
        return switch (name) {
            case "KING" -> new King();
            case "QUEEN" -> new Queen();
            case "PAWN" -> new Pawn();
            default -> throw new IllegalArgumentException("Unsupported piece: " + name);
        };
    }
}
