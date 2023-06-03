package questao2;

public class Main {

    public static void main(String[] args) {
        MedidorCelsiusIF medidorCelsius = new Medidor();
        MedidorCelsiusIF medidorFarenheit = new AdaptadorFarenheitParaCelsiusObjectAdapter(new MedidorFarenheit());
        System.out.println(medidorFarenheit.medirTemperatura());
        System.out.println(medidorCelsius.medirTemperatura());

    }
}
