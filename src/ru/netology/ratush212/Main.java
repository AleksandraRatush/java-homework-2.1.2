package ru.netology.ratush212;

public class Main {

    public static final int MIN_BONUS_SUM = 1000;
    public static final int BONUS_FOR_ONE_RUB = 100;

    public static void main(String... args) {

        double accountBalance = 100;
        double receiptSum = 2000;
        double bonusSum = (receiptSum <= MIN_BONUS_SUM) ? 0 : receiptSum / BONUS_FOR_ONE_RUB;
        accountBalance = accountBalance + receiptSum + bonusSum;
        System.out.println(
                "Клиент пополнил счёт на "  + receiptSum +
                        " рублей, бонус равен " +  bonusSum +
                        " рублям, итоговая сумма на счету клиента - " + accountBalance +
                        " рублей "
                );
    }

}
