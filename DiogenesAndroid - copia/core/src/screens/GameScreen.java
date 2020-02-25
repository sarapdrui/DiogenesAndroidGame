package screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.diogenesandroid.JuegoDiogenesVersionFail;

public class GameScreen implements Screen {


    private Texture img;
    private float y;
    private float x;
    public final float SPEED = 120;

    JuegoDiogenesVersionFail game;

    public GameScreen(JuegoDiogenesVersionFail game){
        this.game = game;
    }


    @Override
    public void show() {
        img = new Texture("player.png");

    }

    @Override
    public void render(float delta) {
        if(Gdx.input.isKeyPressed(Input.Keys.UP)){
            y += SPEED * Gdx.graphics.getDeltaTime();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)){
            y -=  SPEED * Gdx.graphics.getDeltaTime();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)){
            x -=  SPEED * Gdx.graphics.getDeltaTime();
        }
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)){
            x +=  SPEED * Gdx.graphics.getDeltaTime();
        }

        Gdx.gl.glClearColor(1,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.batch.begin();
       game.batch.draw(img,x, y);
        game.batch.end();


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}