package org.example;

import org.example.service.ChessService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ChessService chessService = new ChessService();
        chessService.play();
    }
}