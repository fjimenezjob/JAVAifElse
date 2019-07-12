package paquete;

class Main{

    public static void main (String[] args){

        int numero  = 50;
        int aux = 12;
        boolean condicion = true;

        /** en los if podemos condicionar con:
         *
         * < - menor que
         * <= - menor o igual que
         * > - mayor que
         * >= - mayor o igual que
         * == - identico que
         * || - una cosa o la otra
         * && - una cosa y la otra
         * ! - diferente
         */

        if(numero <=10) {
            //CODIGO QU E SE EJECUTA SI SE CUMPLE LA CONDICION QUE LE PONGAMOS

            condicion = true;

            System.out.println(numero);
        } else {
            condicion = false;
            String intruccion = ("Codigo facilito que saldra en pantalla cuando el if sea false");

            System.out.println(intruccion);
        }

        //***********************************************************


        if(condicion)
        {
            System.out.println("La condicion es verdadera por que el if lo decide");
        }
        else
        {
            System.out.println("La condicion es falsa porque el if de arriba lo decide");
        }
    }
}