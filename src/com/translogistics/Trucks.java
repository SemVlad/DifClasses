/**
 * Класс, в котором описывается (создается) авто для перевозки,
 * а также расчитываются некоторые значения,
 * для заказа выбранной машины
 *
 * @author Семирозум Валдимир
 */
package com.translogistics;

public class Trucks {
    /**
     * Поля, необходимые для создания подходящего авто
     *
     * @param price - стоимость перевозки за 1 км
     * @param carType - тип автомобиля
     * @param goodsType - тип (вид) перевозмого груза (жидкости, коробки, насыпной груз...)
     * @param fuel - вид используемого топлива (дт, газ, бенз)
     */
    int carryingCapacity;
    double price;
    long distance;
    String carType;
    String goodsType;
    String fuel;

    public double total() {
        /**
         * Код метода для расчета стоимости перевозки
         */
    }
    /**
     * Какие-то дополнительные методы и вычисления
     */
}
