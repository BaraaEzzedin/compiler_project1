package SymbolTable.JijnaCss;

public enum SymbolType{
    JINJA_VARIABLE,      // Jinja variables: {{ name }}
    JINJA_LOOP_VAR,      // Loop variables: {% for item in items %}
    CSS_VARIABLE,        // CSS custom properties: --primary
    CSS_CLASS,           // CSS classes: .container
    CSS_ID,              // CSS IDs: #header
    HTML_ID              // HTML element IDs
}
