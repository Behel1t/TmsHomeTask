package org.example;
/*
1. Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную
карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке.
Напишите программу, которая создает три объекта класса CreditCard у
которых заданы номер счета и начальная сумма
Тестовый сценарий для проверки:
Положите деньги на первые две карточки и снимите с третьей.
Выведите на экран текущее состояние всех трех карточек.
 */

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(11111111,5000);
        CreditCard card2 = new CreditCard(51122111,3524);
        CreditCard card3 = new CreditCard(22224786,500);
        card1.deposite(500);
        card2.deposite(1000);
        card3.withdraw(480);
        card1.getInfo();
        card2.getInfo();
        card3.getInfo();

    }
}
