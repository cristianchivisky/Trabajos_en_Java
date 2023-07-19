package ejercicio_2;


import java.util.Random;



public class Tablero {

    private Bote[][] tablero;
    private Integer cantBotesTotal;

    public Tablero() {
        this.reiniciarTablero();
    }

    public final void reiniciarTablero() {
        this.tablero = new Bote[8][8];
    }

    public void agregarBote(Bote bote, Integer fila, Integer columna) {
        this.tablero[fila][columna] = bote;
        if (bote.getTamanio() == 2) {
            this.tablero[fila][++columna] = bote;
        } else if (bote.getTamanio() == 3) {
            this.tablero[fila][++columna] = bote;
            this.tablero[fila][++columna] = bote;
        }

    }

    public void agregarBoteRandomico() {
        Random randomico = new Random();
        int limite = 8;
        boolean existe = true;
        int fila = -1;
        int columna = -1;
        int limBote = 4;
         int tamanio = 0;

        while (existe == true || columna + tamanio >=8) {
            tamanio = randomico.nextInt(limBote);
            fila = randomico.nextInt(limite);
            columna = randomico.nextInt(limite);
            for (var i = columna; i < columna + tamanio; i++) {
                existe = this.verificarPos(fila, columna, tamanio);
            }
        }
        if (fila > -1 && columna > -1 ) {

            Bote bote = new Bote(tamanio);
            this.agregarBote(bote, fila, columna);
        }
    }

    public boolean verificarPos(Integer fila, Integer columna, Integer tamanio) {
        Boolean hayBarco = false;
        try {
            for (var i = columna; i < columna + tamanio; i++) {
                if (tablero[fila][i] != null) {
                    hayBarco = true;
                }
            }
        } catch (Exception e) {
            hayBarco = false;
        }

        return hayBarco;
    }

    public boolean verificarPosHundido(Integer fila, Integer columna) {
        Boolean hayBarco = false;
        if (tablero[fila][columna] != null) {
            hayBarco = true;

        }

        return hayBarco;
    }

    public void agregarVariosBotes(Integer cantidad) {
        this.cantBotesTotal = cantidad;
        for (int i = 0; i < cantidad; i++) {
            this.agregarBoteRandomico();

        }
    }

    public void boteHundido(Integer fila, Integer columna) {
        if (this.verificarPosHundido(fila, columna) == true) {
            tablero[fila][columna] = null;
            System.out.println("Bote hundido");
            this.cantBotesTotal -= 1;
        } else {
            System.out.println("Hay agua");
        }
    }

    public Integer getCantidadTotal() {
        return this.cantBotesTotal;

    }

    public void mostrarTablero() {
        Integer j, i;
        System.out.println("Tablero");
        for (i = 0; i < tablero.length; i++) {
            for (j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
