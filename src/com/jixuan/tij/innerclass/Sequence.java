package com.jixuan.tij.innerclass;

import java.util.Arrays;

import static com.jixuan.tij.util.Print.println;

/**
 * @author jixuan
 *         Create on 15/3/31.
 */
public class Sequence {
    private Object[] item;
    private int next = 0;//相当于是永远处在最末尾的游标，用来添加各个元素

    public Sequence(int size) {
        item = new Object[size];
    }

    public void add(Object object) {
        if (next < item.length) {
            item[next++] = object;
        }
    }

    public SequenceSelector sequenceSelector() {
        return new SequenceSelector();
    }

    @Override
    public String toString() {
        return "Sequence{" +
                "item=" + Arrays.toString(item) +
                '}';
    }

    private class SequenceSelector implements Selector {
        private int cursor=0;//相当于是可以自由移动的游标，用来定位各个元素
        @Override
        public void next() {
            if (cursor < item.length) {
                cursor++;
            }
        }

        @Override
        public Object current() {
            return item[cursor];
        }

        @Override
        public boolean end() {//这个end不是看数组满没满，是看游标走到最后啦没
           /* if (next < item.length)
                return false;
            else return true;*/
            return cursor == item.length;
        }
    }
}
