package hu.petrik.bankiszolgatatasok;

public class MegtakarításiSzámla extends Szamla{
    private double kamat;
    public static double alapkamat = 1.1;

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public MegtakarításiSzámla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapkamat;
    }

    @Override
    public boolean kivesz(int osszeg){
        if (aktualisEgyenleg-osszeg < 0){
            return false;
        }
        else {
            return true;
        }
    }
    public void KamatJovairas(){
        aktualisEgyenleg*=kamat;
    }


}
