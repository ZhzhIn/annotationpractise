package org.example;

import java.lang.annotation.Inherited;
import java.lang.annotation.Repeatable;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:25
 */

/**
 * 注解容器，本身也是注解，被放入容器中的注解，可同时取多个
 */
public @interface RepeatableAnnotations {
    Person[] value();
}

/**
 * repeatable 括号中的类相当于一个容器注解，
 * 也就是用来存放其他注解的地方，它本身也是个注解
 */
@Repeatable(RepeatableAnnotations.class)
@interface Person{
    String role() default "";

}
@Person(role = "amy")
@Person(role = "bella")
@Person(role = "chris")
class superMan{
}
