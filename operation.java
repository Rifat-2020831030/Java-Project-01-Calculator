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

    double number,currentNum, result=0;
    Button button;
    String num =new String("100");
    String s = new String("");

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
            s = "1";
            System.out.println(num);
        });
        //button 2
        Button button2 = new Button("2");
        GridPane.setConstraints(button2, 10,110);
        button1.setOnAction(e->
        {
            s= "2";
            scrn.setText("2");
            System.out.println(num);
        });
        //button 1
        Button button3 = new Button("3");
        GridPane.setConstraints(button3, 10,130);
        button1.setOnAction(e->
        {
            s = "3";
            scrn.setText("3");
            System.out.println(num);
        });
        //button 1
        Button button4 = new Button("4");
        GridPane.setConstraints(button1, 10,140);
        button1.setOnAction(e->
        {
            s= "4";
            System.out.println(num);
        });

        try{
            num = num+s;
        number = Double.parseDouble(num);
        num = "";
        }
        catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
        

        System.out.println(number);

        grid.getChildren().addAll(scrn, button1, button2, button3, button4);
        Scene scene = new Scene(grid, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
