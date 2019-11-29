package pl.put.poznan.bootstrap_builder.logic;

/**
 * Interface of builder
 */
public interface HTMLBuilder {

    /**
     * Add HTML opening tag into temporary skeleton
     */
    void addHTMLTag();

    /**
     * Add HTML closing tag into temporary skeleton
     */
    void addHTMLClosingTag();

    /**
     * Add Head opening tag into temporary skeleton
     */
    void addHeadTag();

    /**
     * Add Head closing tag into temporary skeleton
     */
    void addHeadClosingTag();

    /**
     * Add Body opening tag into temporary skeleton
     */
    void addBodyTag();

    /**
     * Add Body closing tag into temporary skeleton
     */
    void addBodyClosingTag();

    /**
     * Add Title tag into temporary skeleton
     */
    void addTitleTag();

    /**
     * Add Bootstrap tag into temporary skeleton
     */
    void addBootstrapTag();

    /**
     * Add Footer tag into temporary skeleton
     */
    void addFooterTag();

    /**
     * Add Header tag into temporary skeleton
     */
    void addHeaderTag();

    /**
     * Add Main tag into temporary skeleton
     */
    void addMainTag();

    /**
     * Function for getting results
     * @return created instance of HTML class
     */
    HTML getHTML();
}
