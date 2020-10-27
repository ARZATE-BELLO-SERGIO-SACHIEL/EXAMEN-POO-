import java.util.Scanner;

class Pokemon{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
     
     int vida1,vida2,vida3,fuerza1,fuerza2,fuerza3,defensa1,defensa2,defensa3;
     int id1,id2,id3;
     int opcion;
     String nombre1,nombre2,nombre3,ataquep1,ataquep2,ataquep3,ataques1,ataques2,ataques3;
    

     System.out.println("3IV8_ARZATE_BELLO_SERGIO_SACHIEL");
     System.out.println("");
     System.out.println("VIENVENIDO A LA POKEDEX");

     System.out.println("ingrese los datos del primer Pokemon");
     System.out.println("ID");
     id1 = entrada.nextInt();
     System.out.println("ingrese el nombre del pokemon");
     nombre1 = entrada.nextLine();
     System.out.println("fuerza");
     fuerza1 = entrada.nextInt();
     System.out.println("defensa");
     defensa1 = entrada.nextInt();
     System.out.println("vida");
     vida1 = entrada.nextInt();
     System.out.println("ataque principal");
     ataquep1 = entrada.nextLine();
     System.out.println("ataque secundario");
     ataques1 = entrada.nextLine();
     System.out.println("");
     System.out.println("");

     System.out.println("ingrese los datos del segundo Pokemon");
     System.out.println("ID");
     id2 = entrada.nextInt();
     System.out.println("ingrese el nombre del pokemon");
     nombre2 = entrada.nextLine();
     System.out.println("fuerza");
     fuerza2 = entrada.nextInt();
     System.out.println("defensa");
     defensa2 = entrada.nextInt();
     System.out.println("vida");
     vida2 = entrada.nextInt();
     System.out.println("ataque principal");
     ataquep2 = entrada.nextLine();
     System.out.println("ataque secundario");
     ataques2 = entrada.nextLine();
     System.out.println("");
     System.out.println("");
     
     System.out.println("ingrese los datos del tercer Pokemon");
     System.out.println("ID");
     id3 = entrada.nextInt();
     System.out.println("ingrese el nombre del pokemon");
     nombre3 = entrada.nextLine();
     System.out.println("fuerza");
     fuerza3 = entrada.nextInt();
     System.out.println("defensa");
     defensa3 = entrada.nextInt();
     System.out.println("vida");
     vida3 = entrada.nextInt();
     System.out.println("ataque principal");
     ataquep3 = entrada.nextLine();
     System.out.println("ataque secundario");
     ataques3 = entrada.nextLine();
     System.out.println("");
     System.out.println("");
     
     do {
     System.out.println("eliga un opion");
     System.out.println("1 datos de "+nombre1);
     System.out.println("2 datos de bulbasaur"+nombre2);
     System.out.println("3 datos de squartle"+nombre3);
     System.out.println("4 BATALLA POKEMON");
     System.out.println("6 salir");
     opcion = entrada.nextInt();
     }while(opcion>=0);

     switch (opcion) {
        case 1:
            System.out.println("los datos de"+nombre1+"son: ");
            System.out.println("ID "+id1);
            System.out.println("fuerz "+fuerza1);
            System.out.println("defensa "+defensa1);
            System.out.println("vida "+vida1);
            System.out.println("ataque principal "+ataquep1);
            System.out.println("ataque secundario "+ataques1);

            break;
        case 2:
            System.out.println("los datos de"+nombre2+"son: ");
            System.out.println("ID "+id2);
            System.out.println("fuerz "+fuerza2);
            System.out.println("defensa "+defensa2);
            System.out.println("vida "+vida2);
            System.out.println("ataque principal "+ataquep2);
            System.out.println("ataque secundario "+ataques2);
            break;
        case 3:
            System.out.println("los datos de"+nombre3+"son: ");
            System.out.println("ID "+id3);
            System.out.println("fuerz "+fuerza3);
            System.out.println("defensa "+defensa3);
            System.out.println("vida "+vida3);
            System.out.println("ataque principal "+ataquep3);
            System.out.println("ataque secundario "+ataques3);
            break;
        case 4:


            break;
        
     
         default:
             break;
     }



    }
}
