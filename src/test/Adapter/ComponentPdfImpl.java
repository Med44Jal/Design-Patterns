package test.Adapter;

public class ComponentPdfImpl extends ComponentPDF {
    private String content;

    @Override
    public void pdfContent(String content) {
        this.content = content;
    }

    @Override
    public void pdfShow() {
        System.out.println("Contenu Pdf => " + content);
    }
}
