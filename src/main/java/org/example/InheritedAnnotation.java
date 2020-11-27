package org.example;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:25
 */
@Inherited
/**
 * 如果一个超类被 @Inherited 注解过的注解进行注解的话，
 * 那么如果它的子类没有被任何注解应用的话，那么这个子类就继承了超类的注解。
 */
public @interface InheritedAnnotation {
}
