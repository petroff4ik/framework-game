package ua.org.petroff.game.engine.scenes.Interface;

import com.badlogic.gdx.Screen;
import ua.org.petroff.game.engine.util.Assets;

public interface ContainerInterface {

    public void load();

    public void init();

    public Screen getView();

    public Assets getAssets();

    public String getSceneName();

}
