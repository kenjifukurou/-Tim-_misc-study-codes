package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox checkboxAgreement;
    @FXML
    private Label threadCheck;

    @FXML
    public void initialize() {
        System.out.println("initialized");
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClick(ActionEvent e) {
        if (e.getSource().equals(helloButton)) {
//            System.out.println(e.getSource());
            System.out.println("Hello! " + nameField.getText() + " !");
        } else if (e.getSource().equals(byeButton)) {
//            System.out.println(e.getSource());
            System.out.println("Bye! " + nameField.getText() + " !");
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println(s + " has put into sleep, task run later");
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("task has returned, updating Thread: " + s);
                            threadCheck.setText("task has returned");
                        }
                    });
                } catch (InterruptedException event) {
                    System.out.println("interrupted");
                }
            }
        };

        Thread bgThread = new Thread(task);
        bgThread.start();

//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException f) {
//            System.out.println("interrupted");
//        }

        if (checkboxAgreement.isSelected()) {
            System.out.println("clear field");
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean buttonToggle = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(buttonToggle);
        byeButton.setDisable(buttonToggle);
    }

    @FXML
    public void handleCheckBox() {
        System.out.println("The checkbox is: " + (checkboxAgreement.isSelected() ? " selected." : " not selected."));
    }

}
