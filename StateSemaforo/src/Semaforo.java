public class Semaforo {

    protected SemaforoState estado;

    public Semaforo(){
        estado = new SemaforoVermelho();
    }

    public void luzVermelha(){
        estado = estado.luzVermelha();
    }

    public void luzVerde(){
        estado = estado.luzVerde();
    }

    public void luzAmarela(){
        estado = estado.luzAmarela();
    }

    public void panic(){
        estado = estado.panico();
    }

    public void off(){
        estado = estado.off();
    }

    public void on(){
        estado = estado.on();
    }
}
