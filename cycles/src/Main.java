public class Main {
    public static void main(String[] args) {

        int salary = 76845;
        int total =  1 ;
        for (int i = 1; i <= 12; i ++){
        total = total + total/100;
        total = total + salary;
            System.out.println("месяц " +i+" и того " + total);
        }
        System.out.println(total);

        for (int monthNumber = 1; monthNumber <= 12; monthNumber++) {
            System.out.println(monthNumber);
        }







    }

    }