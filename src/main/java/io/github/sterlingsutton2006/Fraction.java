package io.github.sterlingsutton2006;

class Fraction {
    private int numerator;
    private int denominator;
    private int whole;

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

    public int getWhole() {
        return whole;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setWhole(int whole) {
        this.whole = whole;
    }

    public double getValue() {
        return whole + ((double) numerator / (double) denominator);
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

        int sign = 1;

        if (numerator < 0 && !(denominator < 0) || denominator < 0 && !(numerator < 0)) {
            sign = -1;
        }

        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);

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

        if (numerator >= denominator) {
            whole = sign * (numerator / denominator);
            numerator = numerator % denominator;
        }
        else {
            numerator *= sign;
        }

    }

    public String toString() {
        String returnStr = "";
        if (whole != 0 && numerator == 0) {
            returnStr += whole;
        }
        else if (whole != 0) {
            returnStr += whole + "_";
            returnStr += numerator + "/" + denominator;
        }
        else {
            returnStr += numerator + "/" + denominator;
        }
        return returnStr;
    }
}