package com.untitled.screens.game;

import com.badlogic.gdx.Screen;
import com.untitled.screens.game.gameplay.GameRenderer;
import com.untitled.screens.game.gameplay.GameWorld;

public class GameScreen implements Screen {

    private GameRenderer renderer; // Dedicated renderer for screen
    private GameWorld world; // Encapsulation of the game world holding all positions and gameplay logic
    private float runtime = 0.0f; // Game runtime (used for animations and world logic)

    public GameScreen() {
        world = new GameWorld();
        renderer = new GameRenderer(world);
    }

    @Override
    public void render(float delta) {
        // Update runtime
        runtime += delta;
        world.update(delta); // Update the world positions based on game physics
        renderer.render(runtime); // Render the world
    }

    @Override
    public void show() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
