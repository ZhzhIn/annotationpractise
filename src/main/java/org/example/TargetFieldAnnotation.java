package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:25
 */
@Target(ElementType.FIELD)
/**
 * 可以给一个属性注解
 */
public @interface TargetFieldAnnotation {
}
