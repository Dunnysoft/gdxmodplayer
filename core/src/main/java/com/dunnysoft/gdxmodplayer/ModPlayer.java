package com.dunnysoft.gdxmodplayer;

import com.badlogic.gdx.Game;
import com.dunnysoft.gdxjavamod.MusicPlayer;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class ModPlayer extends Game {

	MusicPlayer musicPlayer;
	@Override
	public void create() {
		musicPlayer = new MusicPlayer();
		setScreen(new FirstScreen(musicPlayer));
	}
}