/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harcosvarazslo;

/**
 *
 * @author IlyésBorbála(SZOFT_2
 */
public class magyarazat {
    public static void main(String[] args) {
        String eredeti = "abc.12x";
        int k = eredeti.indexOf(".")+ 1;
        int v = eredeti.length()- 1;
        
        
        System.out.println("első: " + eredeti.charAt(0));
        
        String uj =eredeti.substring(4, 6) ;//12
        System.out.println(uj);
        uj =eredeti.substring(0, 3) ;//abc
        System.out.println(uj);
        uj =eredeti.substring(3) ;//.12x
        System.out.println(uj);
        uj =eredeti.substring(k, v) ;//12
        System.out.println(uj);
        uj =eredeti.substring(4, 6) ;
        int szam = Integer.parseInt(uj);
        System.out.println(szam);
        
        boolean abcKezdes = eredeti.startsWith("abc");
        boolean vege2x = eredeti.endsWith("2x");
        boolean vanBennePont = eredeti.contains(".");
        System.out.println("abc-vel kezdődik: " + abcKezdes);
        System.out.println("abc-vel kezdődik: " + vege2x);
        System.out.println("abc-vel kezdődik: " + vanBennePont);
        
    }
    
    
}
