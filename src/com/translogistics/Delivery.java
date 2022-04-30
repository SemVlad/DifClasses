/**
 * Класс, который обрабатывает дорогу
 * Расчитывает время движения, количество необходимого топлива и т.д.
 *
 * @author Семиррозум Владмир
 */
package com.translogistics;

public class Delivery {
    /**
     * Поля класса
     *
     * @param stops - остановки, которые необходимо учитывать при длительной поездке
     * @param fuel - расход топлива на 1 км дороги
     * @param distance - дистанция в км, которую необходимо проехать
     * от пункта А(место загрузки) до пункта В(месдо доставки)
     * с учетом остановок
     */
    String destinationA;
    String destinationB;
    String stops;
    double timeDrav;
    double distance;
    double fuel;


    /**
     * Метод класса, который вычисляет количество необходимого
     * топлива на дорогу
     */
    public void resFuel(double destin, double fuel, double carCap) {
        /**
         * Некий код
         */
    }
/**
 * Прочие методы
 */
}