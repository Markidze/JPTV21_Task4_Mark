/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21_task4_mark;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JPTV21_Task4_Mark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int n = 101;
        int sum = 0;
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            while(true){
                int rundNum = random.nextInt(100);
                if (rundNum % 2 != 0){
                    nums[i] = rundNum;
                    break;
                }
            }
        }
        Arrays.sort(nums);    
        for (int i = 1; i < nums.length; i++) {
            System.out.printf("%-4d", nums[i]);
            sum += nums[i];  
            if (i%10==0){
                System.out.println("");
            }
               
        }
        System.out.println("Среднее арифметическое: " + sum/n);
    }
}

