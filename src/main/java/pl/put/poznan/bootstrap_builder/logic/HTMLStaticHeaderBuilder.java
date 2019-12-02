package pl.put.poznan.bootstrap_builder.logic;
/**
 * @author Marcel Lipczynski, Grzegorz Otworowski, Zuzanna Zelek
 * @version 1.0
 * @since 1.0
 */
public class HTMLStaticHeaderBuilder implements HTMLBuilder {
    /**
     * Represents HTML which builder builds
     */
    private HTML html;

    /**
     * Represents StringBuilder in which creates HTML skeleton
     */
    private StringBuilder sb;

    /**
     * Creates a HTMLStaticHeaderBuilder
     * Inside creates new instance of StringBuilder and HTML class
     */
    public HTMLStaticHeaderBuilder() {
        sb = new StringBuilder();
        html = new HTML();
    }

    /**
     * Method that adds main tag with container class to skeleton
     */
    @Override
    public void addMainTag() {
        sb.append("<main class=\"container\"></main>\n");
    }
    /**
     * Method that adds HTML opening tag to skeleton
     */
    @Override
    public void addHTMLTag() {
        sb.append("<html>\n");
    }
    /**
     * Method that adds HTML closing tag to skeleton
     */
    @Override
    public void addHTMLClosingTag() {
        sb.append("</html>");
    }
    /**
     * Method that adds head opening tag to skeleton and set it's position on static
     */
    @Override
    public void addHeadTag() {
        sb.append("<head>\n<style>header{position:static} </style>\n");
    }
    /**
     * Method that adds head closing tag to skeleton
     */
    @Override
    public void addHeadClosingTag() {
        sb.append("</head>\n\n");
    }
    /**
     * Method that adds body opening tag to skeleton
     */
    @Override
    public void addBodyTag() {
        sb.append("<body>\n");
    }
    /**
     * Method that adds body closing tag to skeleton
     */
    @Override
    public void addBodyClosingTag() {
        sb.append("</body>\n");
    }
    /**
     * Method that adds title opening and closing tag to skeleton
     */
    @Override
    public void addTitleTag() {
        sb.append("<title></title>\n");
    }

    /**
     * Method that adds Bootstrap tags to skeleton
     */
    @Override
    public void addBootstrapTag() {
        sb.append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
        sb.append("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
        sb.append("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
        sb.append("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
    }
    /**
     * Empty method because footer tag isn't needed in this skeleton
     */
    @Override
    public void addFooterTag(){}
    /**
     * Method that adds header opening and closing tag to skeleton
     */
    @Override
    public void addHeaderTag() {
        sb.append("<header></header>\n");
    }
    /**
     * Method that sets HTML skeleton and description and returns HTML object
     * @return HTML object
     */
    @Override
    public HTML getHTML() {
        html.setHtmlSkeleton(sb.toString());
        html.setDescription("static");
        return html;
    }
}

