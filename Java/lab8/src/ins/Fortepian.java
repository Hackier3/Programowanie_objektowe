package ins;

import java.time.LocalDate;

public class Fortepian extends Instrument{
    public Fortepian(LocalDate rokProdukcji, String producent) {
        super(rokProdukcji, producent);
    }

    @Override
    public String dzwiek() {
        return "klik";
    }
}
