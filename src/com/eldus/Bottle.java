package com.eldus;

public class Bottle {
    double volume;
    Liquid liquid;

    public Bottle(double volume, double density, Color color, boolean isSparkling) {
        this.volume = volume;
        liquid = new Liquid(density, color, isSparkling);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Bottle bottle = (Bottle) obj;
        return liquid.equals(bottle.liquid) && volume == bottle.volume;
    }
}
