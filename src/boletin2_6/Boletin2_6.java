
package boletin2_6;

import java.util.Scanner;


public class Boletin2_6 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float ptarifa,ppagado,porcentaxe;
        System.out.println("Teclea el precio :");
        ptarifa=sc.nextFloat();
        System.out.println("Teclea el precio pagado :");
        ppagado=sc.nextFloat();
        porcentaxe=100-((ppagado*100)/ptarifa);
        System.out.println("El porcentaje de la rebaja es del "+porcentaxe+"%");
    }
    
}
