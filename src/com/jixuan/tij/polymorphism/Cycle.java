package com.jixuan.tij.polymorphism;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class Cycle {
    protected int wheelNum;

    public void ride(Cycle cycle) {

        println("ride "+cycle.getClass()+" wheel num = " + cycle.wheel());
    }

    public int wheel() {
        return this.wheelNum;
    }

}
