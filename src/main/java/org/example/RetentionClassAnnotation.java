package org.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:25
 */
@Retention(RetentionPolicy.CLASS)
/**
 * 保留到编译进行的时候，并不会加载到JVM中
 */
public @interface RetentionClassAnnotation {
}
