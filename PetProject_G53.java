/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petproject_g53;

/**
 *
 * @author Carito
 */
public class PetProject_G53 {
    
    //Declaracion de variables
    private static String petName = "Dante";
    private static int age = 3;
    private static String healthStatus = "Ok";
    private static int bornYear = 2019;
    private static String breed = "Cocker Spaniel";
    private static char petSex = 'M';
    
    //Creación del método que muestra los valores de los atributos
    public static void ShowPetInformation(){
        //Atajo sout + Tab
        System.out.println(petName + " es un "+ breed + " que tiene " + age + " años, nacio en el "+bornYear + " y se encuentra " + healthStatus + " de salud.");
        
        
       
    }

    
    public static void main(String[] args) {
       ShowPetInformation();
    }
    
}
