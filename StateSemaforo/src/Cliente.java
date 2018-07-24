public class Cliente {

    public static void main(String[] args) {

        Semaforo semaforo = new Semaforo();
        semaforo.luzAmarela();
        semaforo.luzVermelha();
        semaforo.luzVerde();
        semaforo.panic();
        semaforo.off();
        semaforo.luzAmarela();
        semaforo.on();
    }
}
