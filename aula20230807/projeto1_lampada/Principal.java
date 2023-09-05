public class Principal {
    public static void main(String[] args) {
        Lampada obj1 = new Lampada();

        System.out.print("Como a lâmpada está agora: ");
        obj1.mostraEstado();

        System.out.println("Acendendo a lâmpada...");
        obj1.acende();
        obj1.mostraEstado();

        System.out.println("Apagando a lâmpada...");
        obj1.apaga();
        obj1.mostraEstado();

        System.out.println("O estado atual da lâmpada é: " + obj1.estadoDaLampada);
    }
}
