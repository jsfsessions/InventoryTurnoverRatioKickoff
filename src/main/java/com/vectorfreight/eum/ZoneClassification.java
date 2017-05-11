package com.vectorfreight.eum;

public enum ZoneClassification {
    BUSINESS,
    RESIDENTIAL;

    public static ZoneClassification getBUSINESS() {
        return BUSINESS;
    }

    public static ZoneClassification getRESIDENTIAL() {
        return RESIDENTIAL;
    }
}
