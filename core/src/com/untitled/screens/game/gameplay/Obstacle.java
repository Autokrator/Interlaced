package com.untitled.screens.game.gameplay;

import com.badlogic.gdx.math.Vector2;

public class Obstacle {

    // Obstacle vectors
    protected Vector2 position;
    protected Vector2 velocity;

    // Obstacle constants
    protected int width;
    protected int height;

    public Obstacle(int x, int y, int width, int height) {

        // Set obstacle position and dimensions
        position.x = x;
        position.y = y;
        this.width = width;
        this.height = height;
    }

    public void update(float delta) {
        
    }

    public Vector2 getPosition() {
        return position;
    }

    public void setPosition(Vector2 position) {
        this.position = position;
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2 velocity) {
        this.velocity = velocity;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
