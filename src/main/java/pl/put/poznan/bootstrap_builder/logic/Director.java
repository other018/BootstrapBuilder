package pl.put.poznan.bootstrap_builder.logic;
/**
 * @author Marcel Lipczynski, Grzegorz Otworowski, Zuzanna Zelek
 * @version 1.0
 * @since 1.0
 */
public class Director {
    /**
     * Represents Builder object that will be injected to Director object
     */
    private HTMLBuilder htmlBuilder;

    /**
     * Creates a Director and injects concrete HTMLBuilder object
     * @param htmlBuilder builder that will build a html object
     */
    public Director(HTMLBuilder htmlBuilder) {
        this.htmlBuilder = htmlBuilder;
    }

    /**
     * Method that constructs HTML object by concrete Builder
     * @return HTML object with skeleton built by concrete HTMLBuilder object passed to the Director object
     */
    public HTML constructHTML() {
        htmlBuilder.addHTMLTag();
        htmlBuilder.addHeadTag();

        htmlBuilder.addBootstrapTag();
        htmlBuilder.addTitleTag();

        htmlBuilder.addHeadClosingTag();


        htmlBuilder.addBodyTag();

        htmlBuilder.addMainTag();

        htmlBuilder.addHeaderTag();
        htmlBuilder.addFooterTag();

        htmlBuilder.addBodyClosingTag();


        htmlBuilder.addHTMLClosingTag();

        return htmlBuilder.getHTML();

    }

}
