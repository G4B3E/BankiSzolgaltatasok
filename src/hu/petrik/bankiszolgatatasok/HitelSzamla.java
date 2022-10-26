package hu.petrik.bankiszolgatatasok;

public class HitelSzamla extends Szamla{
    private int hitelKeret;

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg){
        if(osszeg > hitelKeret + aktualisEgyenleg){
            return false;
        }
        else{
            aktualisEgyenleg -= osszeg;
            return true;

        }
    }

    public HitelSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

}
