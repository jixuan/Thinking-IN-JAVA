package com.jixuan.tij.interfaces.filter;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/16.
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Object waveform) {
        println(" cutoff : "+cutoff);
        return super.process(waveform);
    }
}
