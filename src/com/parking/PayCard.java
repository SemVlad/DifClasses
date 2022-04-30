/**
 * Класс, в котором обрабатываются платежные операции за парковку
 *
 * @author Семирозум Владимир
 */
package com.parking;

public class PayCard {
    /**
     * Поля класса
     *
     * @param isPaid - значение true, если парковка оплачена
     * @param name - имя держателя карты
     */
    long numberCard;
    int date;
    int cvv;
    double sum;
    boolean isPaid;
    String name;
    String surName;
    String typeCard;
    /**
     * Методы, принимающие данные от плательщика
     * Методы, которые принимают оплату
     * Проверяем факт оплаты
     * Выдаем разрешение на парковку
     */
}
