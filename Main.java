import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // final makes the variable a constant
        final Integer i = 7;
        // integer stores integers
        Boolean b = false;
        // boolean stores a value that is either true or false
        Double d = 3.14;
        // double stores floats


        Integer a = (7 + 27) * 3;
        System.out.println((double) a);
        Integer IntOverFlow = Integer.MAX_VALUE + a;

        System.out.println(IntOverFlow);
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);


        Pie Blueberry_Pie = new Pie(true, "blueberry");
        String filling = Blueberry_Pie.getFilling();
        System.out.println(filling);
        Blueberry_Pie.eat();

        System.out.println("Enter a type of pie:");
        String pie_type = s.nextLine();
        System.out.println("Enter number of slices you want to eat: ");
        int slices_eaten = s.nextInt();

        Pie User_pie = new Pie(true, true, pie_type);
        String pie_insides = User_pie.getFilling();
        String pie_crust = User_pie.getCrust();
        System.out.println(pie_insides);
        System.out.println(pie_crust);
        User_pie.eat(slices_eaten);
    }
}
