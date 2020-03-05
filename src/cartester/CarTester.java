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
public class CarTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        car car1 = new car("Land Rover", "defender", 2010, 40000);
        car car2 = new car("douge ram","caravan",2005,20000,2,4);
        car car3 = new car();
        
        System.out.println(car1.toString());
        System.out.println("-----------------------------------------");
        System.out.println(car2.toString());
        System.out.println("-----------------------------------------");
        System.out.println(car3.toString());
    }
    
}
