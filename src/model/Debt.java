package model;

import exceptions.InvalidAmmountException;

public class Debt {
    private double value;

    public Debt(double value) throws InvalidAmmountException {
        //Podemos lanzar la expecion
        if (value <= 0){
            throw new InvalidAmmountException(value);
        }else {
            this.value = value;
        }
    }

    public double getValue() {return value;}
    public void setValue(double value) {this.value = value;}
}
