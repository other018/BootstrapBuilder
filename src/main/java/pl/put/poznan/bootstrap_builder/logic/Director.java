package pl.put.poznan.bootstrap_builder.logic;

/**
 * Director class
 */
public class Director {
    /**
     * Director's builder
     */
    private HTMLBuilder htmlBuilder;

    /**
     * Constructor
     * @param htmlBuilder which builder the director get
     */
    public Director(HTMLBuilder htmlBuilder) {
        this.htmlBuilder = htmlBuilder;
    }

    /**
     * Function which run builder
     * @return The HTML code
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
