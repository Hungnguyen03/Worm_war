package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.Align;
import com.mygdx.worm.Wormwar;

public  class GameOverState extends State{
	
	private Label label;
	private Stage stage;
	private Texture againBtn;
	private Texture ExitBtn;
	private Skin skin;
	private Table table;
	
	public GameOverState(GameStateManager gsm) {
		super(gsm);
		
		skin = new Skin(Gdx.files.internal("pixthulhu-ui.json"));
		
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		

	        label = new Label("GAMEOVER", skin, "subtitle");
	        label.setColor(Color.RED);
	        label.setSize(Wormwar.WIDTH, Wormwar.HEIGHT);
	        label.setPosition(,);
	        label.setAlignment(Align.center);
	        
	    stage.addActor(label);
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
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		sb.begin();
		stage.act();
        stage.draw();
		sb.end();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
