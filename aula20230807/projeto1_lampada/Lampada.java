public class Lampada {
    int estadoDaLampada;

    public int acende(){
        return estadoDaLampada = 1;
    }

    public int apaga(){
        return estadoDaLampada = 0;
    }

    void mostraEstado(){
        if (estadoDaLampada == 1)
            System.out.println("A lâmpada está acesa");
        else
            System.out.println("A lâmpada está apagada");
    }
}