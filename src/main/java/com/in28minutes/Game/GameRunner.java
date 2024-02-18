package com.in28minutes.Game;

public class GameRunner {
    MarioGame game;

    public GameRunner(MarioGame game) {
        this.game = game;
    }

    public void run()
    {
        // generally not used for best practice, we could usually use some sort of
        // loggin framework
        System.out.println("Running game: " + game);
    }
}
