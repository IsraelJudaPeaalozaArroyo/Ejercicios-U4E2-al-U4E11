import java.util.Scanner;
public class EjerciciosU4E2AlU4E11 {

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner (System.in);
         ArbolBinario abo = new ArbolBinario ();
       
          abo.insertar (1997,"Ana");
          abo.insertar (1982,"Roberto");
          abo.insertar (1993,"Cristal");
          abo.insertar (1986,"Gustabo");
          abo.insertar (1990,"Martha");
          abo.insertar (1981,"Fernando");
          abo.insertar (1970,"Carmen");
          abo.insertar (2003,"Joseline");
          abo.insertar (2009,"Alicia");
          abo.insertar (2005,"Cesar");
          abo.insertar (2001,"Ramiro");
          abo.insertar (2002,"Lalo");
          
           boolean x= true;
           int opc=0;
           while (x){
               
           System.out.println("----------------MENU--------------");
           System.out.println("***Los datos ya han sido Ingresados***");
           System.out.println("***Operaciones con Arboles Binarios***");
           System.out.println("-------------------------------------------------------");
           System.out.println("Eliga la opcion que decea realizar: ");
           System.out.println("1. In-Orden");
           System.out.println("2. Pre-Orden");
           System.out.println("3. Post-Orden");
           System.out.println("4. Altura del Arbol Binario");
           System.out.println("5. Cantidad de Participantes que hay en el Arbol Binario");
           System.out.println("6. Quien es la persona mas peque;a y que edad tiene?");
           System.out.println("7. Quien es la persona mas grande y que edad tiene?");
           System.out.println("8. Salir del Arbol Binario");
           opc = leer.nextInt();
        
        
        switch (opc) {
            case 1:
                  System.out.println ("Impresion In-Orden: ");
                  abo.imprimirEntre ();
                break;
                
            case 2:
                System.out.println ("Impresion Pre-Orden: ");
                 abo.imprimirPre ();
                break;
                
            case 3:
                System.out.println ("Impresion Post-Orden: ");
                abo.imprimirPost ();
                break;
            case 4:
                System.out.println("\n La altura del Arbol Binario es: "+abo.retornarAltura());
                // System.out.print(abo.retornarAltura());
                break;
                
           case 5:
                System.out.println ("Cantidad de Nodos que hay en el Arbol Binario :"+abo.cantidad());
                break;
                
           case 6:
                abo.menorValorl();
                break;
                
           case 7:
               abo.mayorValorl();
               break;
           case 8:
                x= false;
                break;
            default:
                 System.out.println("Opcion invalida. ");
                System.out.println("Seleccione otra opcion diferente. ");
                 
       }
    }
      }      
    }
