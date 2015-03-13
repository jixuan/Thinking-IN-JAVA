package com.jixuan.tij.polymorphism.music;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/13.
 */
public class Woodwind extends Wind {
    @Override
    public void play(Note note) {
        println(" Woodwind.play() " + note);
    }

    @Override
    public void adjust() {
        println(" adjust Woodwind");
    }
}
