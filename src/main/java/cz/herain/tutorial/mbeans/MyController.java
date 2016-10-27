package cz.herain.tutorial.mbeans;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Vit Herain on 27/10/2016.
 */
@RestController
public class MyController {

    @GetMapping(value = "/")
    public String getNeco() {
        return "vole";
    }
}
