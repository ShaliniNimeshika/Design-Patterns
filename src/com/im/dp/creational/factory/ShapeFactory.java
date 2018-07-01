/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.creational.factory;

/**
 *
 * @author Shalini PC
 */
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType == null) {
            return null;
        } else if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }        
        return null;
    }
}
