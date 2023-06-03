package questao2;

import java.util.Random;

public class MedidorFarenheit {


    public double getTemperaturaFarenheit(){
        System.out.println("Medindo em Farenheit..");
        return new Random().nextDouble() * 100;
    }
}
