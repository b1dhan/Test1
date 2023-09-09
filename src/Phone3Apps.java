import java.util.Scanner;
public class Phone3Apps {
    public static void main(String[] args){
        int unlock_phone=1234;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin code to unlock: ");
        int pin= sc.nextInt();
        if(pin==unlock_phone){
            System.out.println("Enter your choice of app; 1:Simple Interest Calculator 2:Currency Converter 3:Bill Generator ");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Welcome to Simple Interest Calculator!");
                    System.out.println("Enter the value for principle");
                    int principle= sc.nextInt();
                    System.out.println("Enter the value for time");
                    int time=sc.nextInt();
                    System.out.println("Enter the value for rate");
                    float rate=sc.nextFloat();
                    double simple_interest = (principle*time*rate)/100;
                    System.out.println("The simple interest is: "+ simple_interest);
                    break;
                case 2:
                    System.out.println("Welcome to Currency Converter");
                    System.out.println("Enter your choice of conversion; 1:INR TO NPR 2:NPR TO INR");
                    int choice_currency=sc.nextInt();
                    switch (choice_currency){
                        case 1:
                            System.out.println("Enter your currency in INR");
                            float indian_rp1= sc.nextFloat();
                            double nepali_rp1= indian_rp1*1.6;
                            System.out.println("The currency in NPR is "+nepali_rp1);
                            break;
                        case 2:
                            System.out.println("Enter your currency in NPR");
                            float nepali_rp2= sc.nextFloat();
                            double indian_rp2= nepali_rp2/1.6;
                            System.out.println("The currency in INR is "+indian_rp2);
                            break;
                        default:
                            System.out.println("Enter choice between 1 and 2");
                    }
                    break;

                case 3:
                    System.out.println("Welcome to Bill Generator!");
                    System.out.println("Menu");
                    System.out.println("The available items: Chowmein(Rs.200) Momo(Rs.250) Coke(Rs.50) Pizza(Rs.450) Milkshake(Rs.120)");
                    System.out.println("10% discount on all items!");
                    System.out.println("Enter item 1:");
                    String item_1= sc.next();
                    System.out.println("Enter quantity of item 1:");
                    int item1_quantity= sc.nextInt();
                    System.out.println("Enter item 2:");
                    String item_2= sc.next();
                    System.out.println("Enter quantity of item 2:");
                    int item2_quantity= sc.nextInt();
                    System.out.println("Enter item 3:");
                    String item_3= sc.next();
                    System.out.println("Enter quantity of item 3:");
                    int item3_quantity= sc.nextInt();

                    int item1_amount= item1_quantity*200;
                    int item2_amount= item2_quantity*110;
                    int item3_amount= item3_quantity*50;
                    int total = item1_amount+item2_amount+item3_amount;
                    double discount = total - ((double) 10 /100)*total;
                    double grand_total= total-discount;


                    System.out.println("                    Java PVT LTD");
                    System.out.println("Item        Quantity        Rate       Amount");
                    System.out.println(item_1+"             "+item1_quantity+"              "+"200"+"       "+item1_amount);
                    System.out.println(item_2+"             "+item2_quantity+"              "+"110"+"       "+item2_amount);
                    System.out.println(item_3+"             "+item3_quantity+"              "+"50"+"        "+item3_amount);
                    System.out.println("\r");
                    System.out.println("                                      Total:"+total);
                    System.out.println("                                      Discount:"+discount);
                    System.out.println("                                      Grand Total:"+grand_total);



                break;
                default:
                    System.out.println("Enter choice between 1,2 and 3");
            }
        }
        else{
            System.out.println("The pin is incorrect, try again: ");
        }
    }
}
