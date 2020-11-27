package org.example;/**
 * @author zhzh.yin
 * @create 2020-11-27 11:29
 */

import org.junit.Test;

/**
 * 〈test SecondAnnotation〉
 *
 * @author zhzh.yin
 * @create 2020/11/27
 */
@SecondAnnotation
public class SecondAnnotationTest {

public static void main(String[] args) {

}
    @Test
    public void test(){
        boolean hasAnnotation = SecondAnnotationTest.class
                .isAnnotationPresent(SecondAnnotation.class);
        System.out.println(hasAnnotation);
        if(hasAnnotation){
            SecondAnnotation anno = SecondAnnotationTest.class
                    .getAnnotation(SecondAnnotation.class);
            System.out.println("id" + anno.id());
            System.out.println("id" + anno.msg());
        }
    }
}
