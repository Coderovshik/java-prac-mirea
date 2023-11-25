package ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TextDocument implements IDocument {
    private File doc;

    TextDocument(String path) {
        this.doc = new File(path);
        try {
            if (this.doc.createNewFile()) {
                System.out.println("File created: " + this.doc.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch(IOException e) {
            System.err.println(e);
        }
    }

    @Override
    public String getName() {
        return doc.getName();
    }

    @Override
    public String getContent() {
        String content = "";

        try {
            Scanner r = new Scanner(this.doc);
            while (r.hasNextLine()) {
                content += r.nextLine() + '\n';
            }
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }

        return content;
    }
}
