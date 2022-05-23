import java.text.DecimalFormat;

public class Lesson_1_3 { //условные операторы
    /*
    Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
    Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
    Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
    Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
    Наша задача: написать программу, которая показывает, какую сумму на кредитке может получить клиент.
    */
    public String task6(int age, int salary) {
        double limit = 0;

        if (salary < 50_000) {
            limit = 1.0;
        } else if (salary >= 80_000) {
            limit = 1.5;
        } else {
            limit = 1.2;
        }

        if (age < 23) {
            limit *= salary * 2;
        } else {
            limit *= salary * 3;
        }

        return ("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
    }


    /*
    Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев.
    Максимальный ежемесячный платеж — 50% от ЗП. Если возраст меньше 23, то добавляем 1% к ставке.
    Если возраст меньше 30, то добавляем 0.5% к ставке. Если зарплата больше 80_000, уменьшаем ставку на 0.7%.
    Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
    Пример ответа в консоль: «Максимальный платеж при ЗП *** равен *** рублей. Платеж по кредиту *** рублей. Одобрено/отказано».
     */
    public String task7(int age, int salary, int wantedSum) {
        double percent = 1.1;

        if (age < 30 && age >= 23) {
            percent += 0.05;
        } else if (age < 23) {
            percent += 0.1;
        }

        double maxPayment = salary * 0.5;
        double payment = (wantedSum * percent) / 12;
        if (payment <= maxPayment) {
            return "Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту "
                    + new DecimalFormat("#0.00").format(payment) + " руб. Одобрено.";
        }

        return "Максимальный платеж при ЗП " + salary + " равен " + maxPayment + " рублей. Платеж по кредиту "
                + new DecimalFormat("#0.00").format(payment) + " руб. Отказано";
    }
}
