
package ejunidad2;
import java.util.Scanner;

public class EjUnidad2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner  (System.in);
        System.out.println("Ingrese su nombre");
        String nombre=sc.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = sc.nextLine();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese su hobby");
        String hobby = sc.nextLine();
        System.out.println("Ingrese su editor de Código favorito");
        String editor = sc.nextLine();
        System.out.println("Ingrese que sistema operativo utiliza");
        String  so= sc.nextLine();
        
        System.out.println("Mi nombre es "+nombre + " "+apellido+ " tengo "+edad +" años, " + "mi hobby es "+ hobby+ ", mi editor de código favorito es "+editor+ " y utilizo el sistema operativo "+so);
        
        
        
    }
}
