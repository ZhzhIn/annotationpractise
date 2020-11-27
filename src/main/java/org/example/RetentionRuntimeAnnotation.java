package org.example;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhzh.yin
 * @create 2020-11-26 14:25
 */
@Retention(RetentionPolicy.RUNTIME)
/**
 * 加载到jvm中，在程序运行时可以获取到它们
 * 需要注意的是，如果一个注解要在运行时被成功提取，
 * 那么 @Retention(RetentionPolicy.RUNTIME) 是必须的。
 */
public @interface RetentionRuntimeAnnotation {
}
