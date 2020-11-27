package org.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:25
 */
@Retention(RetentionPolicy.SOURCE)
/**
 * 注解直在源码截断保留，编译时它将被丢弃
 */
public @interface RetentionSourceAnnotation {
}
