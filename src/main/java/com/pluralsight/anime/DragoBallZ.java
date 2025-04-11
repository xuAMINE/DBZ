package com.pluralsight.anime;

public class DragoBallZ {

    String id;
    String name;
    int powerLevel;
    int ki;
    boolean superSaiyan;
    public static int instances = 0;

    public DragoBallZ(String name, int powerLevel, int ki) {
        this.name = name;
        this.powerLevel = powerLevel;
        this.ki = ki;
        this.superSaiyan = false;
        instances++;
    }

    public DragoBallZ() {
    }


    public void increasePowerLevel500() {
        powerLevel += 500;
        System.out.printf("\n%s is training hard, Power Level is now %d 🔥\n", name, powerLevel);
    }

    public void increaseKi50() {
        ki += 50;
        System.out.printf("\n%s is training hard, Ki Level is now %d 🔥\n", name, ki);
    }

    public void transformToSuperSaiyan() {
        if (powerLevel > 9000) {
            superSaiyan = true;
            System.out.println(name + " transformed into a Super Saiyan! ⭐ Power Level doubled to ");
        } else System.out.println(name + " is not ready to transform yet. 😠");
    }

    @Override
    public String toString() {
        return "DragoBallZ{" +
                "name='" + name + '\'' +
                ", powerLevel=" + powerLevel +
                ", ki=" + ki +
                ", superSaiyan=" + superSaiyan +
                '}';
    }


}
