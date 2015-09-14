/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 * A simple tester for Greeters
 * @author natgreen
 */
public class GreeterTester {
    
    /**
     * Main method to start from
     * @param args 
     */
    
    public static void main(String[] args)
    {
        // Test for making a simple Greeter and outputting its greeting
        Greeter worldGreeter = new Greeter("World");
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);
        
        // Test for changing the Greeter's name and outputting its greeting
        worldGreeter.setName("Fred");
        System.out.println(worldGreeter.sayHello());
        
        // Test for setting two variables as references to the same Greeter
        Greeter greeterDupe = worldGreeter;
        greeterDupe.setName("Imposter");
        // Should be an imposter now
        System.out.println(worldGreeter.sayHello());
        
        // A new Greeter named Kyle that switches with the imposter
        Greeter newGreeter = new Greeter("Kyle");
        newGreeter.swapNames(worldGreeter);
        
        // Demonstrating that the names have been switched
        System.out.println("This should be an Imposter: " + 
                newGreeter.sayHello());
        System.out.println("This should be Kyle: " +
                worldGreeter.sayHello());
        
    }
    
}
