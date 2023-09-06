public class Main {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА 1");
//      без процентов по вкладу
        int capital = 0;
        int oneMonthInvestment = 15_000;
        int month = 0;
        while (capital <= 2_495_000) {
            capital = capital + oneMonthInvestment;
            month = month + 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений без процентов будет равна " + capital + " рублей");
//      c процентами по вкладу
        capital = 0;
        month = 0;
        while (capital <= 2_495_000) {
            capital = capital + capital/100;
            capital = capital + oneMonthInvestment;
            month = month + 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений с процентами будет равна " + capital + " рублей");
        System.out.println();

        System.out.println("ЗАДАЧА 2");
        byte i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("ЗАДАЧА 3");
        long populationSize = 12_000_000L;
        double birthRate = 1.017;
        double mortalityRate = 1.008;
        long born;
        long mortal;
        byte years = 1;
        for (; years < 11; years++) {
            born = (long) ((long) populationSize * birthRate);
            mortal = (long) ((long) populationSize * mortalityRate);
            populationSize = populationSize + born - mortal;
            System.out.println("Год " + years + ", численность населения составляет " + populationSize);
        }
        System.out.println();

        System.out.println("ЗАДАЧА 4");
        capital = 0;
        oneMonthInvestment = 15_000;
        month = 0;
        while (capital <= 12_000_000){
            capital += ((capital/100)*7);
            capital += oneMonthInvestment;
            month = month + 1;
            System.out.println("Месяц " + month + ", сумма накоплений " + capital);
        }
        System.out.println();

        System.out.println("ЗАДАЧА 5");
        capital = 0;
        oneMonthInvestment = 15_000;
        month = 0;
        while (capital <= 12_000_000){
            capital = capital + ((capital/100)*7);
            capital = capital + oneMonthInvestment;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + capital);
            }
        }
        System.out.println();

        System.out.println("ЗАДАЧА 6");
        capital = 0;
        oneMonthInvestment = 15_000;
        month = 1;
        int totalTime = 12 * 9;
        while (month <= totalTime) {
            capital += ((capital/100)*7);
            capital += oneMonthInvestment;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + capital);
            }
            month += 1;
        }
        System.out.println("За 9 лет сумма накоплений будет равна " + capital);
        System.out.println();

        System.out.println("ЗАДАЧА 7");
        for (int friday = 1; friday <= 31; friday += 7){
            System.out.println("Сегодня пятница, " + friday + " число. Необходимо подготовить отчет");
        }
        System.out.println();

        System.out.println("ЗАДАЧА 8");
        for (int year = 0; year < 2123; year += 79) {
            if (year >= 1823) {
                System.out.println(year);
            }
        }
        System.out.println();

        System.out.println("ТРЕНИРОВКА 1.1");
        int days = 10;
        for (; days >= 0; days--) System.out.println("До конца поездки осталось " + days + " дней.");
        System.out.println();

        System.out.println("ТРЕНИРОВКА 1.2");
        days = 10;
        while (days >= 0) {
            System.out.println("До конца поездки осталось " + days + " дней.");
            days = days - 1;
        }
    }
}