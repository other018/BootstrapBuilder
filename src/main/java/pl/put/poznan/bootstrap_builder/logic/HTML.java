package pl.put.poznan.bootstrap_builder.logic;

public class HTML {

//    private String footer;

    private String description; //maybe not id but description e.g. "static-footer","fixed-footer", "header", "bootstrap" etc.
    private String htmlSkeleton;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHtmlSkeleton() {
        return htmlSkeleton;
    }

    public void setHtmlSkeleton(String htmlSkeleton) {
        this.htmlSkeleton = htmlSkeleton;
    }
}
