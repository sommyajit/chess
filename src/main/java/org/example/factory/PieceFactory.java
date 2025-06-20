package org.example.factory;

import org.example.strategy.*;

public class PieceFactory {
    public static Piece createPiece(String name) {
        return switch (name) {
            case "KING" -> new King();
            case "QUEEN" -> new Queen();
            case "PAWN" -> new Pawn();
            case "ROOK" -> new Rook();
            case "BISHOP" -> new Bishop();
            default -> throw new IllegalArgumentException("Unsupported piece: " + name);
        };
    }
}
