package ejercicio_2;


import java.util.Scanner;
/**

 */
public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea iniciar el juego?");
        String resp = sc.nextLine();
        while (resp.equals("si")) {
            Tablero tablero = new Tablero();
            System.out.println("El tablero tiene un tamaño de 8X8");
            System.out.println("Ingrese la cantidad de botes con la que desea jugar");
            int cantBotes = sc.nextInt();
            sc.nextLine();
            tablero.agregarVariosBotes(cantBotes);
            tablero.mostrarTablero();
            System.out.println("¿Deseaa ingresar una posicion?");
            String respPos = sc.nextLine();

            while (respPos.equals("si")) {
               
                System.out.println("Ingrese un numero(fila)");
                Integer fila = sc.nextInt();
                sc.nextLine();
                System.out.println("Ingrese una letra en mayuscula correspondiente a la columna");
                Scanner in = new Scanner(System.in);
                String letra = in.nextLine();
                Integer columna = 0;
                switch(letra)
                {
                case "A" : {
                	columna = 1;
                	break;
                }
                case "B" : {
                	columna = 2;
                	break;
                }
                case "C" : {
                	columna = 3;
                	break;
                }
                case "D" : {
                	columna = 4;
                	break;
                }
                case "E" : {
                	columna = 5;
                	break;
                }
                case "F" : {
                	columna = 6;
                	break;
                }
                case "G" : {
                	columna = 7;
                	break;
                }
                case "H" : {
                	columna = 8;
                	break;
                }
                }
               /* if(letra == "A"){
                    columna = 1;
                }else { 
                	if(letra == "B"){
                		columna = 2;
                	}
                } else {
                	if(letra == "C"){
                    columna = 3;
                	}
                }else { 
                	if (letra == "D"){
                		columna = 4;
                }else { if(letra == "E"){
                    columna = 5;
                }else { if(letra == "F"){
                    columna = 6;
                }else { if(letra == "G"){
                    columna = 7;
                }else { if(letra == "H"){
                    columna = 8;}
                }*/
                System.out.println(columna);
                tablero.boteHundido(--fila, --columna);
                System.out.println("¿Deseaa ingresar una posicion?");
                respPos = sc.nextLine();
                tablero.mostrarTablero();
            }

            if (tablero.getCantidadTotal() <= 0) {
                System.out.println("Fin del juego. Has hundido todos los botes");
            } else {
                System.out.println("Fin del juego. Has perdido");
                System.out.println("Cantidad de botes hundidos: " + tablero.getCantidadTotal());
                tablero.mostrarTablero();
            }

            System.out.println("Desea reiniciar el tablero?");
            resp = sc.nextLine();

            if (resp.equals("si")) {
                tablero.reiniciarTablero();
            }

        }
    }
}
