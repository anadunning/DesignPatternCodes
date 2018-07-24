public interface SemaforoState {

    SemaforoState luzVermelha();
    SemaforoState luzVerde();
    SemaforoState luzAmarela();
    SemaforoState panico();
    SemaforoState off();
    SemaforoState on();
}
