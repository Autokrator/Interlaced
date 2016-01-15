package com.untitled.main;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.untitled.screens.game.GameScreen;


public class Main extends Game {
	private Screen s;
	@Override
	public void create () {
		s = new GameScreen();
		setScreen(s);
	}

	@Override
	public void render () {
		super.render();
	}
}
