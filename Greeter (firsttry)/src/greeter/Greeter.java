/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greeter;

/**
 * A class for producing simple greetings.
 */
/**
 *
 * @author natgreen
 */
public class Greeter {

    /**
     * Constructs a Greeter object that can greet a person or entity.
     *
     * @param aName the name of the person or entity who should be addressed in
     * the greetings.
     */
    public Greeter(String aName) {
        name = aName;
    }

    /**
     * Greet with a "Hello" message.
     *
     * @return a message containing "Hello" and the name of the greeted person
     * or entity.
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }

    private String name;

    public static void main(String[] args) {
        Greeter worldGreeter = new Greeter("World");
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);
        
        for(int x=0; x<5;x++)
        {
            System.out.println(x);
        }
        //System.out.println(x+5);
    }

}
