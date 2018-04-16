package com.barahona.labo5;

/**
 * Created by uca on 04-16-18.
 */

public class Planetas {
    private int planet_id;
    private String desc, name;

    public Planetas(int planet_id, String desc, String name) {
        this.desc = desc;
        this.planet_id = planet_id;
        this.name = name;
    }

    public void SetDesc(String desc) {
        this.desc = desc;
    }

    public void SetId(int id) {
        this.planet_id = id;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int GetPlanetid() {
        return this.planet_id;
    }

    public String GetDesc() {
        return this.desc;
    }

    public String GetName() {
        return this.name;
    }

}
