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
public class Automata2Var {

    public static boolean verificar(String x, char [] sigma) {
        boolean acepta = true;
        boolean change = false;
        boolean extra = false;
        Stack<Character> st = new Stack<>();
        for (int i = 0; acepta && i < x.length(); i++) {
            if (x.charAt(i) == sigma[0]) {
                if (!change) {
                    st.push(x.charAt(i));
                } else {
                    acepta = false;
                }
            } else if (x.charAt(i) == sigma[1]) {
                change = true;
                if (st.empty()) {
                    if (i != x.length() - 1) {
                        acepta = false;
                    } else {
                        extra = true;
                    }
                } else {
                    st.pop();
                }
            } else {
                acepta = false;
            }
        }
        return acepta && extra;
    }

}
