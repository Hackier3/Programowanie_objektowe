package ins;

import java.time.LocalDate;

public class Flet extends Instrument{
    public Flet(LocalDate rokProdukcji, String producent) {
        super(rokProdukcji, producent);
    }

    @Override
    public String dzwiek() {
        return "zium";
    }
}
