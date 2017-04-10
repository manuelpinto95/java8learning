package com.learning;

/**
 * Created by manuel.pinto on 10/04/17.
 */
public abstract class Animal {
    private int _age;
    private String _race;
    private String _name;
    private boolean _owned;

    public Animal(int age, String race, String name, boolean owned) {
        this._age = age;
        this._race = race;
        this._name = name;
        this._owned = owned;
    }

    
}
