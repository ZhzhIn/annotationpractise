package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:25
 */
@Target(ElementType.ANNOTATION_TYPE)
/**
 * 可以给一个注解进行注解
 */
public @interface TargetAnnotaionTypeAnnotation {
}
