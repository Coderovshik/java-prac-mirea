package ex3;

public class CreateTextDocument implements ICreateDocument {
    private int nextId = 1;

    @Override
    public IDocument createNew() {
        return new TextDocument("text_document.txt");
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument("text_document.txt");
    }
}
