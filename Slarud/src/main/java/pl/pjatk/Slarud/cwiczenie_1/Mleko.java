package pl.pjatk.Slarud.cwiczenie_1;

import org.springframework.stereotype.Component;

@Component
public class Mleko {

    public Mleko(Chlep chlep) {
        System.out.println("Mleko");
        chlep.printName();
    }

    public void name_and_method(){
        System.out.println("Mleko name_and_method");
    }



}
