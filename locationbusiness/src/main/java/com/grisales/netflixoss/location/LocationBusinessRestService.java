package com.grisales.netflixoss.location;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by grisales on 4/24/18.
 */
@Controller
public class LocationBusinessRestService {

    @Value("${rest.service.cloud.config.example}")
    String valueExample = null;

    private static Logger log = LoggerFactory.getLogger(LocationBusinessRestService.class);

    @GetMapping(value = "/example")
    public String example() {

        String result = "{Empty Value}";
        if(valueExample.equals(null)){

            log.error("PublicRestService - Called with errors property rest.service.cloud.config.example is empty");

        }else{
            log.info("PublicRestService - Called with this property: (rest.service.cloud.config.example:"+valueExample+")");
            result = valueExample;
        }
        return result;
    }
}
