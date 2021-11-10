package test.Adapter;

public class DocumentPDF extends Document {
    private ComponentPDF componentPDF = new ComponentPdfImpl();

    @Override
    public void setContent(String content) {
        componentPDF.pdfContent(content);
    }

    @Override
    public void show() {
        componentPDF.pdfShow();
    }
}
