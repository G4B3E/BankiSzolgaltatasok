package hu.petrik.bankiszolgatatasok;

public abstract class Szamla extends BankiSzolgaltatas {

    protected int aktualisEgyenleg;

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public boolean befizet(int osszeg){
        aktualisEgyenleg+=osszeg;
        return true;
    }
    public abstract boolean kivesz(int osszeg);

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }


}
