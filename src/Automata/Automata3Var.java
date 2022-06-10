
package Automata;

import java.util.Stack;

/**
 *
 * @author JulianRivers
 */
public class Automata3Var {
    
     public static boolean verificacion(char[] alfabeto, String x) {
        boolean acepta = false;

        Stack<Character> pila = new Stack<>();
        Stack<Character> pila2 = new Stack(); 
        int i = 0;
        while (i < x.length() && x.charAt(i) == alfabeto[0]) {
            pila.push('n');
            pila2.push('c');
            i++;
        }
         if (pila.size()%2==0) {
             return false;
         }
        while (i < x.length() && x.charAt(i) == alfabeto[1] ) {
            pila.pop();
            pila2.push('c');
            i++;
            if (pila.empty()) {
                return false;
            }
        }
         
        while(i < x.length() && x.charAt(i)==alfabeto[2] && !pila2.empty() ){
            if (!pila.empty()) {
                pila.pop();
            }
            pila2.pop();
            i++;
        }
        if (pila.empty() && i == x.length() && pila2.empty()) {
            acepta = true;
        }
        return acepta;

    }
     
     public static void main(String[] args) {
        char[] alfabeto ={'a','b','c'};
         System.out.println(verificacion(alfabeto, "aaabbccccc"));
         System.out.println(verificacion(alfabeto, "aa"));
         System.out.println(verificacion(alfabeto, "b"));
         System.out.println(verificacion(alfabeto, "fds"));
         System.out.println(verificacion(alfabeto, ""));
         System.out.println(verificacion(alfabeto, "aaabbbcccccc"));
         //nada

    }
    
}
