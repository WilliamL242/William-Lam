public class Main
{
    public static void main(String[] args)
    {
        // final makes the variable a constant
        final Integer i = 7;
        // integer stores integers
        Boolean b = false;
        // boolean stores a value that is either true or false
        Double d = 3.14;
        // double stores floats


        Integer a = (7 + 27) * 3;
        System.out.println((double)a);
        Integer IntOverFlow = Integer.MAX_VALUE + a;

        System.out.println(IntOverFlow);
        System.out.println(i);
        System.out.println(b);
        System.out.println(d);

        Pie Blueberry_Pie = new Pie(true, "blueberry");
        String filling = Blueberry_Pie.getFilling();
        System.out.println(filling);
        Blueberry_Pie.eat();

        Pie Key_Lime_Pie = new Pie(true, true, "key lime custard");
        String pie_insides = Key_Lime_Pie.getFilling();
        System.out.println(pie_insides);
        Key_Lime_Pie.eat();

    }
}
