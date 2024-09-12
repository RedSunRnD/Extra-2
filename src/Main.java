public class Main {
    public static void main(String[] args) {
        int age = 26;
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
        System.out.println("Ваш лимит на расходы: " + limit + " рублей.");
    }
}