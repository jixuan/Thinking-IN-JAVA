package com.jixuan.tij.polymorphism.shape;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/10.
 */
public class Shape {

    void draw() {
        println("Shape draw");
    }

    void erase() {
        println("Shape erase");
    }

    void description() {
        println("description shap");
    }

    void callanother() {
        println("before call another");
        another();
        println("after call another");
    }

    void another() {
        println(" another");
    }
}
