/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.log;

import org.apache.log4j.NDC;

/**
 *
 * @author salman
 */
public class NDCWrapper {

    private static boolean NDCEnabled = true;

    public static void enableNDC(boolean NDCEnamble) {
        NDCEnabled = NDCEnamble;
    }

    public static void push(String str) {
        if (NDCEnabled) {
            NDC.push(str);
        }
    }

    public static void pop() {
        if (NDCEnabled) {
            NDC.pop();
        }
    }

    public static void clear() {
        if (NDCEnabled) {
            NDC.clear();
        }
    }

    public static void remove() {
        if (NDCEnabled) {
            NDC.remove();
        }
    }

    public static String peek() {
        if (NDCEnabled) {
            return NDC.peek();
        } else {
            return "";
        }

    }
}
