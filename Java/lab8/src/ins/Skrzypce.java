package ins;

import java.time.LocalDate;

public class Skrzypce extends Instrument{
    public Skrzypce(LocalDate rokProdukcji, String producent) {
        super(rokProdukcji, producent);
    }

    @Override
    public String dzwiek() {
        return "siup";
    }
}
