import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // final makes the variable a constant
        final Integer c = 350; //calories per slice of pie
        // integer stores integers
        Double d = 3.14;
        // double stores floats
        String best_pie = "keylime";

        System.out.println("Enter a type of pie:");
        String pie_type = s.nextLine();
        System.out.println("Enter number of slices you want to eat: ");
        int slices_eaten = s.nextInt();
        Boolean is_best_pie = pie_type.toLowerCase().equals(best_pie);
        if (is_best_pie == true){
            System.out.println("Good choice");
        }
        else{
            System.out.println("Not the best but all pies are good");
        }

        Pie User_pie = new Pie(true, true, pie_type);
        String pie_insides = User_pie.getFilling();
        String pie_crust = User_pie.getCrust();
        User_pie.eat(slices_eaten);
        User_pie.calories(c, slices_eaten);
        System.out.println(User_pie);
    }
}
