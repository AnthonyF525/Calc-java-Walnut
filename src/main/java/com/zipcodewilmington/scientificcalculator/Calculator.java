package com.zipcodewilmington.scientificcalculator;

public class Calculator {

    private double display;
    private boolean hasError;
    private double memory;

    public Calculator() {
        this.display = 0.0;
        this.memory = 0.0;
        this.hasError = false;
    }

    // Display methods
    public String getDisplay() {
        return hasError ? "Err" : String.valueOf(display);
    }

    public double getDisplayValue() {
        return display;
    }

    public boolean hasError() {
        return hasError;
    }

    public void clear() {
        display = 0.0;
        hasError = false;
    }

    public void set(double value) {
        if (!hasError) {
            display = value;
        }
    }

    // Arithmetic
    public void add(double value) {
        if (!hasError) display += value;
    }

    public void subtract(double value) {
        if (!hasError) display -= value;
    }

    public void multiply(double value) {
        if (!hasError) display *= value;
    }

    public void divide(double value) {
        if (!hasError) {
            if (value == 0) {
                setError();
            } else {
                display /= value;
            }
        }
    }

    public void square() {
        if (!hasError) display *= display;
    }

    public void sqrt() {
        if (!hasError) {
            if (display < 0) {
                setError();
            } else {
                display = Math.sqrt(display);
            }
        }
    }

    public void power(double exponent) {
        if (!hasError) display = Math.pow(display, exponent);
    }

    public void inverse() {
        if (!hasError) {
            if (display == 0) {
                setError();
            } else {
                display = 1 / display;
            }
        }
    }

    public void invertSign() {
        if (!hasError) display = -display;
    }

    private void setError() {
        display = Double.NaN;
        hasError = true;
    }

    // Memory Functions

    public void memoryStore() {
        if (!hasError) {
            memory = display;
        }
    }

    public void memoryRecall() {
        if (!hasError) {
            display = memory;
        }
    }

    public void memoryClear() {
        memory = 0.0;
    }

    public void memoryAdd() {
        if (!hasError) {
            memory += display;
        }
    }

    public void memorySubtract() {
        if (!hasError) {
            memory -= display;
        }
    }

    public double getMemoryValue() {
        return memory;
    }
}

