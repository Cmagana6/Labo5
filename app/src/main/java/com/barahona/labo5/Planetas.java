package com.barahona.labo5;

import android.net.Uri;

/**
 * Created by uca on 04-16-18.
 */

public class Planetas {
    private int planet_id;
    private String desc, name;
    Uri img_src;

    public Planetas(int planet_id, String desc, String name,Uri img_src) {
        this.desc = desc;
        this.planet_id = planet_id;
        this.name = name;
        this.img_src = img_src;
    }

    public void SetImg_Src(Uri img_src) {
        this.img_src = img_src;
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

    public Uri GetImg_src() {
        return this.img_src;
    }
}
