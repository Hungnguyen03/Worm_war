package com.mygdx.worm;

import com.badlogic.gdx.Game;
import com.mygdx.worm.Screen.MainMenu;

public class Wormwar extends Game {
	@Override
	public void create () {
		setScreen(new MainMenu(this));
	}
}