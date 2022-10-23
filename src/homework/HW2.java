package homework;
/**
 * Write a description of class BasePlusCommissionEmployee here.
 *
 * @author (kirill pryadko)
 * @version (10.09.2022)
 */

public class HW2 {
    public static void main(String[] args) {
        int number=3;
        int part =0;
        String task = "Task";
        String space = " ";
        String tab = "\t";
        char abc = 'a';
        int x= 2;
        int y =5;
        int z = -1;
        int apple = 40;
        int student = 6;

        System.out.println(tab + "PART " + (++part) );
        // print number of task
        System.out.println(task + space +  (++number));

        System.out.println(abc+")");
        System.out.print("int x=" + tab + x + "\n"
                + "int y= "+ tab +y + "\n"
                + "int z=" + tab +z + "\n");

        System.out.println(++abc+")");
        System.out.println("int x=" + tab + x + space
                + "int y= "+ tab +y + space
                + "int z=" + tab +z + space + "\n");

        System.out.println(task + space +  (++number));
        System.out.print(x+", "+y+", "+z+"," +"\n");

        System.out.println(task + space +  (++number));
        System.out.println("Sum of x and y = "+(x + y));
        System.out.println("Sum of x and y = "+(x + y));
        System.out.println("Product of x and z = "+(x * z));
        System.out.println("difference of x and z = "+(y / z));

        System.out.println(task + space +  (++number));
        System.out.println("If "+  apple + space + "яблок поделить на "
            + student + space + "учеников, то каждый ученик получит по "
            + (apple / student)+ space + "яблок(а),"+"\n"
            + "и  " + (apple % student) + " яблок(а) останется учителю." );

        System.out.println(task + space +  (++number));
        apple= 100;
        student = 21;
        System.out.println("If "+  apple + space + "яблок поделить на "
                + student + space + "учеников, то каждый ученик получит по "
                + (apple / student)+ space + "яблок(а),"+"\n"
                + "и  " + (apple % student) + " яблок(а) останется учителю." );

        System.out.println(task + space +  (++number));
        int lemons = 6;
        apple = lemons + 24;
        int pears = apple - 12;
        System.out.println("Всего в школьную столовую привезли " + (lemons + apple + lemons)
                + "кг фруктов.");

        System.out.println(task + space +  (++number));
        int sumOfLegs= 40;
        int whine = 8;
        int buzz = 5;
        int limp = 7;
        int hurt = 2;
        System.out.println("У сороконожки "
            + (sumOfLegs-whine-buzz-limp-hurt) + " здоровых ножек");

        System.out.println(tab + "PART " + (++part) );
        System.out.println(task + space +  (++number));

        System.out.println("35 болько чем 7 в: " + (35/7) + " раз.");
        System.out.println("8 меньше чем 48 в: " + (48/8) + " раз.");
        System.out.println("54 болько чем 6 на: " + (54-6) + " раз.");

        System.out.println(task + space +  (++number));
        System.out.println("48 кратно 8, потому что остаток от деления = " + (48%8));
        System.out.println("48 четное потому что остаток от деления на 2 =" + (48%2));
        System.out.println("8 четное потому что остаток от деления на 2 =" + (8%2));
        System.out.println("47 не четное потому что остаток от деления на 2 =" + (47%2));
        System.out.println("49 не четное потому что остаток от деления на 2 =" + (49%2));
        System.out.println("47 не кратно 7, потому что остаток от деления = " + (47%7));
        System.out.println("49 кратно 7, потому что остаток от деления = " + (49%7));

        System.out.println(task + space +  (++number));
        int k = 5;
        int kRes=0;
        int i = 8;
        int m = -1;
        System.out.println("-------------------------------");
        System.out.println("|"+ tab + "|"+ "+10" + "| "+ "-5" +"|"+ "*100" +"|"+ "/2"+"|"+ "%2"+"|"+ "~2"+"++"+"--|");
        //System.out.println("|"+ "k=5" + "| "+ (kRes+=k+10) + "| "+ (k-5) +"|"+ "*100" +"|"+ "/2"+"|"+ "%2"+"|"+ "~2"+"++"+"--|");
        System.out.println("|"+ tab + "|"+ "+10" + "| "+ "-5" +"|"+ "*100" +"|"+ "/2"+"|"+ "%2"+"|"+ "~2"+"++"+"--|");
        System.out.println("|"+ tab + "|"+ "+10" + "| "+ "-5" +"|"+ "*100" +"|"+ "/2"+"|"+ "%2"+"|"+ "~2"+"++"+"--|");
        System.out.println("-------------------------------");

        System.out.println(task + space +  (++number));
        //"xⁿ"
        x=7;
        y=18;
        int n =3;
        int resul= 0;
        System.out.println("if"+"\n" + "x= "+ x + " y= "+ y + " n= "+ n);
        System.out.print("xⁿ((5x + 7y) / (8x + 10y)) / ((3x - y)/(x + y)) = " );
        double first =(5 * x + 7 *y);
       // System.out.println(first);
        double second = (8 * x + 10 * y);
       // System.out.println(second);
        double third = (3*x - y);
        //System.out.println(third);
        double fourth = (x+y);
        //System.out.println(fourth);
        //double fifth = (first * fourth) / (second*third);

        double a = (first*fourth);
        //System.out.println(a);
        double b =(second* third);
        //System.out.println(b);
        double finRes = (a/b)*(x*x*x);

        System.out.println((int)finRes);

        //int res= (x*x*x)*(fifth);
        //System.out.println(fifth);

        System.out.println(task + space +  (++number));

        int fiveDay= 5;
        int suitIntfiveDay = 15;
        int oneDay = suitIntfiveDay/fiveDay;
        int suit = 69;
        int dayWork = suit/oneDay;
        System.out.println(fiveDay + " дней - " + suitIntfiveDay + " костюмов.");
        System.out.println(dayWork + " дней - " + suit + " костюмов.");

        System.out.println(tab + "PART " + (++part) );
        // print number of task
        System.out.println(task + space +  (++number));


        x= 5;
        y=10;
        z=20;

        System.out.print (x+ "\t");
        System.out.print (y+ "\t");
        System.out.print (z+ "\t ");



    }
}
