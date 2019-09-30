package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
 

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Lab2");
			Rectangle rec = new Rectangle();
			rec.setFill(javafx.scene.paint.Color.GREEN);
			rec.setStroke(javafx.scene.paint.Color.GREEN);
			rec.setHeight(50);
			rec.setWidth(50);
			
			Circle cir = new Circle();  

		    cir.setCenterX(50); 
		    cir.setRadius(50);
		    Polygon hex = new Polygon();  //Create a hexagon
		    hex.getPoints().addAll(new Double[]{
		    	100.0, 25.0, 
		    	200.0, 25.0, 
		    	225.0, 75.0,          
		    	200.0, 125.0, 
		    	100.0, 125.0,                   
		    	75.0, 75.0, 
		    });

		
		    Rectangle rec4 = new Rectangle();  
		    rec4.setWidth(50); 
		    rec4.setHeight(50); 
		    Rectangle rec5 = new Rectangle();  
		    
		    rec5.setWidth(50); 
		    rec5.setHeight(50); 
		       

		    
		    //Setup the gridpanes and positioning the shapes within them
			GridPane pane1= new GridPane();
			pane1.add(rec,1,1);
			pane1.setAlignment(Pos.CENTER);
			
			GridPane pane2= new GridPane();
			pane2.add(cir, 1, 1);
			pane2.setAlignment(Pos.CENTER);
			
			GridPane pane3= new GridPane();
			pane3.add(hex,1,1);
			pane3.setAlignment(Pos.CENTER);
			
			GridPane pane4= new GridPane();
			pane4.add(rec4,1,1);
			pane4.setAlignment(Pos.CENTER);
			
			GridPane pane5= new GridPane();
			pane5.add(rec5,1,1);
			pane5.setAlignment(Pos.CENTER);
			
			//Setting up the border pane and positioning the gridpanes within it.
			BorderPane root = new BorderPane();
			BorderPane.setAlignment(pane1,Pos.CENTER);
			BorderPane.setMargin(pane1, new Insets(12,12,12,12));
			root.setBottom(pane1);
			BorderPane.setAlignment(pane2,Pos.CENTER);
			BorderPane.setMargin(pane2, new Insets(12,12,12,12));
			root.setCenter(pane2);
			BorderPane.setAlignment(pane3,Pos.CENTER);
			BorderPane.setMargin(pane3, new Insets(12,12,12,12));
			root.setTop(pane3);
			BorderPane.setAlignment(pane4,Pos.CENTER);
			BorderPane.setMargin(pane4, new Insets(12,12,12,12));
			root.setLeft(pane4);
			BorderPane.setAlignment(pane5,Pos.CENTER);
			BorderPane.setMargin(pane5, new Insets(12,12,12,12));
			root.setRight(pane5);
			
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
