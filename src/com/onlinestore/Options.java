/**
 * Класс для создания фильтра при поиске товара
 * В нашем случаем параметры поиска велосипеда
 *
 * @author Семирозум Владимир
 */
package com.onlinestore;

public class Options {
    /**
     * Поля класса, которые касаются только велосипеда в нашем случае
     * @param delivery - дополнительное поле по доставке товара, если клиенту эта услуга необходима
     */
    int age;
    int numWheel;
    int numTransmiss;
    double weight;
    double price; // диапазон цен
    String materialOfRam;
    String typeOfWheel;
    String color;
    String gender;
    boolean isTrunk;
    boolean isElectro;
    boolean delivery;
    boolean isSale;

}
