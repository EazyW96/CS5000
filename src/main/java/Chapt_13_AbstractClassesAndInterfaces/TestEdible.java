/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapt_13_AbstractClassesAndInterfaces;

/**
 *
 * @author ciaon
 */
public class TestEdible {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple()};
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] instanceof Edible) {
                System.out.println(((Edible)objects[i]).howToEat());
            }
            else {
                System.out.println("Object is not edible");
            }
        }
    }
}


class Animal {
    
}

class Chicken extends Animal implements Edible {
    public String howToEat() {
        return "Chicken: Fry it";
    }
}

class Tiger extends Animal{
    
}

abstract class Fruit implements Edible {
    
}

class Apple extends Fruit {
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit{
    public String howToEat() {
        return "Orange; Make orange juice";
    }
}