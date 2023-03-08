package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.mygdx.worm.Wormwar;

public  class GameOverState extends State{
	
	public static final int BTN_WIDTH = 288;
    public static final int BTN_HEIGHT = 100;
	public static final int centerX = Wormwar.WIDTH/2;
    public static final int centerY = Wormwar.HEIGHT/2;
	
	private Label label;
	private Stage stage;
	private TextButton againBtn;
	private TextButton exitBtn;
	private Skin skin;
	
	public GameOverState(GameStateManager gsm) {
		super(gsm);
		
		skin = new Skin(Gdx.files.internal("pixthulhu-ui.json"));
		
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		

	        label = new Label("GAMEOVER", skin, "subtitle");
	        label.setColor(Color.RED);
	        label.setSize(Wormwar.WIDTH, Wormwar.HEIGHT + 300);
	        label.setFontScale(2);
	        label.setAlignment(Align.center);
	        
	        againBtn = new TextButton("AGAIN", skin, "default");
			againBtn.setPosition((Wormwar.WIDTH / 2) - (BTN_WIDTH / 2),(Wormwar.HEIGHT / 2) - 30);
			againBtn.setSize(BTN_WIDTH, BTN_HEIGHT);
			exitBtn = new TextButton("Exit", skin, "default");
			exitBtn.setPosition((Wormwar.WIDTH / 2) - (BTN_WIDTH / 2),(Wormwar.HEIGHT / 2) - BTN_HEIGHT - 60);
			exitBtn.setSize(BTN_WIDTH, BTN_HEIGHT);
	        
	    stage.addActor(label);
	    stage.addActor(againBtn);
	    stage.addActor(exitBtn);
	    
	}

	@Override
	protected void handleInput() {
		againBtn.addListener(new ClickListener() {
			 @Override
			 public void clicked(InputEvent event, float x, float y) {
				gsm.set(new PlayState(gsm));
				dispose();
			 }
		});
		
		exitBtn.addListener(new ClickListener() {
			 @Override
			 public void clicked(InputEvent event, float x, float y) {
				 Gdx.app.exit();

			 }
		});
		
	}

	@Override
	public void update(float dt) {
		// TODO Auto-generated method stub
		handleInput();
	}

	@Override
	public void render(SpriteBatch sb) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act();
        stage.draw();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		stage.dispose();
	}

}
