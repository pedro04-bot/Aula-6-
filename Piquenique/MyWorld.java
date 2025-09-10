// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        formiga formiga =  new formiga();
        addObject(formiga, 43, 181);
        cupcake cupcake =  new cupcake();
        addObject(cupcake, 103, 49);
        cupcake cupcake2 =  new cupcake();
        addObject(cupcake2, 516, 46);
        cupcake cupcake3 =  new cupcake();
        addObject(cupcake3, 524, 187);
        cupcake cupcake4 =  new cupcake();
        addObject(cupcake4, 335, 318);
        cupcake cupcake5 =  new cupcake();
        addObject(cupcake5, 280, 57);
        cupcake cupcake6 =  new cupcake();
        addObject(cupcake6, 119, 317);
        cupcake cupcake7 =  new cupcake();
        addObject(cupcake7, 512, 318);
        cupcake cupcake8 =  new cupcake();
        addObject(cupcake8, 295, 182);
        Sapo sapo =  new Sapo();
        addObject(sapo, 400, 56);
        Sapo sapo2 =  new Sapo();
        addObject(sapo2, 227, 331);
        Sapo sapo3 =  new Sapo();
        addObject(sapo3, 180, 198);
        Sapo sapo4 =  new Sapo();
        addObject(sapo4, 412, 192);
    }
}
