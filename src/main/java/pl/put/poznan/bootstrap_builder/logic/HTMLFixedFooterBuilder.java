package pl.put.poznan.bootstrap_builder.logic;

public class HTMLFixedFooterBuilder implements HTMLBuilder {

    private HTML html;
    private StringBuilder sb;

    public HTMLFixedFooterBuilder() {
        sb = new StringBuilder();
        html = new HTML();
    }


    @Override
    public void addMainTag() {
        sb.append("<main class=\"container\"></main>\n");
    }

    @Override
    public void addHTMLTag() {
        sb.append("<html>\n");
    }

    @Override
    public void addHTMLClosingTag() {
        sb.append("</html>");
    }

    @Override
    public void addHeadTag() {
        sb.append("<head>\n");
    }

    @Override
    public void addHeadClosingTag() {
        sb.append("</head>\n\n");
    }

    @Override
    public void addBodyTag() {
        sb.append("<body>\n");
    }

    @Override
    public void addBodyClosingTag() {
        sb.append("</body>\n");
    }

    @Override
    public void addTitleTag() {
        sb.append("<title></title>\n");
    }


    @Override
    public void addBootstrapTag() {
        sb.append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
        sb.append("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
        sb.append("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
        sb.append("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>");
    }

    @Override
    public void addFooterTag() {
        sb.append("<footer></footer>\n");
    }

    @Override
    public void addHeaderTag() {

    }

    @Override
    public HTML getHTML() {
        html.setHtmlSkeleton(sb.toString());
        html.setDescription("fixed");
        return html;
    }
}
