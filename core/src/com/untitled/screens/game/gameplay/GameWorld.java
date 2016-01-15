package com.untitled.screens.game.gameplay;


public class GameWorld {
    private Entity player; // Holds the player object

    public GameWorld() {
        player = new Entity();
    }

    public void update(float delta) {

        // Update world entities
        player.update(delta);
    }

    public Entity getPlayer() {
        return this.player;
    }
}
