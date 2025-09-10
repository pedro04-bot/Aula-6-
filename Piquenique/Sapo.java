// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Sapo extends Actor
{

    /**
     * Act - do whatever the Sapo wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
        }
        comerformiga();
    }

    /**
     * 
     */
    public void comerformiga()
    {
        if (isTouching(formiga.class)) {
            removeTouching(formiga.class);
            getWorld().showText("Perdeu! Tente Novamente", 300, 200);
        }
    }
}
