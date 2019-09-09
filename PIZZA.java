
import java.util.Scanner;

public class PIZZA 
{
    public static void main(String [] args)
    {
       Scanner input = new Scanner(System.in) ;
       int numberPizza, numberToppings;
       double pricePizza = 12.00;
       double priceToppings = 1.50;
       double Tax = 0.05;
       System.out.print("Enter the number of Pizzas ");
       numberPizza = input.nextInt();
       System.out.print("Enter the total number of Toppings ");
       numberToppings = input.nextInt();
       //computation
       double totalPizza = numberPizza * pricePizza;
       double totalToppings = numberToppings * priceToppings;
       double totalPrice = totalPizza + totalToppings;
       double priceTax = totalPrice * Tax;
       double totalpriceTax = totalPrice + priceTax;
       
       System.out.println("Reciept: Number of Pizza: "+ numberPizza );
       System.out.println("Number of topping: "+ numberToppings );
       System.out.printf("Cost (incl tax): %.2f\n", totalpriceTax);
       
       
       
       
       
     
       
       
       
                  
       
    }
    
}
