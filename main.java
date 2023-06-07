import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class main extends Application {

    float num, currentNum, result=0;
    Button button;

    public static void main(String[] args) {
        
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        //stage
        primaryStage.setTitle("CalculatorFX 100MS");

        //button
        button = new Button();
        button.setText("1");
        button.setOnAction(e->
        {
            int num =1;
            System.out.println(num);
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    // public void handle(ActionEvent event)
    // {
    //     if(event.getSource()== button)
    //     {
    //         System.out.println("oooo you touch me...");
    //     }
    // }
}
