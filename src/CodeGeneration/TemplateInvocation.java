package CodeGeneration;

public class TemplateInvocation {

    private String templateName;

    private GenerationContext context;

    public TemplateInvocation(
            String templateName,
            GenerationContext context) {

        this.templateName = templateName;
        this.context = context;
    }

    public String getTemplateName() {
        return templateName;
    }

    public GenerationContext getContext() {
        return context;
    }
}
