package pl.pjatk.Slarud.cwiczenie_2;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import pl.pjatk.Slarud.cwiczenie_1.Chlep;
import pl.pjatk.Slarud.cwiczenie_1.Mleko;

@Component
public class Cw_2 {

    public Cw_2(ApplicationContext applicationContext) {

        Chlep chlep = applicationContext.getBean("chlep", Chlep.class);
        Mleko mleko = applicationContext.getBean("mleko", Mleko.class);

        chlep.name_and_method2();
        mleko.name_and_method();
    }
}
