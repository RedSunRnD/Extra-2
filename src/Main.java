public class Main {
    public static void main(String[] args) {
        /*int age = 26;
        double salary = 84_000;
        double limit = 0;
        if (age >= 23) {
            limit = salary * 3;
            if (salary >= 50_000 && salary < 80_000) {
                limit = limit * 1.2;
            } else if (salary >= 80_000) {
                limit = limit * 1.5;
            }
        } else if ( age < 23) {
            limit = salary * 2;
            if (salary >= 50_000 && salary <80_000) {
                limit = limit * 1.2;
            } else if (salary >= 80_000) {
                limit = limit * 1.5;
            }
        }
        System.out.println("Ваш лимит на расходы: " + limit + " рублей.");*/

        int age = 17;
        double salary = 30_000;
        double wantedSum = 330_000;
        double maxPayment = salary / 2;
        double basicRate = 0.01;
        double payment = 0;
        if(age < 23) {
            basicRate += 0.1;
        } else if (age >= 23 && age < 30) {
            basicRate += 0.005;
            }
        if (salary >= 80_000) {
            basicRate -= 0.007;
        }
        wantedSum = wantedSum + wantedSum * basicRate;
        payment = wantedSum / 12;
        if (payment >= maxPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. Отказано");
        } else if (payment < maxPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " рублей равен " + maxPayment + " рублей. Платеж по кредиту " + payment + " рублей. Одобрено");
        }
    }
}