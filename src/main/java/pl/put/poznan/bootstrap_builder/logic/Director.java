package pl.put.poznan.bootstrap_builder.logic;

public class Director {
    private HTMLBuilder htmlBuilder;

    public Director(HTMLBuilder htmlBuilder) {
        this.htmlBuilder = htmlBuilder;
    }

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
