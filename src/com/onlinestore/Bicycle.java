/**
 * Класс товара Велосипед магазина (одной из позиции)
 * На основе данного класса будут создаваться товарные позции велосипеды
 *
 * @author Семирозум Владимир
 */
package com.onlinestore;

public class Bicycle {
    /**
     * Поля класса или же характеристики велосипеда
     *
     * @param isSale - поле со значением thrue, если велосипед учавствует в акции
     * @param age -  возраст человека, которому подойдет данный велосипед
     * @param isTrunk - если имеется багажник, значение thrue
     */
    int age;
    int numWheel;
    int numTransmiss;
    double weight;
    String materialOfRam;
    String typeOfWheel;
    String color;
    String gender;
    boolean isTrunk;
    boolean isElectro;
    boolean isSale;

}
