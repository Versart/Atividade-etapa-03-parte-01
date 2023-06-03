package questao2;

import java.util.Random;

public class Medidor implements MedidorCelsiusIF{


    @Override
    public double medirTemperatura() {
        System.out.println("Medindo em celsius");
        return new Random().nextDouble() * 100;
    }
}
