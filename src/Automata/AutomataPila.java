/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Automata;

import java.util.Stack;

/**
 *
 * @author Ang3L
 */
public class AutomataPila {

    public boolean Verificacion(char[] alfabeto, String x) {
        boolean acepta = false;

        Stack<String> pila = new Stack<String>();
        int i = 0;
        while (i < x.length() && x.charAt(i) == alfabeto[0]) {
            pila.push("h");
            pila.push("h");
            i++;
        }
        while (i < x.length() && x.charAt(i) == alfabeto[1]) {
            i++;
        }
        while (i < x.length() && x.charAt(i) == alfabeto[2]) {
            if (!pila.empty() && pila.peek().equalsIgnoreCase("h")) {
                pila.pop();
            } else {
                pila.push("e");
            }
            i++;
        }
        while (i < x.length() && x.charAt(i) == alfabeto[3]) {
            if (( (i + 1) < x.length() ) && (x.charAt(i + 1) == alfabeto[3] ) && ( (i + 2) < x.length() ) && x.charAt(i + 2) == alfabeto[3] ) {
                i += 3;
            } else {
                break;
            }
        }
        if (pila.empty() && i == x.length()) {
            acepta = true;
        }
        return acepta;

    }
}
