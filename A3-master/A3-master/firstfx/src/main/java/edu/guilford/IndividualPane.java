package edu.guilford;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

// IndividualPane is a class that extends one of the Pane classes
public class IndividualPane extends GridPane {
    // could have GridPane, TilePane, FlowPane, StackPane, Pane, BorderPane, etc.
    // these organize the componets we want to display in diferent ways

    // three string attributes
    // private String name;
    // private String email;
    // private String phone;

    // 7 textfield attributes
    private TextField nameField;
    private TextField emailField;
    private TextField phoneField;
    private TextField passwordField;
    private TextField securityQuestionField;
    private TextField addressField;
    private TextField avatarField;

    // add a submit button attribute
    private Button submitButton;

    // add a rotate button attribute
    private Button rotateButton;

    // label attributes
    // not all are working however i felt the need to leave them in as a reference
    private Label nameLabel;
    private Label emailLabel;
    private Label phoneLabel;
    private Label passwordLabel;
    private Label securityQuestionLabel;
    private Label addressLabel;
    private Label avatarLabel;

    // change to whatever we want it to be and then we can change the image name
    private ImageView avatarView;

    // declare a Silder attribute to manipulate the background color
    private Slider redSlider;

    // constructor
    public IndividualPane(Individual individual) {

        // Instantiate textfield attributes
        nameField = new TextField();
        emailField = new TextField();
        phoneField = new TextField();
        passwordField = new TextField();
        securityQuestionField = new TextField();
        addressField = new TextField();
        avatarField = new TextField();

        // set the name attribute "sussy baka"
        nameField.setText("`sussy baka`");
        // set the email attribute to "SBaka@amongus.com"
        emailField.setText("SBaka@amongus.com");
        // set the phone attribute to "555-555-5555"
        phoneField.setText("555-555-5555");
        // set the password attribute to "password"
        passwordField.setText("password");
        // set the security question attribute to "What is your favorite color?"
        securityQuestionField.setText("favorite color?");
        // set the address attribute to "5800 W Friendly Ave, Greensboro, NC 27410"
        addressField.setText("5800 W Friendly Ave, Greensboro, NC 27410");
        // set the avatar attribute to "avatar name?"
        avatarField.setText("avatar name?");

        // Instantiate the submit button
        submitButton = new Button("Submit");

        // instantiate the rotate button
        rotateButton = new Button("Rotate");

        // instantiate the redSlider
        redSlider = new Slider(0, 255, 0);

        // get the file that contains the image
        File avatar = new File(this.getClass().getResource("sus.png").getPath());
        System.out.println(avatar.toURI().toString());

        // URI stans for uniform resource identifier and its similar to URL (uniform
        // resource locator)
        avatarView = new ImageView(avatar.toURI().toString());

        // Instantiate label attributes
        nameLabel = new Label("Name: " + individual.getName());
        emailLabel = new Label("Email: " + individual.getEmail());
        phoneLabel = new Label("Phone: " + individual.getPhone());
        passwordLabel = new Label("Password: " + individual.getPassword());
        securityQuestionLabel = new Label("Security Q: " + individual.getSecurityQuestion());
        addressLabel = new Label("Address: " + individual.getAddress());
        avatarLabel = new Label("Avatar: " + individual.getAvatar());

        // add a label to the pane
        this.add(new Label("Name: " + individual.getName()), 0, 0);
        // add a label to the pane
        this.add(new Label("Email: " + individual.getEmail()), 0, 1);
        // add a label to the pane
        this.add(new Label("Phone: " + individual.getPhone()), 0, 2);
        // add a label to the pane
        this.add(new Label("Password: " + individual.getPassword()), 0, 3);
        // add a label to the pane
        this.add(new Label("Security Q: " + individual.getSecurityQuestion()), 0, 4);
        // add a label to the pane
        this.add(new Label("Address: " + individual.getAddress()), 0, 5);
        // add a label to the pane
        this.add(new Label("Avatar: " + individual.getAvatar()), 0, 6);

        // add a nameField to the pane next to the name label
        this.add(nameField, 1, 0);
        // add a emailField to the pane next to the email label
        this.add(emailField, 1, 1);
        // add a phoneField to the pane next to the phone label
        this.add(phoneField, 1, 2);
        // add a passwordField to the pane next to the password label
        this.add(passwordField, 1, 3);
        // add a securityQuestionField to the pane next to the securityQuestion label
        this.add(securityQuestionField, 1, 4);
        // add a addressField to the pane next to the address label
        this.add(addressField, 1, 5);
        // add a avatarField to the pane next to the avatar label
        this.add(avatarField, 1, 6);
        // add a submitButton to the pane
        this.add(submitButton, 2, 3);
        // add a rotateButton to the pane
        this.add(rotateButton, 3, 3);
        // add a redSlider to the pane
        this.add(redSlider, 2, 4);

        // add the ImageView to the pane to the right of the textfields
        this.add(avatarView, 2, 0, 1, 3);

        // We can change the image to be of a different size
        avatarView.setFitHeight(100);
        // and perserve te aspect ratio (the ratio of the width to the height)
        avatarView.setPreserveRatio(true);
        // rotate it by 45 degrees
        avatarView.setRotate(0);

        // give the pane a border
        this.setStyle("-fx-border-color: black;");
        // make the border thicker
        this.setStyle("-fx-border-width: 2px;");
        // and a background color
        this.setStyle("-fx-background-color: lightgray;");

        // add a listener for the button that changes the labels
        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // set the name label to the nameField text
                nameLabel.setText("Name: " + nameField.getText());
                // set the email label to the emailField text
                emailLabel.setText("Email: " + emailField.getText());
                // set the phone label to the phoneField text
                phoneLabel.setText("Phone: " + phoneField.getText());
                // update the individual attribute with the new data
                individual.setName(nameField.getText());
                individual.setEmail(emailField.getText());
                individual.setPhone(phoneField.getText());
                individual.setPassword(passwordField.getText());
            }
        });

        // add a click event handler to the rotate button that rotates the image 45
        // degrees
        rotateButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                // rotate the image 45 degrees
                avatarView.setRotate(avatarView.getRotate() + 45);
            }
        });

        // Write an event listener and connect it to the component that triggers the
        // event
        // rotate the image by 180 degrees when the mouse is clicked on it
        avatarView.setOnMouseClicked(new EventHandler<javafx.scene.input.MouseEvent>() {
            public void handle(javafx.scene.input.MouseEvent event) {
                // rotate the image 90 degrees
                avatarView.setRotate(avatarView.getRotate() + 90);
            }
        });

        // create a listener for the redSlider
        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
            // set the red value of the background color to the value of the slider
            this.setStyle("-fx-background-color: rgb(" + newValue.intValue() + ", 0, 0);");
        });

    }
}
