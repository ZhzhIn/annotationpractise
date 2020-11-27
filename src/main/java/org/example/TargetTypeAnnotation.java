package org.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:25
 */
@Target(ElementType.TYPE)
/**
 * 可以给一个类型注解，比如类、接口、枚举
 */
public @interface TargetTypeAnnotation {
}
