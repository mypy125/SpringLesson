package com.javastart.springcontext;

import java.util.StringJoiner;

public class CombatCat {

    private String name;

    @CalculateCatStrength(minStrength = 10, maxStrength = 14)
    private Integer strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", CombatCat.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("strength=" + strength)
                .toString();
    }
}
