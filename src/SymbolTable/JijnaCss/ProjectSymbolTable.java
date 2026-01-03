package SymbolTable.JijnaCss;

class ProjectSymbolTable {
    private SymbolTable jinjaVariables;
    private SymbolTable cssVariables;
    private SymbolTable cssClasses;
    private SymbolTable cssIds;
    private SymbolTable htmlIds;

    public ProjectSymbolTable() {
        this.jinjaVariables = new SymbolTable("global-jinja", null);
        this.cssVariables = new SymbolTable("css-vars", null);
        this.cssClasses = new SymbolTable("css-classes", null);
        this.cssIds = new SymbolTable("css-ids", null);
        this.htmlIds = new SymbolTable("html-ids", null);
    }

    public SymbolTable getJinjaVariables() {
        return jinjaVariables;
    }

    public SymbolTable getCssVariables() {
        return cssVariables;
    }

    public SymbolTable getCssClasses() {
        return cssClasses;
    }

    public SymbolTable getCssIds() {
        return cssIds;
    }

    public SymbolTable getHtmlIds() {
        return htmlIds;
    }
}