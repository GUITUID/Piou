package fr.monsieurzad.piou.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import fr.monsieurzad.piou.Piou;

public class main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg =
				new LwjglApplicationConfiguration();
		cfg.title = "Piou";
		cfg.width = 480;
		cfg.height = 320;
		new LwjglApplication(new Piou(), cfg);
	}
}
