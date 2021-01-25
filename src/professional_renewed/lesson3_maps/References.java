package professional_renewed.lesson3_maps;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class References {
    public static void main(String[] args) {
        Integer test = 1; // сильна ссилка
        SoftReference<Integer> softReference = new SoftReference<>(test); // мягка ссилка
        // weak reference
        System.out.println("sr: " + test);
        WeakReference<Integer> weakReference = new WeakReference<>(test);
        test = null;
        System.out.println("sr: " + test);
        System.out.println("wr: " + test);
        PhantomReference<Integer> phantomReference = new PhantomReference<>(test, new ReferenceQueue<>());
        System.out.println("pr: " + test);
    }
}
