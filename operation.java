import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class operation extends Application {

    float num, currentNum, result=0;
    Button button;

    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //stage
        primaryStage.setTitle("CalculatorFX 100MS");

        GridPane grid = new GridPane();

        //input field
        TextField scrn = new TextField("0");
        scrn.setPrefSize(300, 90);
        GridPane.setConstraints(scrn, 100, 100);
     
        //button 1
        Button button1 = new Button("1");
        GridPane.setConstraints(button1, 10,101);
        button1.setOnAction(e->
        {
            num = 1;
            System.out.println(num);
        });

        grid.getChildren().addAll(scrn, button1);
        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
