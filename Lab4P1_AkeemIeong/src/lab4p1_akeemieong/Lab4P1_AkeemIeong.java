package lab4p1_akeemieong;

import java.util.Scanner;
import static lab4p1_akeemieong.Lab4P1_AkeemIeong.leer;

public class Lab4P1_AkeemIeong {

        static Scanner leer = new Scanner(System.in);
    

    public static void main(String[] args) {
        int opcion;
        do{
            System.out.println("1->Sumador Binario");
        System.out.println("2->Contains");
        System.out.println("3->Alpha");
        System.out.println("4->Salir del programa");
        opcion =leer.nextInt();
        
        if (opcion==1){
            
                String cadena1,cadena2;
                System.out.println("Ingrese una cadena: ");
                cadena1=leer.next();
                System.out.println("Ingrese una cadena: ");
                cadena2=leer.next();
                cadena1.length();
                cadena2.length();
        }
        else
            if (opcion==2){
                String pri,sec;
                System.out.println("Ingrese la primera cadena: ");
                pri=leer.next().toLowerCase();
                System.out.println("Ingrese la segunda cadena: ");
                sec=leer.next().toLowerCase();
                if(pri.length()<sec.length())
                    System.out.println("El tamano de la segunda no puede ser mayor que el de la primera");
                else
                    Contains(pri,sec);
            }
            else
                if (opcion ==3){
                    String phrase;
                    System.out.println("Ingrese la cadena que desea evaluar: ");
                    phrase=leer.next().toLowerCase();
                        Alpha(phrase);
              
                }
        }
        while (opcion!=4);
        
        
    }
    public static void sumadorbinario(){
        
    }
    public static void Contains(String pri,String sec){
        for (int i=0;i<pri.length();i++){
            for (int j=0;j<sec.length();j++){
                if (sec.charAt(i)==pri.charAt(j)){
                    for(int o=0;o<sec.length();o++){
                        
                    }
                        
                }
                
            }
        }System.out.println("La cadena "+pri+" contiene a la cadena "+sec);
    }
    public static void Alpha(String phrase){
            int cont=0,cont9=0;
            for (int t=0;t <phrase.length();t++){
            char lt=phrase.charAt(t);
            if (97<=(int)lt &&(int)lt<=122){
                cont++;
            }
            else
                cont9++;
            }
            if (cont9>0){
                System.out.println("La cadena contiene caracteres que no son letras");
            }
            else
                System.out.println("La cadena solo contiene letras");
            
    }
}
