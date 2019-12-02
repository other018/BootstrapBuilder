package pl.put.poznan.bootstrap_builder.logic;
/**
 * @author Marcel Lipczynski, Grzegorz Otworowski, Zuzanna Zelek
 * @version 1.0
 * @since 1.0
 */
public interface HTMLBuilder {

    /**
     * Method that adds HTML opening tag to skeleton
     */
    void addHTMLTag();
    /**
     * Method that adds HTML closing tag to skeleton
     */
    void addHTMLClosingTag();
    /**
     * Method that adds head opening tag to skeleton
     */
    void addHeadTag();
    /**
     * Method that adds head closing tag to skeleton
     */
    void addHeadClosingTag();
    /**
     * Method that adds body opening tag to skeleton
     */
    void addBodyTag();
    /**
     * Method that adds body closing tag to skeleton
     */
    void addBodyClosingTag();

    /**
     * Method that adds title opening and closing tag to skeleton
     */
    void addTitleTag();

    /**
     * Method that adds Bootstrap  tags to skeleton
     */
    void addBootstrapTag();
    /**
     * Method that adds footer tag to skeleton
     */
    void addFooterTag();
    /**
     * Method that adds header tag to skeleton
     */
    void addHeaderTag();
    /**
     * Method that adds main tag with container class to skeleton
     */
    void addMainTag();
    /**
     * Method that sets HTML skeleton and description and returns HTML object
     * @return HTML object
     */
    HTML getHTML();
}
