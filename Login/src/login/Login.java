package login;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Login extends Application{
    @Override
    public void start(Stage primarystage){
        Pane pane = new Pane();
        pane.getChildren();
        
        Label label1 = new Label("Username:");
        Label label2 = new Label("Password:");
        TextField textField = new TextField ();
        textField.setPrefColumnCount(15);
        TextField textField1 = new TextField ();
        textField1.setPrefColumnCount(15);
        VBox vb = new VBox();
        vb.getChildren().addAll(label1,textField,label2,textField1);
        vb.setSpacing(3);
        
        
        Pane pane1 = new Pane();
        pane1.getChildren();
        
        Button A = new Button("Login");
        Button B = new Button("Cancel");
        Button C = new Button("Clear");
        HBox hb = new HBox();
        hb.setSpacing(15);
        hb.relocate(0, 100);
        hb.getChildren().addAll(A,B,C);
        pane1.getChildren().addAll(hb);
        
        pane.getChildren().addAll(vb,pane1);
        
        Scene scene = new Scene(pane);
        primarystage.setTitle("LOGIN-PAGE");
        primarystage.setScene(scene);
        primarystage.show();
    }
    public static void main(String [] args){
    Application.launch(args);
    }
}