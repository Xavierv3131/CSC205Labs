package LAB05;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *This class creates a GUI for the program to run on 
 * @author Ryan Valensa 
 * @version 2-28-2019
 *
 */

public class ShapesGUI extends Application {	
    
    private GridPane pane; //creates the grid pane to put everything on
    private Scene scene;//creates the scene
    
    private Label length;//label for the length TF
    private Label width;//label for the width TF
    private Label height;//label for the height TF
    private Label radius;//label for the raduis TF
    private Label area;//label for the area TF
    private Label perimeter;//label for the perimeter TF
    private Label volume;// label for the volume TF
    
    private TextField lengthTF; //text field to enter the legth
    private TextField widthTF;//text field to enter the width
    private TextField heightTF;//text field to enter the height
    private TextField radiusTF;//text field to enter the radius
    private TextField areaTF;//text field to display the area
    private TextField perimeterTF;// text field to display the perimeter
    private TextField volumeTF;// text area to display the volume
 
    private Button rectangleButton;//rectangle button 
    private Button circleButton;// circle button\
    private Button cuboidButton;//cuboid button
    private Button sphereButton;//sphere button
    private Button exitButton; //exit button
    
    
    //--------------------------------------------------------------------------------
    /**
     * Method that creates all the components and adds them to the grid pane
     */
    public void createGUIComponents() {
    	
        pane = new GridPane();
        
        length = new Label ("Length");
        width = new Label ("Width");
        height = new Label ("Height");
        radius = new Label ("Radius");
        area = new Label ("Area");
        perimeter = new Label ("Perimeter");
        volume = new Label ("Volume");
        
        
        
        lengthTF = new TextField();
        heightTF = new TextField();
        widthTF = new TextField();
        radiusTF = new TextField();
        areaTF = new TextField();
        perimeterTF = new TextField();
        volumeTF = new TextField();
        
        rectangleButton = new Button ("Rectangle");
        circleButton = new Button ("Circle");
        cuboidButton = new Button ("Cuboid");
        sphereButton = new Button ("Sphere");
        
        
        pane.add(length, 0, 0);
        pane.add(width, 1, 0);
        pane.add(height, 2, 0);
        pane.add(radius, 3, 0);
        pane.add(lengthTF, 0, 1);
        pane.add(widthTF, 1, 1);
        pane.add(heightTF, 2, 1);
        pane.add(radiusTF, 3, 1);
        pane.add(rectangleButton, 0, 2);
        pane.add(circleButton, 1, 2);
        pane.add(cuboidButton, 2, 2);
        pane.add(sphereButton, 3, 2);
        pane.add(area, 0, 3);
        pane.add(perimeter, 1, 3);
        pane.add(volume, 2, 3);
        pane.add(areaTF, 0, 4);
        pane.add(perimeterTF, 1, 4);
        pane.add(volumeTF, 2, 4);
        pane.add(exitButton, 0, 5);
        
        areaTF.setEditable(false);
        perimeterTF.setEditable(false);
        volumeTF.setEditable(false);
    	
    }
    
  //--------------------------------------------------------------------------------
    /**
     * attachHandlers method to tell the program what to do when the button 
     * is pressed
     */
    public void attachHandlers() {
	    
    	rectangleButton.setOnAction(new EventHandler<ActionEvent>() { 

            public void handle(ActionEvent e) { 
            	double length = Integer.parseInt(lengthTF.getText());
            	double width = Integer.parseInt(widthTF.getText());
            
            	Rectangle rect = new Rectangle(length, width);
            	String stringA = rect.area() + " ";
            	String stringP = rect.perimeter() + " ";
            	String stringV = rect.volume() + " ";
            	
            	areaTF.setText(stringA);
            	perimeterTF.setText(stringP);
            	volumeTF.setText(stringV);
            	
            	
            }
        }
    	);
    	
    	//----------------------------------------------------------
    	circleButton.setOnAction(new EventHandler<ActionEvent>() { 

            public void handle(ActionEvent e) { 
            	double radius = Integer.parseInt(radiusTF.getText());
            	
            
            	Circle c = new Circle(radius);
            	String stringA = c.area() + " ";
            	String stringP = c.perimeter() + " ";
            	String stringV = c.volume() + " ";
            	
            	areaTF.setText(stringA);
            	perimeterTF.setText(stringP);
            	volumeTF.setText(stringV);
            	
            }
        }
    	);
    	
    	//----------------------------------------------------------
    	cuboidButton.setOnAction(new EventHandler<ActionEvent>() { 

            public void handle(ActionEvent e) { 
            	
            	double length = Integer.parseInt(lengthTF.getText());
            	double width = Integer.parseInt(widthTF.getText());
            	double height = Integer.parseInt(heightTF.getText());
            	
            	
                
            	Cuboid c = new Cuboid(length, width, height);
            	String stringA = c.area() + " ";
            	String stringP = c.perimeter() + " ";
            	String stringV = c.volume() + " ";
            	
            	areaTF.setText(stringA);
            	perimeterTF.setText(stringP);
            	volumeTF.setText(stringV);
            	
            }
        }
    	);
    	
    	//----------------------------------------------------------
    	sphereButton.setOnAction(new EventHandler<ActionEvent>() { 

            public void handle(ActionEvent e) { 
            	
            	double radius = Integer.parseInt(radiusTF.getText());
            	
                
            	Sphere s = new Sphere(radius);
            	String stringA = s.area() + " ";
            	String stringP = s.perimeter() + " ";
            	String stringV = s.volume() + " ";
            	
            	areaTF.setText(stringA);
            	perimeterTF.setText(stringP);
            	volumeTF.setText(stringV);
            	
            }
        }
    	);
    	
    	
    	
    }
    
    //----------------------------------------------------------
    public void start(Stage primaryStage) {

    	createGUIComponents();
	    attachHandlers();
		
	    //Create a scene and place it on stage
	    scene = new Scene(pane);
	    primaryStage.setTitle("House Finder");
	    primaryStage.setScene(scene);
	    primaryStage.show();
	    exitButton.setOnAction(e -> Platform.exit());
    }
    
    //----------------------------------------------------------
    public static void main(String[] args) {
		
    	Application.launch(args);
    }
}
