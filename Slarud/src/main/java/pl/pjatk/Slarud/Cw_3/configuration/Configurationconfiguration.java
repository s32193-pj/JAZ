package pl.pjatk.Slarud.Cw_3.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import pl.pjatk.Slarud.JestemKlasa;
import pl.pjatk.Slarud.cwiczenie_1.Chlep;
import pl.pjatk.Slarud.cwiczenie_1.Mleko;
import java.util.Arrays;
import java.util.List;

@Configuration
public class Configurationconfiguration {
    @Bean
    public Chlep chlep() {
        return new Chlep();
    }

    @Bean
    public Mleko mleko(Chlep chlep) {
        return new Mleko(chlep);
    }

    @Bean
    public JestemKlasa jestemKlasa() {
        return new JestemKlasa();
    }

    @Bean
    public List<String> defaultData( @Value("${my.custom.property:mydefaultvalue}") String property  ) {


        System.out.println(property);
        return Arrays.asList("chlep1","chlep2","chlep3","chlep4","chlep5");
    }

    @Bean
    @ConditionalOnProperty(name = "some.second.property", havingValue = "true")
    public JestemKlasa jestemKlasa2() {
        System.out.println("jestemKlasa2");
        return new JestemKlasa();
    }


    @Bean
    public CustomPropertiesExcercise customProperties() {
        return new CustomPropertiesExcercise();
    }

    @Bean
    public JestemKlasa jestemKlasa3(CustomPropertiesExcercise customPropertiesExcercise) {
        System.out.println(customPropertiesExcercise.getCredentials().getUser());
        System.out.println(customPropertiesExcercise.getCredentials().getPassword());
        System.out.println(customPropertiesExcercise.getLoginUrl());




        return new JestemKlasa();
    }


}
