public class Zapping {

    public static int Canales(int origen, int destino) {
        int toques = 0;
        toques = Math.abs(destino - origen);
        return Math.min(toques , (99 - toques));
    }
}
