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
public class Demo {
    public static void main(String[] args) {
        ShapeFactory shape = new ShapeFactory();
        
        Shape circle = shape.getShape("circle");
        circle.draw();
        Shape square = shape.getShape("square");
        square.draw();
        Shape rectangle = shape.getShape("rectangle");
        rectangle.draw();
    }
}
