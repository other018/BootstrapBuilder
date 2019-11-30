package pl.put.poznan.bootstrap_builder.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.bootstrap_builder.logic.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/**
 * @author Marcel Lipczynski, Grzegorz Otworowski, Zuzanna Zelek
 * @version 1.0
 * @since 1.0
 */

@RestController
@RequestMapping("/skeleton")
public class BootstrapBuilderController {

    /**
     * Logger object returns logs of type INFO and DEBUG as set in application.properties file
     */
    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

    /**
     * Represents list of HTML objects built by each of available builder
     */
    private List<HTML> htmlSkeletons;

    /**
     * Creates Array list of HTML objects and adds four available objects built by builders
     */
    public BootstrapBuilderController() {
        this.htmlSkeletons = new ArrayList<>();
        htmlSkeletons.add(new Director(new HTMLBootstrapBuilder()).constructHTML());
        htmlSkeletons.add(new Director(new HTMLFooterBuilder()).constructHTML());
        htmlSkeletons.add(new Director(new HTMLFixedHeaderBuilder()).constructHTML());
        htmlSkeletons.add(new Director(new HTMLStaticHeaderBuilder()).constructHTML());
    }


//    @GetMapping(value = "/all", produces = "application/json")
//    public List<HTML> getAllSkeletons(){
//        return htmlSkeletons;
//    }

    /**
     *
     * @param description PathVariable that will be matched with description parameter with one of the available HTML objects
     * @return A String that represents HTML skeleton if object with given description was found in the list.
     */
    @GetMapping(produces = "application/json", value = "/{description}")
    public String getElementByDescription(@PathVariable String description){
        Optional<HTML> searchedHTML = htmlSkeletons.stream().
                filter(html -> html.getDescription().equals(description)).findFirst();
        logger.debug("Requested for HTML object with: " + description + " description");
        return searchedHTML.get().getHtmlSkeleton();

    }





}
