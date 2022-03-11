package com.sovos.employee.main;

import com.sovos.employee.salarios.Boss;
import com.sovos.employee.salarios.PorComissao;
import com.sovos.employee.salarios.PorHora;
import com.sovos.employee.salarios.PorItem;

import java.text.DecimalFormat;

public class Test {

    public static void main(String[] args) {

        Boss bs = new Boss("Fernanda","Zeliz", 29222);
        PorComissao pc = new PorComissao("Ramon", "Silveira",1200,30,200);
        PorHora ph = new PorHora("Diego","Silva Sauro", 7,524);
        PorItem pi = new PorItem("Everton", "Baterista",500, 8);
        DecimalFormat df = new DecimalFormat();


          System.out.println(bs.toString(bs.getNome(), bs.getFamilia()) + " ganha $" + df.format(bs.ganhar()));
          System.out.println(pc.toString(pc.getNome(), pc.getFamilia()) + " ganha $" + df.format(pc.ganhar()));
          System.out.println(pi.toString(pi.getNome(), pi.getFamilia()) + " ganha $" + df.format(pi.ganhar()));
          System.out.println(ph.toString(ph.getNome(), ph.getFamilia()) + " ganha $" + df.format(ph.ganhar()));

    }
}
