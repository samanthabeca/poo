public class Principal {
    public static void main(String[] args) {
        Cavalo cav1 = new Cavalo();
        
        cav1.inicializar("Azulao", 35, 350.5, "marrom");

        cav1.descobrirRaca();
        cav1.valorRaca();
        cav1.mostrarEstado();
    }
}
