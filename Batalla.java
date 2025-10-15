public class Batalla {
 
    public static void iniciar(Criatura c1, Criatura c2) {
        System.out.println("¡Comienza la batalla entre " + c1.nombre + " y " + c2.nombre + "!");
        int turno = 1;
 
        while (c1.estaViva() && c2.estaViva()) {
            System.out.println("\nTurno " + turno++);
            c1.atacar(c2);
            if (!c2.estaViva()) break;
            c2.atacar(c1);
        }
 
        if (c1.estaViva()) {
            System.out.println("\n" + c1.nombre + " ha ganado la batalla.");
        } else {
            System.out.println("\n" + c2.nombre + " ha ganado la batalla.");
        }
    }
