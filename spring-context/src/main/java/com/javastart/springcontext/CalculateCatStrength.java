package com.javastart.springcontext;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
public @interface CalculateCatStrength {

    int minStrength();

    int maxStrength();
}
