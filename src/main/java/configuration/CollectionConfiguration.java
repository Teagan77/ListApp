package configuration;

import org.randall.teagan.CollectionService;
import org.randall.teagan.CollectionServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@author: Teagan Randall
 *@studNo: 215 095 111
 */

@Configuration
public class CollectionConfiguration {

    @Bean(name = "list")
    public CollectionService getList(){
        return new CollectionServiceImplementation();
    }
}
