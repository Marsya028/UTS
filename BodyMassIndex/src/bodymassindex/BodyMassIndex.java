/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bodymassindex;

/**
 *
 * @author VivoBook
 */
import java.util.Scanner;
 
// BMI Calculator in Java
// Uses metric units
public class BodyMassIndex {
 
    public static void main(String[] args) throws Exception {
        BodyMassIndex();
    }
 
    private static void BodyMassIndex() throws Exception {
        System.out.print("Masukan Berat badan : ");
        Scanner s = new Scanner(System.in);
        float weight = s.nextFloat();
        System.out.print("Masukan Tinggi badan : ");
        float height = s.nextFloat();
         
        // multiplication by 100*100 for cm to m conversion
        float bmi = (100*100*weight)/(height*height);
         
        System.out.println("BMI mu adalah: "+bmi);
        printBMICategory(bmi);
         
    }
     
    // Prints BMI category
    private static void printBMICategory(float bmi) {
        if(bmi < 18.5) {
            System.out.println("KURUS");
        }else if (bmi < 25) {
            System.out.println("NORMAL");
        }else if (bmi < 30) {
            System.out.println("GEMUK");
        }else {
            System.out.println("OBESITAS");
        }
    }
}