package com.techelevator.farm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OldMacdonald {
    public static void main(String[] args) {

        Singable[] farmAnimals = new Singable[]{new Cow(), new Chicken(), new Pig(), new Tractor()};

        for (Singable animal : farmAnimals) {
            String name = animal.getName();
            String sound = animal.getSound();
            String indefiniteArticle = animal.getIndefiniteArticleForSound();

            System.out.println("Old MacDonald had a farm, ee, ay, ee, ay, oh!");
            System.out.println("And on his farm he had  a " + name + ", ee, ay, ee, ay, oh!");
            System.out.println("With " + indefiniteArticle + " " + sound + " " + sound + " here");
            System.out.println("And " + indefiniteArticle + " " + sound + " " + sound + " there");
            System.out.println("Here " + indefiniteArticle + " " + sound + " there " + indefiniteArticle + " " +
                    sound + " everywhere " + indefiniteArticle + " " + sound + " " + sound);
            System.out.println();
        }

        List<Sellable> items = new ArrayList<Sellable>();
        items.add(new Egg());
        items.add(new Cow());


        BigDecimal sum = BigDecimal.ZERO;
        for (Sellable item : items) {
            sum = sum.add(item.getPrice());

            System.out.println(item.getPrice());
        }

    }
}