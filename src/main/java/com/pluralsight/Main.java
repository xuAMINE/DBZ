package com.pluralsight;

import com.pluralsight.anime.DragoBallZ;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DragoBallZ vegeta = new DragoBallZ("Vegeta", 8000, 39);
        DragoBallZ goku = new DragoBallZ("Goku", 8000, 39);

        System.out.println(vegeta);
        System.out.println(goku);

        vegeta.increasePowerLevel500();
        goku.increaseKi50();

        vegeta.transformToSuperSaiyan();

    }
}