package ua.org.petroff.game.engine.entities;

import ua.org.petroff.game.engine.scenes.core.GameResources;

public interface EntityInterface {

    public ViewInterface getView();

    public void init(GameResources gameResources);

    public void update();
    
    public int getZIndex();

}
