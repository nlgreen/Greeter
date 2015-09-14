/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 * A class for creating simple greetings
 * @author natgreen
 * 
 */
public class Greeter {

    
    /**
     * Constructs a Greeter object that can greet a person or entity
     * @param aName The name of the person or entity to be addressed
     */
    public Greeter (String aName)
    {
        name = aName;    
    }
    /**
     * Greets with a "Hello" message
     * @return A message containing "Hello" and the name of the person or
     * entity addressed
     */
    public String sayHello()
    {
        return "Hello, " + name + "!";
    }
    
    /**
     * Changes the name of the Greeter to a new name
     * @param newName The new name that the Greeter will refer to
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * Swaps the names of two Greeters
     * @param other The Greeter that will swap names with whichever Greeter
     * called the method
     */
    public void swapNames(Greeter other)
    {
        String tempName = this.name;
        this.name = other.name;
        other.name = tempName;
    }
    
    private String name;
    
}
