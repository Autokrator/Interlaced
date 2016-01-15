package com.untitled.screens.game.gameplay;

import com.badlogic.gdx.Gdx;

public class Entity {

    // Get screen dimensions
    private final int WIDTH = Gdx.graphics.getWidth();
    private final int HEIGHT = Gdx.graphics.getHeight();
    private final int MIDPOINT = (int)(WIDTH / 2);

    // Entity boundary constraints
    private final int OFFSET = (int)(WIDTH / 8);
    private final int MAX_X = WIDTH - OFFSET;
    private final int MIN_X = OFFSET;

    // Entity constants
    private final float TIME_EDGE = 0.3f;
    private final float MAX_VELOCITY = (MIDPOINT - OFFSET) / TIME_EDGE;
    private final float RADIUS = WIDTH / 17;

    // Entity parameters
    private int x = (int)(WIDTH / 2);
    private int y = (int)(HEIGHT - (HEIGHT / 7.5));
    private float currentVelocity = MAX_VELOCITY;

    public Entity() {

    }

    public void update(float delta) {

        // Find the percent distance from the midpoint (screen)
        float percent_distance = Math.abs(x - MIDPOINT) / (float) (MIDPOINT - OFFSET);
        currentVelocity = MAX_VELOCITY * (float) Math.cos(percent_distance * (Math.PI / 2)) + MAX_VELOCITY * 0.1f;

        if (x < MAX_X || x > MIN_X) { // Entity is not at the edge point

            int delta_x = (int) (currentVelocity * delta); // Change in x this loop

            // Update x based on if the screen is being touched or not
            if (Gdx.input.isTouched()) {
                x += delta_x;

                // Check if x is past the maximum allowed x
                if (x >= MAX_X)
                    x = MAX_X - 1; // So next loop a new velocity is calculated (if statement does not get skipped)
            } else {
                x -= delta_x;

                // Check is x is past the minimum allowed x
                if(x <= MIN_X)
                    x = MIN_X + 1; // So next loop a new velocity is calculated (if statement does not get skipped)
            }
        }
    }

    public int getX1() {
        return this.x;
    }

    public int getY1() {
        return this.y;
    }

    public  int getX2() {
        // Reflection of x about to midpoint for second entity
        if(x > MIDPOINT)
            return MIDPOINT - Math.abs(x - MIDPOINT);
        else
            return MIDPOINT + Math.abs(x - MIDPOINT);
    }

    public int getY2() {
        return this.y;
    }

    public float getRadius() { return this.RADIUS; }
}
