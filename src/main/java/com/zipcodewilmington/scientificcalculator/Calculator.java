package com.zipcodewilmington.scientificcalculator;

public class Calculator {
    private double display = 0.0;
    private boolean hasError = false;

    public double getDisplayValue() {
        return display;
    }

    public String getDisplay() {
        return hasError ? "Err" : String.valueOf(display);
    }

    public boolean hasError() {
        return hasError;
    }

    public void clear() {
        display = 0.0;
        hasError = false;
    }

    public void add(double value) {
        display += value;
    }

    public void subtract(double value) {
        display -= value;
    }

    public void multiply(double value) {
        display *= value;
    }

    public void divide(double value) {
        if (value == 0) {
            setError();
        } else {
            display /= value;
        }
    }

    public void square() {
        display *= display;
    }

    public void sqrt() {
        if (display < 0) {
            setError();
        } else {
            display = Math.sqrt(display);
        }
    }

    public void exponentiate(double exponent) {
        display = Math.pow(display, exponent);
    }

    public void inverse() {
        if (display == 0) {
            setError();
        } else {
            display = 1 / display;
        }
    }

    public void invertSign() {
        display = -display;
    }

    private void setError() {
        display = Double.NaN;
        hasError = true;
    }
}
