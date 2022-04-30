/**
 * В этом классе описан процесс
 * заказа товара с доставкой или без,
 * а также организован процесс оплаты
 *
 * @author Семирозум Владимир
 * @version 1.0.1
 */
package com.onlinestore;

public class Order {
    /**
     * Блок основных полей класса
     *
     * @param count - поле для количества заказываемого товара
     * @param total - поле итоговой суммы к оплате за товар
     * @param isDelivery - при значении этого параметра true клиент хочет доставку
     * Остальные поля интуитивно понятны
     */
    int count;
    int priceDeliv;
    double priceIthem;
    double total;
    boolean isDelivery;
    String item;
    String deliveryAddress;

    /**
     * Этот метод выполняет оплату товара
     */
    void pay() {
        /**
         *Код, который описывает процес оплаты
         */
    }
    /**
     * Прочие методы
     */
}
