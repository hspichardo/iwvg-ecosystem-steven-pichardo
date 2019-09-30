package es.upm.miw.iwvg.ecosystem;

public class Fraction {
    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isPropia(){
        if (this.getNumerator() > this.getDenominator()){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isImpropia(){
        if(this.getDenominator() > this.getNumerator()){
            return  true;
        }
        else {
            return false;
        }
    }

    public boolean isEquivalente(Fraction f2){
        if (this.getNumerator() * f2.getDenominator() == this.getDenominator() * f2.getNumerator() ){
            return true;

        }
        else{
            return false;
        }
    }

    public boolean isMayor(Fraction f2){
        int fra1 = this.getNumerator() / this.getDenominator();
        int fra2 = f2.getNumerator() / f2.getDenominator();

        if(fra1 > fra2){
            return true;
        }
        else {
            return false;
        }

    }
}
