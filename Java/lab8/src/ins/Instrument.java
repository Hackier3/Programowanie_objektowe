package ins;
import java.time.LocalDate;

public abstract class Instrument {
    String producent;
    LocalDate rokProdukcji;

    public Instrument(LocalDate rokProdukcji, String producent){
        this.rokProdukcji = rokProdukcji;
        this.producent = producent;
    }

    public String getProducent() {
        return producent;
    }

    abstract public String dzwiek();

    public String toString(){
        return this.getClass().getSimpleName() + " " + producent + " " + rokProdukcji;
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        Instrument instrument = (Instrument) obj;
        return producent.equals(instrument.producent)
                && rokProdukcji.equals(instrument.rokProdukcji);
    }
}