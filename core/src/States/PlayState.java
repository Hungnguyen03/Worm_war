package States;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.worm.Wormwar;

public class PlayState extends State {
	
	private Texture background;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
		// TODO Auto-generated constructor stub
//		worm = new Texture("worm.png");
		cam.setToOrtho(false, Wormwar.WIDTH , Wormwar.HEIGHT);
		
		background = new Texture("background2.png");
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
		sb.setProjectionMatrix(cam.combined);
		sb.begin();
		sb.draw(background, 0, 0, Wormwar.WIDTH, Wormwar.HEIGHT);
//		sb.draw(worm, 20, 20);
		sb.end();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}
