package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.ProgressBar;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.mygdx.worm.Wormwar;

public class PlayState extends State {
	
	private Skin skin;
    private Stage stage;
    private ProgressBar healthBar, manaBar;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
		skin = new Skin(Gdx.files.internal("pixthulhu-ui.json"));
        

        stage = new Stage(new ScreenViewport());
        Gdx.input.setInputProcessor(stage);
        
        healthBar = new ProgressBar(0, 100, 1, false, skin, "health");
        healthBar.setSize(500, 10);
        healthBar.setPosition(10, Wormwar.HEIGHT - 60);
        healthBar.setValue(100);
        
        manaBar = new ProgressBar(0, 100, 1, false, skin, "mana");
        manaBar.setSize(500, 10);
        manaBar.setPosition(10, 50);
        manaBar.setValue(100);
        
        stage.addActor(healthBar);
        stage.addActor(manaBar);
        

        
	}

	@Override
	protected void handleInput() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(SpriteBatch sb) {
		Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
                
        stage.act();
        stage.draw();
	
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		skin.dispose();
        stage.dispose();
	}
	
}
