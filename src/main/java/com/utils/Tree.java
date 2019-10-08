package com.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Tree {

    String Name= null;
    String FatherKey=null;
    Map<String, Tree> map=new HashMap<String,Tree>();
    String path=null;
    boolean T=false;

    public Tree add(String key,Tree tree){
        this.getMap().put(key,tree);
        return this;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Map<String, Tree> getMap() {
        return map;
    }

    public void setMap(Map<String,Tree> map) {
        this.map = map;
    }

    public String getFatherKey() {
        return FatherKey;
    }

    public void setFatherKey(String fatherKey) {
        FatherKey = fatherKey;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isT() {
        return T;
    }

    public void setT(boolean t) {
        T = t;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "Name='" + Name + '\'' +
                ", FatherKey='" + FatherKey + '\'' +
                ", map=" + map +
                ", path='" + path + '\'' +
                ", T=" + T +
                '}';
    }
}
