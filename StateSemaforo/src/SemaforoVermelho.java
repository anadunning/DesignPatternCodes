public class SemaforoVermelho implements SemaforoState {

    @Override
    public SemaforoState luzVermelha() {
        System.out.println("Mudou para luz verde");
        return new SemaforoVerde();
    }

    @Override
    public SemaforoState luzVerde() {
        System.out.println("Mudou para luz amarela");
        return new SemaforoAmarelo();
    }

    @Override
    public SemaforoState luzAmarela() {
        System.out.println("Mudou para luz vermelha");
        return new SemaforoVermelho();
    }

    @Override
    public SemaforoState panico() {
        System.out.println("Mudou para luz vermelha");
        return new SemaforoVermelho();
    }

    @Override
    public SemaforoState off() {
        System.out.println("Mudou para luz amarela intermitente");
        return new SemaforoAmareloIntermitente();
    }

    @Override
    public SemaforoState on() {
        System.out.println("Mudou para luz vermelha");
        return new SemaforoVermelho();
    }
}
