package org.example.service;

import org.example.entity.Position;
import org.example.factory.PieceFactory;
import org.example.strategy.Piece;

import java.util.List;
import java.util.Scanner;

public class ChessService {
    public void play() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input (e.g., King D5):");
        String input = scanner.nextLine().trim();
        try {
            String[] parts = input.split(",");
            if (parts.length == 1) {
                parts = input.split(" ");
            }

            if (parts.length != 2) {
                throw new IllegalArgumentException("Invalid input format. Use: Piece Position (e.g., King D5)");
            }

            String pieceName = parts[0].trim().toUpperCase();
            String positionStr = parts[1].trim().toUpperCase();
            Position position = new Position(positionStr);

            Piece piece = PieceFactory.createPiece(pieceName);
            List<Position> moves = piece.getPossibleMoves(position);

            System.out.println("Possible moves:");
            moves.stream()
                    .map(Position::toString)
                    .sorted()
                    .forEach(move -> System.out.print(move + " "));
            System.out.println();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
