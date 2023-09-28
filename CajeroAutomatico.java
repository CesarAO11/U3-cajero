
package cajeroautomatico;

import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
  int saldo = 5000, retirar, deposito;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            {
            System.out.println("BIENVENIDO AL CAJERO AUTOMATICO\n");
            System.out.println("-----------------------------------");
            System.out.println("PRESIONE 1 PARA CONSULTAR SALDO");
            System.out.println("PRESIONE 2 PARA DEPOSIAR DINERO");
            System.out.println("PRESIONE 3 PARA RETIRAR DINERO");
            System.out.println("PRESIONE 4 PARA SALIR");
            System.out.println("------------------------------------\n");
            System.out.print("POR FAVOR SELECCIONE LA OPERACION QUE DESEA REALIZAR:");
            int n = s.nextInt();
            saldo = 5000;
            switch(n)
            {
                case 1:
                System.out.print("PARA CONSULTAR SALDO:");
                saldo = 5000;
                if(saldo >= saldo)
                    
                {
                    System.out.println("\nTu saldo es de " + saldo);
                }else{
                    
                }
 
                System.out.println("");
                break;
 
                case 2:
                System.out.print("\nINGRESE LA CANTIDAD QUE DESEA DEPOSITAR:");
                deposito = s.nextInt();
                saldo = saldo + deposito;
                System.out.println("\nSU DINERO HA SIDO DEPOSITADO EXITOSAMENTE");
 
                break;
 
                case 3:
                System.out.println("SALDO : "+saldo);
 
                break;
 
                case 4:
                System.out.println("GRACIAS POR USAR EL CAJERO AUTOMATICO");
                System.exit(0);
 
            }
        
        }
        }
    }
}