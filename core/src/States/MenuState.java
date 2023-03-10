package States;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.mygdx.worm.Wormwar;

public class MenuState extends State {
	
	
	public static final int PLAY_BTN_WIDTH = 288;
    public static final int PLAY_BTN_HEIGHT = 100;
	
  
    private Stage stage; 	
    private TextButton playBtn;
    private TextButton exitBtn;
    private Skin mySkin;
    
	private Texture background;
    private Sprite backgroundSprite;
	
	public MenuState (GameStateManager gsm) {
		super(gsm);
		
		
		background = new Texture("bg.jpg");
        backgroundSprite = new Sprite(background,0,0,Wormwar.WIDTH, Wormwar.HEIGHT);
        
		
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
				
		mySkin = new Skin(Gdx.files.internal("pixthulhu-ui.json"));

		//create buttons
		playBtn = new TextButton("Play", mySkin, "default");
		playBtn.setPosition((Wormwar.WIDTH / 2) - (PLAY_BTN_WIDTH / 2),(Wormwar.HEIGHT / 2));
		playBtn.setSize(PLAY_BTN_WIDTH, PLAY_BTN_HEIGHT);
		exitBtn = new TextButton("Exit", mySkin, "default");
		exitBtn.setPosition((Wormwar.WIDTH / 2) - (PLAY_BTN_WIDTH / 2),(Wormwar.HEIGHT / 2) - PLAY_BTN_HEIGHT - 30);
		exitBtn.setSize(PLAY_BTN_WIDTH, PLAY_BTN_HEIGHT);
		
		stage.addActor(playBtn);
		stage.addActor(exitBtn);
		
	} 

	@Override
	public void handleInput() {
		playBtn.addListener(new ClickListener() {
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

        sb.begin();
        backgroundSprite.draw(sb);
        sb.end();

        stage.act();
        stage.draw();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		 background.dispose();
	     stage.dispose();
	}
	
	
 
}
