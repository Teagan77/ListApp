package configuration;

import org.randall.teagan.ListService;
import org.randall.teagan.ListServiceImplementation;
import org.randall.teagan.SpringListServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@author: Teagan Randall
 *@studNo: 215 095 111
 */

@Configuration
public class ListAppConfiguration {

    @Bean(name = "list")
    public ListService getList(){
        return new ListServiceImplementation();
    }

    @Bean(name = "springlist")
    public ListService getSpringList(){
        return new SpringListServiceImplementation();
    }
}
