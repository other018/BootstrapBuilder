package pl.put.poznan.bootstrap_builder.logic;

public class HTML {

    private String footer;

    private int id; //maybe not id but description e.g. "static-footer","fixed-footer", "header", "bootstrap" etc.
    private String htmlSkeleton;


    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHtmlSkeleton() {
        return htmlSkeleton;
    }

    public void setHtmlSkeleton(String htmlSkeleton) {
        this.htmlSkeleton = htmlSkeleton;
    }
}
