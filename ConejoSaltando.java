package SaltosConejo;

public class ConejoSaltando {

    public static void main(String[] args) {
        double distanciaTotal = 180.0; // Distancia de A a B (en cm)
        double distanciaC = 87.5; // Distancia de A a C (en cm)
        double distanciaRecorrida = 0.0; // Distancia recorrida por el conejo
        int saltos = 0; // Contador de saltos

        // Mientras el conejo no haya alcanzado el punto C
        while (distanciaRecorrida < distanciaC) {
            // Cada salto es la mitad de la distancia restante
            double salto = (distanciaTotal - distanciaRecorrida) / 2;
            distanciaRecorrida += salto; // Aumentamos la distancia recorrida
            saltos++; // Aumentamos el contador de saltos
        }

        // Imprimir el número de saltos y la distancia recorrida
        System.out.println("El conejo ha llegado al punto C después de " + saltos + " saltos.");
    }
}
