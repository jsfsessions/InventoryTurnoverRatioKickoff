package com.vectorfreight.entity.old;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Item implements Serializable {

    private String description;
    private Integer classif;
    private Map<Integer, Integer> classification;
    private String nmfc;
    private byte length;
    private byte width;
    private byte height;
    private byte weight;
    private boolean isFreezeSuseptible;
    private boolean isStackable;
    private boolean isHazmat;

    @PostConstruct
    public void init() {

        classification = new HashMap<>();

        classification.put(50, 50);
        classification.put(55, 55);
        classification.put(60, 60);
        classification.put(65, 65);
        classification.put(70, 70);
        classification.put(77, 77);
        classification.put(85, 85);
        classification.put(92, 92);
        classification.put(100, 100);
        classification.put(110, 110);
        classification.put(125, 125);
        classification.put(150, 150);
        classification.put(175, 175);
        classification.put(200, 200);
        classification.put(250, 250);
        classification.put(300, 300);
        classification.put(400, 400);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getClassif() {
        return classif;
    }

    public void setClassif(Integer classif) {
        this.classif = classif;
    }

    public Map<Integer, Integer> getClassification() {
        return classification;
    }

    public void setClassification(Map<Integer, Integer> classification) {
        this.classification = classification;
    }

    public String getNmfc() {
        return nmfc;
    }

    public void setNmfc(String nmfc) {
        this.nmfc = nmfc;
    }

    public byte getLength() {
        return length;
    }

    public void setLength(byte length) {
        this.length = length;
    }

    public byte getWidth() {
        return width;
    }

    public void setWidth(byte width) {
        this.width = width;
    }

    public byte getHeight() {
        return height;
    }

    public void setHeight(byte height) {
        this.height = height;
    }

    public byte getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

    public boolean isIsFreezeSuseptible() {
        return isFreezeSuseptible;
    }

    public void setIsFreezeSuseptible(boolean isFreezeSuseptible) {
        this.isFreezeSuseptible = isFreezeSuseptible;
    }

    public boolean isIsStackable() {
        return isStackable;
    }

    public void setIsStackable(boolean isStackable) {
        this.isStackable = isStackable;
    }

    public boolean isIsHazmat() {
        return isHazmat;
    }

    public void setIsHazmat(boolean isHazmat) {
        this.isHazmat = isHazmat;
    }
}
