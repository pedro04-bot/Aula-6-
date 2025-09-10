// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class formiga extends Actor
{
    private int qtd = 0;

    /**
     * Act - do whatever the formiga wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        comerCupcake();
    }

    /**
     * 
     */
    public void comerCupcake()
    {
        if (isTouching(cupcake.class)) {
            removeTouching(cupcake.class);
            qtd = qtd + 1;
            getWorld().showText("cupcake:" + qtd, 100, 30);
        }
    }
}
