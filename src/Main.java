public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(" ");


        // Conditional operator part 1
        System.out.println("Условный оператор часть 1");
        System.out.println(" ");

        // task 1
        System.out.println("Задача 1");

        int age;

        age = 25;

        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет.");
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }


        // task 2
        System.out.println("Задача 2");

        int temperature = 8;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов. На улице холодно, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов. Сегодня тепло, можно идти без шапки.");
        }


        // task 3
        System.out.println("Задача 3");

        int speed = 50;

        if (speed <= 60) {
            System.out.println("Если скорость " + speed + " км/ч, можно ездить спокойно.");
        } else {
            System.out.println("Если скорость " + speed + " км/ч, придется заплатить штраф.");
        }


        // task 4
        System.out.println("Задача 4");

        int ageForInstitution = 15;

        if (ageForInstitution >= 2 && ageForInstitution <= 6) {
            System.out.println("Если возраст человека равен " + ageForInstitution + ", то ему нужно ходить в детский сад.");
        }

        if (ageForInstitution >= 7 && ageForInstitution <= 17) {
            System.out.println("Если возраст человека равен " + ageForInstitution + ", то ему нужно ходить в школу.");
        }

        if (ageForInstitution >= 18 && ageForInstitution <= 24) {
            System.out.println("Если возраст человека равен " + ageForInstitution + ", то ему нужно ходить в университет.");
        }

        if (ageForInstitution > 24) {
            System.out.println("Если возраст человека равен " + ageForInstitution + ", то ему нужно ходить на работу.");
        }


        // task 5
        System.out.println("Задача 5");

        int ageForAttraction = 1;

        if (ageForAttraction < 5) {
            System.out.println("Если возраст ребенка равен " + ageForAttraction + ", то ему нельзя кататься на аттракционе.");
        } else {

            if (ageForAttraction >= 5 && ageForAttraction <= 14) {
                System.out.println("Если возраст ребенка равен " + ageForAttraction + ", то ему можно кататься на аттракционе" +
                        " в сопровождении взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен " + ageForAttraction + ", то ему можно кататься на аттракционе" +
                        " без сопровождения взрослого.");
            }
        }

        // task 6
        System.out.println("Задача 6");

        int wagonCapacity = 120;
        int seats = 60;
        int standing = wagonCapacity - seats;
        int passengersNumber;

        passengersNumber = 20;

        if (passengersNumber >= wagonCapacity) {
            System.out.println("Вагон полностью забит.");
        } else {
            if (passengersNumber >= seats) {
                System.out.println("Осталось " + (wagonCapacity - passengersNumber) + " стоячих мест");
            } else {
                System.out.println("Осталось " + (seats - passengersNumber) + " сидячих мест и " + standing + " стоячих мест");
            }
        }

        // task 7
        System.out.println("Задача 7");

        int one = 7;
        int two = 9;
        int three = 3;
        boolean largestOne = (one > two && one > three);
        boolean largestTwo = (two > one && two > three);

        if (largestOne) {
            System.out.println("Наибольшим из заданных чисел является " + one);
        } else {
            if (largestTwo) {
                System.out.println("Наибольшим из заданных чисел является " + two);
            } else {
                System.out.println("Наибольшим из заданных чисел является " + three);
            }
        }

    }
}