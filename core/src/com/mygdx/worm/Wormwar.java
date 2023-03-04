package com.mygdx.worm;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import States.GameStateManager;
import States.MenuState;
//import com.mygdx.worm.Screen.MainMenu;

public class Wormwar extends Game {
	public static final int WIDTH = 1330;
    public static final int HEIGHT = 850;
    
    public static final String TITLE = "Worms War";
    
    private GameStateManager gsm; 
    private SpriteBatch batch;
    private Texture img;
    
	@Override
	public void create () {
		batch = new SpriteBatch ();
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new MenuState(gsm));
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
	
	
}