public class IncrementDecrement {
    public static void main(String[] args){
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);

        //Postfija

        lives--; //Drecremento
        System.out.println(lives);

        lives++; //Incremento
        System.out.println(lives);

        //Prefija

        // Gana un regalo por ganar una vida (Mario)
        // La operacion ++ como sufijo, tiene menos jerarquia
        int gift = 100 + lives++;
        System.out.println("El valor del regalo es: " + gift + ", mientras que la cantidad de vidas son: " + lives );

        // Gana un regalo por ganar una vida (Mario)
        // La operacion ++ como prefijo, tiene mayor jerarquia
        int giftTwo = 100 + ++lives;
        System.out.println("El valor del regalo es: " + giftTwo + ", mientras que la cantidad de vidas son: " + lives );

    }
}
