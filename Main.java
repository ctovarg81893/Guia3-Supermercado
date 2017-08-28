/**
 * Actividad 1.b Supermercado
 * 
 * @author (Sergio Diaz) 
 * @version (20-Agosto-2017)
 */
import java.util.Random;
import java.util.*;
public class Main
{
    Scanner z = new Scanner(System.in);
    public static void main (String[] arg)
    {
        int v1;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        float v10 =0;
        float v11 =0;
        float v12 =0;
        float tvc = 0;
        int total_venta = 0;
        int diaa;
        int diam = 0;
        int lista_tipo [] = new int [20];
        int lista_venta [] = new int [20];

        int valventa;
        int numventa;
        int tipventa;

        Scanner z = new Scanner(System.in);

        System.out.println(" digite la Cantidad de ventas  del día ");
        diam = z.nextInt();
        System.out.println(" las Ventas a ingresar son  " +diam+ "  ");
        System.out.println("\n");
        int i;
        for( i=0; i<diam;i++)
        {
            total_venta = total_venta + lista_venta[i];

            System.out.println(" Ingrese el valor de la Venta N° (" +(i+1)+ ")");
            lista_venta[i] = z.nextInt();
            System.out.println("\n");
            System.out.println(" Ingrese el tipo de pago: 1 para contado");
            System.out.println(" Ingrese el tipo de pago: 2 para  tarjeta de crédito");
            System.out.println(" Ingrese el tipo de pago: 3 para Cuotas");
            System.out.println(" Ingrese el tipo de pago para la Venta: (" +(i+1)+ ")");
            lista_tipo [i] = z.nextInt();

        }
        for( i=0; i<diam;i++)
        {

            if(lista_tipo[i]== 1)
            {
                v4 = v4 + lista_venta[i];
                v7 = v7 + 1;
                v10 = v10 +((lista_venta[i]*5)/100);

            }
            else 
            if(lista_tipo[i]== 2)
            {
                v11 = v11 +((lista_venta[i]*5)/100);
                v5 = v5 +lista_venta[i];
            }
            else 
            if(lista_tipo[i]== 3)
            {
                v12 = v12 +((lista_venta[i]*5)/100);
                v6 = v6 + lista_venta[i];
            }
            tvc = v10 + v11 + v12;

            //System.out.println("El valor de la Venta N° ("+(i+1)+")  es ( $ " +lista_venta[i]+ ")");
            //System.out.println("El tipo de pago de la Venta N° ("+(i+1)+")  es ( $ " +lista_tipo[i]+ ")");
            System.out.println("\n");
            System.out.println("El Monto total de ventas de contado es ( $ "+ v4+ ")" );
            System.out.println("El Monto total de ventas realizadas por tarjeta de crédito e ( $ "+ v5+ ")" );
            System.out.println("El Monto total de ventas realizadas a cuotas es ( $"+ v6+ ")" );
            System.out.println("Total de comisiones tipo 1 es [" +v10+" ]");
            System.out.println("Total de comisiones  es [" +tvc+" ]");

        }
        System.out.println("Número total de ventas realizadas de contado es [" +v7+" ]");

    }
}

