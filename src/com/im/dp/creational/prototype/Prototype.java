/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Shalini PC
 */
public class Prototype {
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("Sisira", new Sisira());
        prototypes.put("Isuru", new Isuru());
        prototypes.put("Nimesh", new Nimesh());
    }

    public static Person getPrototype(String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }
}
