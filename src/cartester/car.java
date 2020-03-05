/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author kabut2496
 */
public class car {
      private String make, model;
      private int year,price,preOwners,doors;
      
      public car() {
    
          make = "ford";
          model = "mustange";
          year = 2020;
          price = 20000;
          preOwners = 0;
          doors = 4;
}
      public car(String cMake,String cModel, int cYear ,int cPrice,int cPreOwners,int cDoors ){
          make = cMake;
          model = cModel;
          year = cYear;
          price = cPrice;
          preOwners =cPreOwners;
          doors = cDoors;
          
      }
      
      public car (String cMake,String cModel, int cYear ,int cPrice){
           make = cMake;
          model = cModel;
          year = cYear;
          price = cPrice;
          preOwners =(int) (Math.random() * 10) + 1;
          doors = (int) (Math.random() * 4) + 1;
      }
      
       public String toString() {
        String output = "the car make and model is " + make + " " + model +
                "\n and it is from the year " + year + " with " + preOwners + 
                "\n you can have " + doors + " doors " + " for the low price of " + price;
        
        //output string is complete, return it
        return output;
    }
}


