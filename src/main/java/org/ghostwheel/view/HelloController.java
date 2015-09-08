package org.ghostwheel.view;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by vladyslavprytula on 17/08/15.
 */
@RestController
public class HelloController {

    @RequestMapping("/test")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}