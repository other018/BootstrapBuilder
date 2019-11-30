package pl.put.poznan.bootstrap_builder.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import pl.put.poznan.bootstrap_builder.logic.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/skeleton")
public class BootstrapBuilderController {

    private static final Logger logger = LoggerFactory.getLogger(BootstrapBuilderController.class);

    private List<HTML> htmlSkeletons;

    public BootstrapBuilderController() {
        this.htmlSkeletons = new ArrayList<>();
        htmlSkeletons.add(new Director(new HTMLBootstrapBuilder()).constructHTML());
        htmlSkeletons.add(new Director(new HTMLHeaderBuilder()).constructHTML());
        htmlSkeletons.add(new Director(new HTMLFixedFooterBuilder()).constructHTML());
        htmlSkeletons.add(new Director(new HTMLStaticFooterBuilder()).constructHTML());
    }


//    @GetMapping(value = "/all", produces = "application/json")
//    public List<HTML> getAllSkeletons(){
//        return htmlSkeletons;
//    }

    @GetMapping(produces = "application/json", value = "/{description}")
    public String getElementByDescription(@PathVariable String description){
        Optional<HTML> searchedHTML = htmlSkeletons.stream().
                filter(html -> html.getDescription().equals(description)).findFirst();
        logger.debug("Requested for HTML object with: " + description + " description");
        return searchedHTML.get().getHtmlSkeleton();

    }





}
