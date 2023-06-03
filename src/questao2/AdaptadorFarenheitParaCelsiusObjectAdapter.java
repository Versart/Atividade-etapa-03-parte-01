package questao2;

public class AdaptadorFarenheitParaCelsiusObjectAdapter implements MedidorCelsiusIF{

    private MedidorFarenheit medidorFarenheit;

    public AdaptadorFarenheitParaCelsiusObjectAdapter(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {
       return medidorFarenheit.getTemperaturaFarenheit();
    }
}
