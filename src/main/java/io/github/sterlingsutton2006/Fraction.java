package io.github.sterlingsutton2006;

class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        }
        else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public double getValue() {
        return (double) numerator / (double) denominator;
    }

    public boolean equals(Fraction fraction) {
        return fraction.getValue() == this.getValue();
    }

    public int compareTo(Fraction fraction) {
        if (this.getValue() == fraction.getValue()) {
            return 0;
        }
        else if (this.getValue() > fraction.getValue()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public void reduce() {
        int gcfGuess;
        if (numerator < denominator || numerator == denominator) {
            gcfGuess = numerator;
        }
        else {
            gcfGuess = denominator;
        }

        while (gcfGuess > 1) {
            if (numerator % gcfGuess == 0 && denominator % gcfGuess == 0) {
                numerator /= gcfGuess;
                denominator /= gcfGuess;
                break;
            }
            else {
                gcfGuess--;
            }
        }
    }

    public String toString() {
        if (denominator != 1) {
            return (numerator + "/" + denominator);
        }
        else {
            return (numerator + "");
        }
    }
}