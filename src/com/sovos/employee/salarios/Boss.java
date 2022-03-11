package com.sovos.employee.salarios;

import com.sovos.employee.abs.Employee;

public class Boss extends Employee {

    public double salario;

    public Boss(String nome, String familia, double salario) {
        super(nome, familia);
        this.salario = salario;
    }


    @Override
    public double ganhar() {
        return getSalario();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
