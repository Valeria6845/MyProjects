package org.homework24;

import lombok.Setter;
import lombok.ToString;

import java.util.Random;
@ToString

public class Chicken extends Animal{
    @Setter
    private int id;
    @Override
    public int productCollection() {
        Random rand = new Random();
        return rand.nextInt(2);
    }
}
