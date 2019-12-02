package pl.put.poznan.bootstrap_builder.logic;

/**
 * @author Marcel Lipczynski, Grzegorz Otworowski, Zuzanna Zelek
 * @version 1.0
 * @since 1.0
 */
public class HTML {

//    private String footer;
    /**
     * Represents HTML distinguish marks
     */
    private String description;
    /**
     * Represent HTML skeleton
     */
    private String htmlSkeleton;

    /**
     * Get's the HTML description
     * @return A string representing distinguish mark of HTML object
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set's the HTML's description
     * @param description A String containing HTML description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get's the HTML's skeleton
     * @return A string representing whole skeleton of HTML object
     */
    public String getHtmlSkeleton() {
        return htmlSkeleton;
    }

    /**
     * Set's the HTML's skeleton
     * @param htmlSkeleton A String containing HTML's skeleton
     */
    public void setHtmlSkeleton(String htmlSkeleton) {
        this.htmlSkeleton = htmlSkeleton;
    }
}
