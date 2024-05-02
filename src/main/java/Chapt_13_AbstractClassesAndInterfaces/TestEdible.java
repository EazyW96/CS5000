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
                System.out.println(((Edible) objects[i]).howToEat());

                if (objects[i] instanceof Animal) {
                    System.out.println(((Animal) objects[i]).sound());
                }
            }
        }
    }
}

abstract class Animal {

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Return animal sound
     */
    public abstract String sound();
}

class Chicken extends Animal implements Edible {

    @Override
    public String howToEat() {
        return "Chicken: Fry it";
    }

    @Override
    public String sound() {
        return "Chicken: cock-a-doodle-doo";
    }

}

class Tiger extends Animal implements Edible {

    @Override
    public String howToEat() {
        return "Tiger: eats other tigers, or animals!";
    }
    @Override
    public String sound()  {
        return "Tiger: RRRRROOOOAARRR";
    }
}

abstract class Fruit implements Edible {
// Data fields, constructors, and methods
}

class Apple extends Fruit {

    @Override
    public String howToEat() {
        return "Apple: Make apple cider";
    }
}

class Orange extends Fruit {

    @Override
    public String howToEat() {
        return "Orange; Make orange juice";
    }
    
class Grape extends Fruit {
    @Override
    public String howToEat() {
        return "Grapes with seeds are the best";
    }
}    
}
