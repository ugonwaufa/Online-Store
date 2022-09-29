/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console_application;

import java.util.Scanner;
public class MyShop {
    //This is simulating an online store with items such as Leather bags, Brogues Shoes and Ties, etc
//    each item has prices assigned to them and a quantity of 10 in stock each
//    As a customer you can select an item you wish to purchase, the quantity and price you wish to pay
//    The focus of the script is to ensure that customers do not pay less than the total amount due
    
//    Initializing variables
    Scanner Scan= new Scanner(System.in);
   String [] Pro={"Leather Bag","Brogues Shoe",
       "Tie","Formal Shirt","Suit","Belt"};
   int select;
   int[] Qt={10,10,10,10,10,10};
   int[] Pr={8000,10000,2000,5000,16000,5000};
   int get;
   int Total;
   int pay;
   int nQty;
   
//   Selecting items in store
   
   public void select(){
   System.out.println("Welcome to Next Formalwears");
   
//   Display list of items in store

        System.out.println(" Press (0) for "+Pro[0]+
        "\n Press (1) for "+Pro[1]+"\n Press (2) for "+Pro[2]+
        "\n Press (3) for "+Pro[3]+"\n Press (4) for "+Pro[4]+"\n Press (5) for "+Pro[5]);
        select=Scan.nextInt();
       switch(select)
        {

//           Based on item selected display Name, quantity in stock and price per item
//           Request for quantity of item needed to be inputed



            case 0:
                System.out.println("Product Name: "+this.Pro[0]);
                System.out.println("Quantity: "+ this.Qt[0]);
                System.out.println("Price: "+ this.Pr[0]);
                System.out.println("Enter the Quantity you want to buy");
                get=Scan.nextInt();

//	     Calculate the total price and request for payment

                if(get<=Qt[0])
                {   nQty=Qt[0]-get;
                    Total=get* Pr[0];
                    System.out.println("You are to Pay: "+ Total);
                    pay=Scan.nextInt();
                    int balance;
                    int nPay;

//	     Comparing payment with total price, if payment is less than total price, calculate amount due and request payment

                    if(pay<Total)
                        
                    { while(pay<Total){
                       balance=Total-pay;
                       System.out.println("you do not have enough money to  buy this product");
                       System.out.println("You Hava a Balance of: "+balance+ " to pay");
                       System.out.println("Pay"+balance);
                       nPay=Scan.nextInt();
                       pay+=nPay;
                       

                       }

//	     If payment is equal to or above total price, accept payment and deduct quantity requested from quantity in store

                    if(pay==Total){
                        System.out.println(nQty+" "+Pro[0]+"(s) Left in Stock");
                        System.out.println(" Thanks for Shopping with us");
                    }
                        
                    }
                    else
                    {
                       System.out.println(nQty+" "+Pro[0]+"(s) Left in Stock");
                       System.out.println(" Thanks for Shopping with us");
                    }
                }

//	     If quantity requested is greater than quantity in store, do not proceed with transaction

                else
                {
                    System.out.println("Quantity out of stock");
                    
                }
                break;
            case 1:
                 System.out.println("Product Name: "+this.Pro[1]);
                System.out.println("Quantity: "+ this.Qt[1]);
                System.out.println("Price: "+ this.Pr[1]);
                System.out.println("Enter the Quantity you want to buy");
                get=Scan.nextInt();
                if(get<=Qt[1])
                {   nQty=Qt[1]-get;
                    Total=get* Pr[1];
                    System.out.println("You are to Pay: "+ Total);
                    pay=Scan.nextInt();
                    int balance;
                    int nPay;
                    if(pay<Total)
                        
                    { while(pay<Total){
                       balance=Total-pay;
                       System.out.println("you do not have enough money to  buy this product");
                       System.out.println("You Hava a Balance of: "+balance+ " to pay");
                       System.out.println("Pay"+balance);
                       nPay=Scan.nextInt();
                       pay+=nPay;
                       

                       }
                    if(pay==Total){
                        System.out.println(nQty+" "+Pro[1]+"(s) Left in Stock");
                        System.out.println(" Thanks for Shopping with us");
                    }
                        
                    }
                    else
                    {
                       System.out.println(nQty+" "+Pro[1]+"(s) Left in Stock");
                       System.out.println(" Thanks for Shopping with us");
                    }
                }
                else
                {
                    System.out.println("Quantity out of stock");
                    
                }
                break;
            case 2:
                System.out.println("Product Name: "+this.Pro[2]);
                System.out.println("Quantity: "+ this.Qt[2]);
                System.out.println("Price: "+ this.Pr[2]);
                System.out.println("Enter the Quantity you want to buy");
                get=Scan.nextInt();
                if(get<=Qt[2])
                {   nQty=Qt[2]-get;
                    Total=get* Pr[2];
                    System.out.println("You are to Pay: "+ Total);
                    pay=Scan.nextInt();
                    int balance;
                    int nPay;
                    if(pay<Total)
                        
                    { while(pay<Total){
                       balance=Total-pay;
                       System.out.println("you do not have enough money to  buy this product");
                       System.out.println("You Hava a Balance of: "+balance+ " to pay");
                       System.out.println("Pay"+balance);
                       nPay=Scan.nextInt();
                       pay+=nPay;
                       

                       }
                    if(pay==Total){
                        System.out.println(nQty+" "+Pro[2]+"(s) Left in Stock");
                        System.out.println(" Thanks for Shopping with us");
                    }
                        
                    }
                    else
                    {
                       System.out.println(nQty+" "+Pro[2]+"(s) Left in Stock");
                       System.out.println(" Thanks for Shopping with us");
                    }
                }
                else
                {
                    System.out.println("Quantity out of stock");
                    
                }
                break;
            case 3:
                System.out.println("Product Name: "+this.Pro[3]);
                System.out.println("Quantity: "+ this.Qt[3]);
                System.out.println("Price: "+ this.Pr[3]);
                System.out.println("Enter the Quantity you want to buy");
                get=Scan.nextInt();
                if(get<=Qt[3])
                {   nQty=Qt[3]-get;
                    Total=get* Pr[3];
                    System.out.println("You are to Pay: "+ Total);
                    pay=Scan.nextInt();
                    int balance;
                    int nPay;
                    if(pay<Total)
                        
                    { while(pay<Total){
                       balance=Total-pay;
                       System.out.println("you do not have enough money to  buy this product");
                       System.out.println("You Hava a Balance of: "+balance+ " to pay");
                       System.out.println("Pay"+balance);
                       nPay=Scan.nextInt();
                       pay+=nPay;
                       

                       }
                    if(pay==Total){
                        System.out.println(nQty+" "+Pro[3]+"(s) Left in Stock");
                        System.out.println(" Thanks for Shopping with us");
                    }
                        
                    }
                    else
                    {
                       System.out.println(nQty+" "+Pro[3]+"(s) Left in Stock");
                       System.out.println(" Thanks for Shopping with us");
                    }
                }
                else
                {
                    System.out.println("Quantity out of stock");
                    
                }
                break;
            case 4:
                System.out.println("Product Name: "+this.Pro[4]);
                System.out.println("Quantity: "+ this.Qt[4]);
                System.out.println("Price: "+ this.Pr[4]);
                System.out.println("Enter the Quantity you want to buy");
                get=Scan.nextInt();
                if(get<=Qt[4])
                {   nQty=Qt[4]-get;
                    Total=get* Pr[4];
                    System.out.println("You are to Pay: "+ Total);
                    pay=Scan.nextInt();
                    int balance;
                    int nPay;
                    if(pay<Total)
                        
                    { while(pay<Total){
                       balance=Total-pay;
                       System.out.println("you do not have enough money to  buy this product");
                       System.out.println("You Hava a Balance of: "+balance+ " to pay");
                       System.out.println("Pay"+balance);
                       nPay=Scan.nextInt();
                       pay+=nPay;
                       

                       }
                    if(pay==Total){
                        System.out.println(nQty+" "+Pro[4]+"(s) Left in Stock");
                        System.out.println(" Thanks for Shopping with us");
                    }
                        
                    }
                    else
                    {
                       System.out.println(nQty+" "+Pro[4]+"(s) Left in Stock");
                       System.out.println(" Thanks for Shopping with us");
                    }
                }
                else
                {
                    System.out.println("Quantity out of stock");
                    
                }
                break;
            case 5:
                System.out.println("Product Name: "+this.Pro[5]);
                System.out.println("Quantity: "+ this.Qt[5]);
                System.out.println("Price: "+ this.Pr[5]);
                System.out.println("Enter the Quantity you want to buy");
                get=Scan.nextInt();
                if(get<=Qt[5])
                {   nQty=Qt[5]-get;
                    Total=get* Pr[5];
                    System.out.println("You are to Pay: "+ Total);
                    pay=Scan.nextInt();
                    int balance;
                    int nPay;
                    if(pay<Total)
                        
                    { while(pay<Total){
                       balance=Total-pay;
                       System.out.println("you do not have enough money to  buy this product");
                       System.out.println("You Hava a Balance of: "+balance+ " to pay");
                       System.out.println("Pay"+balance);
                       nPay=Scan.nextInt();
                       pay+=nPay;
                       

                       }
                    if(pay==Total){
                        System.out.println(nQty+" "+Pro[5]+"(s) Left in Stock");
                        System.out.println(" Thanks for Shopping with us");
                    }
                        
                    }
                    else
                    {
                       System.out.println(nQty+" "+Pro[5]+"(s) Left in Stock");
                       System.out.println(" Thanks for Shopping with us");
                    }
                }
                else
                {
                    System.out.println("Quantity out of stock");
                    
                }
                break;
            default: System.out.print("Incorrect input");
        } 
       
   }
   public static void main(String [] args){
       MyShop M= new MyShop();
       M.select();
   }
}


 

