package com.untitled.screens.game.gameplay;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class GameRenderer {

    private GameWorld world; // Game world position information
    private OrthographicCamera camera;
    private ShapeRenderer rend;

    public GameRenderer(GameWorld w){

        // World
        world = w;

        // Camera
        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        // Renderers
        rend = new ShapeRenderer();
        rend.setProjectionMatrix(camera.combined);
    }

    public void render(float runtime) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        rend.begin(ShapeRenderer.ShapeType.Filled);
        rend.setColor(1, 0, 0, 1);
        rend.circle(world.getPlayer().getX1(),world.getPlayer().getY1(),world.getPlayer().getRadius());
        rend.setColor(0, 0, 1, 1);
        rend.circle(world.getPlayer().getX2(),world.getPlayer().getY2(),world.getPlayer().getRadius());
        rend.end();
    }
}
