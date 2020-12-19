package com.eldus;

public class Liquid {
    double density;
    Color color;
    boolean isSparkling;

    public Liquid(double density, Color color, boolean isSparkling) {
        this.density = density;
        this.color = color;
        this.isSparkling = isSparkling;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Liquid liquid = (Liquid) obj;
        return density == liquid.density && color == liquid.color && isSparkling == liquid.isSparkling;
    }
}
