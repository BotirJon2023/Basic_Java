package org.example;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface MyName {

    String value();

    int age() default 18;

}
