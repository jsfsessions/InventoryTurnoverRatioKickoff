package com.vectorfreight.control;

import java.io.Serializable;

/**
 *
 * @author newlife
 */
public class Item implements Serializable {

    private String unittype;
    private int nounits;
    private String desc;
    private String nmfc;
    private float clazz;
    private int pcs;
    private float weight;
    private String lborkg;
    private float width;
    private float height;
    private float length;
    private String inorft;
    private float density;
    private boolean stackable;
    private boolean hazmat;

    public Item() {   
        lborkg = "lb";
        inorft = "in";
    }    
    
    public String getUnittype() {
        return unittype;
    }

    public void setUnittype(String unittype) {
        this.unittype = unittype;
    }

    public int getNounits() {
        return nounits;
    }

    public void setNounits(int nounits) {
        this.nounits = nounits;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNmfc() {
        return nmfc;
    }

    public void setNmfc(String nmfc) {
        this.nmfc = nmfc;
    }

    public float getClazz() {
        return clazz;
    }

    public void setClazz(float clazz) {
        this.clazz = clazz;
    }

    public int getPcs() {
        return pcs;
    }

    public void setPcs(int pcs) {
        this.pcs = pcs;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }    

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public String getLborkg() {
        return lborkg;
    }

    public void setLborkg(String lborkg) {
        this.lborkg = lborkg;
    }

    public String getInorft() {
        return inorft;
    }

    public void setInorft(String inorft) {
        this.inorft = inorft;
    }
    
    

    public float getDensity() {
        return density;
    }

    public void setDensity(float density) {
        this.density = density;
    }

    public boolean isStackable() {
        return stackable;
    }

    public void setStackable(boolean stackable) {
        this.stackable = stackable;
    }

    public boolean isHazmat() {
        return hazmat;
    }

    public void setHazmat(boolean hazmat) {
        this.hazmat = hazmat;
    }   
}
