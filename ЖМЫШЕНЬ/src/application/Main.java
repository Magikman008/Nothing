package application;
	
import javafx.application.Application;                                                                                           
import javafx.collections.FXCollections;                                                                                         
import javafx.collections.ObservableList;                                                                                        
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;             
import javafx.scene.chart.PieChart;
import javafx.scene.layout.Pane;                                                                                               
                                                                                                                                 
                                                                                                                                 
public class Main extends Application {                                                                                          
	@Override                                                                                                                    
	public void start(Stage primaryStage) {                                                                                      
		try {           
		    Pane root = new Pane();
		    ObservableList<PieChart.Data> valueList = FXCollections.observableArrayList(
		    		new PieChart.Data("China", 1275),
		            new PieChart.Data("India", 1017),
		            new PieChart.Data("Brazil", 172),
		            new PieChart.Data("UK", 59),
		            new PieChart.Data("USA", 285));
		    PieChart pieChart = new PieChart(valueList);
		    pieChart.setTitle("Nothing");
		    root.getChildren().addAll(pieChart);

		    primaryStage.setResizable(false);
		    Scene scene = new Scene(root, 450, 450);
		    primaryStage.setTitle("Паровозик");
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
