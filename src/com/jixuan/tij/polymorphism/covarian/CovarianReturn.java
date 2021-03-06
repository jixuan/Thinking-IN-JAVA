package com.jixuan.tij.polymorphism.covarian;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/11.
 */
public class CovarianReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Mill m2 = new WheatMill();
        println(m.process(new Grain()));
        println(m2.process(new Wheat()));
    }
}
/*协变返回类型
* 覆盖的方法的返回值可以用积累方法返回值的导出类，这样也是覆盖，具有多态性*/