package org.example;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:23
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface SecondAnnotation {
    int id() default  110;
    String msg() default "hello";
}
