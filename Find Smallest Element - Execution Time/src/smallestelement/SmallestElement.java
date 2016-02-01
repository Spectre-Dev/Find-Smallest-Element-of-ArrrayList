/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smallestelement;

import java.util.*;

/**
 *
 * @author Rich
 */
public class SmallestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 15000000;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            int randomNum = (int) (Math.random() * 1000);
            Integer val = new Integer(randomNum);
            list.add(val);
            //System.out.println(val);
        }

        SmallestElement app = new SmallestElement();
        long startTime = System.currentTimeMillis();
        int sm = app.findSmallElement(list);
        long endTime = System.currentTimeMillis();

        System.out.print("smallest value = " + sm);

        System.out.println("The sorting of: " +list.size()+ "elements took: "+ (endTime - startTime)+ " Milliseconds: ");
    }

    public int findSmallElement(ArrayList<Integer> num) {
        int smElement;
        smElement = num.get(0);
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) < smElement) {
                smElement = num.get(i);
            }
        }
        return smElement;
    }

}
