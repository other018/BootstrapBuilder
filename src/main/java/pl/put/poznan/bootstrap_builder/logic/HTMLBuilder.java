package pl.put.poznan.bootstrap_builder.logic;

public interface HTMLBuilder {

    void addHTMLTag();
    void addHTMLClosingTag();
    void addHeadTag();
    void addHeadClosingTag();
    void addBodyTag();
    void addBodyClosingTag();
    void addTitleTag();
    void addBootstrapTag();
    void addFooterTag();
    void addHeaderTag();
    void addMainTag();
    HTML getHTML();
}
