package ex3;

import javax.swing.*;

import java.awt.event.*;

public class App extends JFrame {
    private IDocument document;

    public App(ICreateDocument documentFactory) {
        // Создание окна
        setTitle("Editor");
        setSize(500, 500);

        // Создание неизменяемого поля для вывода текста
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);

        // Создание drop-меню
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Добавление обработчиков событий для пунктов меню
        newMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                document = documentFactory.createNew();
                textArea.setText(document.getContent());
            }
        });

        openMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                document = documentFactory.createOpen();
                textArea.setText(document.getContent());
            }
        });

        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });

        // Настройка окна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}

