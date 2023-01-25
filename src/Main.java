public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

            public static void task1 () {
                System.out.println("Задача 1");
         // Пишем код для задачи 1
                int i = 2_147_483_647;
                byte b = 127;
                short s = 32767;
                long l = 9_223_372_036_854_775_807L;
                float f = 3.4590f;
                double d = 2.57;
                System.out.println("Значение переменной i с типом int равно " + i);
                System.out.println("Значение переменной b с типом byte равно " + b);
                System.out.println("Значение переменной s с типом short равно " + s);
                System.out.println("Значение переменной l с типом long равно " + l);
                System.out.println("Значение переменной f с типом float равно " + f);
                System.out.println("Значение переменной d с типом double равно " + d);
            }

            public static void task2 () {
                System.out.println("Задача 2");
         // Пишем код для задачи 2
                float f = 27.12f;
                long l = 987678965549L;
                double d = 2.786;
                short s = 569;
                short s2 = -159;
                int i = 27897;
                byte b = 67;
            }
            public static void task3 () {
                System.out.println("Задача 3");
         // Пишем код для задачи 3
            int classStudentsOne = 23;
            int classStudentsTwo = 27;
            int classStudentsThree = 30;
            int totalListsPaper = 480;
            int totalStudents = classStudentsOne+classStudentsTwo+classStudentsThree;
            int listsPaperPerStudent = totalListsPaper/totalStudents;

                System.out.println("На каждого ученика рассчитано "
                        +listsPaperPerStudent+ " листов бумаги");
            }
            public static void task4 () {
                System.out.println("Задача 4");
         // Пишем код для задачи 4
                int timePeriod = 2;
                int outputQuantity = 16;
                int outputQuantityPerMin = outputQuantity/timePeriod;
                timePeriod = 20;
                outputQuantity = timePeriod*outputQuantityPerMin;
                System.out.println("За "+timePeriod+" минут машина произвела " +outputQuantity+ " штук бутылок");
                timePeriod = 60*24;
                outputQuantity = timePeriod*outputQuantityPerMin;
                System.out.println("За сутки машина произвела " +outputQuantity+ " штук бутылок");
                timePeriod = 60*24*3;
                outputQuantity = timePeriod*outputQuantityPerMin;
                System.out.println("За 3 суток машина произвела " +outputQuantity+ " штук бутылок");
                timePeriod = 60*24*30;
                outputQuantity = timePeriod*outputQuantityPerMin;
                System.out.println("За 1 месяц машина произвела " +outputQuantity+ " штук бутылок");




            }
            public static void task5 () {
                System.out.println("Задача 5");
         // Пишем код для задачи 5
            int tinPaintTotal = 120;
            int tinPaintRepairPerClass = 6;
            int quantityClassAtSchool = tinPaintTotal/tinPaintRepairPerClass;
            int tinPaintConsumptionWhite = 2;
            int tinPaintConsumptionBrown = 4;
            int tinPaintWhite = quantityClassAtSchool*tinPaintConsumptionWhite;
            int tinPaintBrown = quantityClassAtSchool*tinPaintConsumptionBrown;
                System.out.println("В школе, где "
                        +quantityClassAtSchool+ " классов, нужно "
                        +tinPaintWhite+ " банок белой краски и "
                        +tinPaintBrown+ " банок коричневой краски");




            }
            public static void task6 () {
                System.out.println("Задача 6");
         // Пишем код для задачи 6
            int weightBanana = 80;
            int weightMilk = 105;
            int weightIcecream = 100;
            int weightEgg = 70;

            int weightBreakfastGramms = weightBanana*5 + weightMilk*2 + weightEgg*4 + weightIcecream*2;
            double weightBreakfastKilograms = weightBreakfastGramms/1000D;

                System.out.println("Для приготовления завтрака спортсмена необходимо "
                        +weightBreakfastGramms+ " грамм продуктов или же "
                        +weightBreakfastKilograms+ " килограмма" );



            }
            public static void task7 () {
                System.out.println("Задача 7");
         // Пишем код для задачи 7
                int extraWeightSportsmenKg = 7;
                int extraWeightSportsmenGram = extraWeightSportsmenKg*1000;
                int weightLossPerDayGramMin = 250;
                int weightLossPerDayGramMax = 500;
                float averageWeightLossPerDay = (float) (weightLossPerDayGramMin+weightLossPerDayGramMax)/2f;
                float daysWeightLossMin = (float) extraWeightSportsmenGram/weightLossPerDayGramMin;
                System.out.println("При сбросе веса по "
                        +weightLossPerDayGramMin+ " грамм, потребуется "
                        +daysWeightLossMin+ " дней на корректировку веса спортсмена");
                float daysWeightLossMax = extraWeightSportsmenGram/weightLossPerDayGramMax;
                System.out.println("При сбросе веса по "
                        +weightLossPerDayGramMax+ " грамм, потребуется "
                        +daysWeightLossMax+ " дней на корректировку веса спортсмена");
                float averageDays = extraWeightSportsmenGram/averageWeightLossPerDay;
                System.out.println("В среднем потребуется " +averageDays+ " день на корректировку веса");

            }
            public static void task8 () {
                System.out.println("Задача 8");
         // Пишем код для задачи 8
                //зарплата настоящая в месяц и год
            float saloryMashaPresent = 67_760;
                float yearSaloryMasha = saloryMashaPresent*12;
            float saloryDenisPresent = 83_690;
                float yearSaloryDenis = saloryDenisPresent*12;
            float saloryKristinaPresent = 76_230;
                float yearSaloryKristina = saloryKristinaPresent*12;
                //коэфф увеличения зарплаты сотрудникам
            float saloryIncrease = 1.1f;
                    //зарплата после увеличения в месяц и год у Маши
                float saloryMashaFuture = saloryMashaPresent*saloryIncrease;
                    float yearSaloryMasha2 = saloryMashaFuture*12;
                    //разница зарплат у Маши после увеличения на 10%
                    float deltaYearSaloryMasha = yearSaloryMasha2-yearSaloryMasha;
                System.out.println("Маша теперь получает " +saloryMashaFuture+
                        " рублей. Годовой доход вырос на " +deltaYearSaloryMasha+ " рублей");
                //зарплата после увеличения в месяц и год у Дениса
                float saloryDenisFuture = saloryDenisPresent*saloryIncrease;
                    float yearSaloryDenis2 = saloryDenisFuture*12;
                //разница зарплат у Дениса после увеличения на 10%
                    float deltaYearSaloryDenis = yearSaloryDenis2-yearSaloryDenis;
                System.out.println("Денис теперь получает " +saloryDenisFuture+
                        " рублей. Годовой доход вырос на " +deltaYearSaloryDenis+ " рублей");
                //зарплата после увеличения в месяц и год у Кристины
                float saloryKristinaFuture = saloryKristinaPresent*saloryIncrease;
                    float yearSaloryKristina2 = saloryKristinaFuture*12;
                //разница зарплат у Кристины после увеличения на 10%
                    float deltaYearSaloryKristina = yearSaloryKristina2-yearSaloryKristina;
                System.out.println("Кристина теперь получает " +saloryKristinaFuture+
                        " рублей. Годовой доход вырос на " +deltaYearSaloryKristina+ " рублей");




            }
}
