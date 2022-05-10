package login;

import javafx.application.Application;
import javafx.geometry.Pos;
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
        
        HBox hb = new HBox();
        Label label1 = new Label("Username:");
        TextField textField1 = new TextField ();
        textField1.setPrefColumnCount(15);
        hb.getChildren().addAll(label1,textField1);
        
        HBox hb1 = new HBox();
        Label label2 = new Label("Password:");
        TextField textField2 = new TextField ();
        textField2.setPrefColumnCount(15);
        hb1.getChildren().addAll(label2,textField2);
        
        HBox hb2 = new HBox();
        Button A = new Button("Login");
        Button B = new Button("Cancel");
        Button C = new Button("Clear");
        hb2.getChildren().addAll(A,B,C);
        hb2.setSpacing(15);
        hb2.setAlignment(Pos.CENTER);
        
        VBox vb = new VBox();
        vb.getChildren().addAll(hb,hb1,hb2);
        
        pane.getChildren().addAll(vb);
        
        Scene scene = new Scene(pane);
        primarystage.setTitle("LOGIN-PAGE");
        primarystage.setScene(scene);
        primarystage.show();
    }
    public static void main(String [] args){
    Application.launch(args);
    }
}
