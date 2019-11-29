package pl.put.poznan.bootstrap_builder.logic;

/**
 * Class with identifying name and whole HTML skeleton
 */
public class HTML {

//    private String footer;
    /**
     * Easy to recognise description, identifying type of HTML skeleton
     */
    private String description; //maybe not id but description e.g. "static-footer","fixed-footer", "header", "bootstrap" etc.

    /**
     * Variable where the skeleton is created
     */
    private String htmlSkeleton;

    /**
     * Getter
     * @return identifying description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter
     * @param description name which will identify this instance of class HTML
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter
     * @return String with all HTML skeleton
     */
    public String getHtmlSkeleton() {
        return htmlSkeleton;
    }

    /**
     * Setter
     * @param htmlSkeleton setting the HTML skeleton
     */
    public void setHtmlSkeleton(String htmlSkeleton) {
        this.htmlSkeleton = htmlSkeleton;
    }
}
