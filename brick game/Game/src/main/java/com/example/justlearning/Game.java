package com.example.justlearning;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.InputStream.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.sound.sampled.*;

class bricks{
    public ArrayList bricks(Group root){ // return type function with type arraylist. one parameter root is present.
        Rectangle rectangle;
        ArrayList<Rectangle>bricks = new ArrayList<Rectangle>();
        for(int i = 1; i<8; i++){
            for(int j = 1; j<10; j++){
                rectangle = new Rectangle(50,5);
                rectangle.setFill(Color.GREEN);
                rectangle.setLayoutX(65*i);
                rectangle.setLayoutY((j*20)+20);
                root.getChildren().add(rectangle); // we add each rectangle in root.
                bricks.add(rectangle); // each rectangle in arraylist.
            }
        }

        return bricks;
    }
}

class paddle1{
    public void paddleMovement(Rectangle paddle,Scene scene,Circle ball){ // void type function with parameter includes rectangle,circle type shapes and scene is also present.
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {  // when key is pressed scene start working.
            @Override
            public void handle(KeyEvent keyEvent) {
                switch (keyEvent.getCode()){ // check which key is pressed. switch condition is used.
                    case LEFT:                          // for left case.

                        paddle.setLayoutX(paddle.getLayoutX()-20);
                        if(paddle.getLayoutX()<=5) {
                            paddle.setLayoutX(5);
                        }
                        break;
                    case RIGHT:                         // right case.

                        paddle.setLayoutX(paddle.getLayoutX()+20);
                        if(paddle.getLayoutX()>=430){
                            paddle.setLayoutX(430);
                        }
                        break;
                    case UP:                            // for upward case.

                        paddle.setLayoutY(paddle.getLayoutY()-20);
                        if(paddle.getLayoutY()<=5){
                            paddle.setLayoutY(5);
                        }
                        break;
                    case DOWN:                          // downward case.

                        paddle.setLayoutY(paddle.getLayoutY()+20);
                        if(paddle.getLayoutY()>=550){
                            paddle.setLayoutY(550);
                        }
                        break;

                }
            }
        });
    }
}

class bricksAndRectangleCollision{
    public Boolean intersection(Circle circle,Rectangle rectangle){ // return type boolean.it contanis parameters circle and rectangle shape.
        Shape collisionArea = Shape.intersect(circle, rectangle); // when ball collides with brick then some kind of shape is made.
        return collisionArea.getBoundsInLocal().getHeight() != -1; //
    }
}

class Ball{
   Timeline timeline; // timeline class. it is actually inbuilt class.
    static int score = 0; // static variable.
    static int lives = 2;
    void movement(Circle ball,Rectangle paddle,Group root,Stage stage,ArrayList<Rectangle>bricks,int keyFrame){ // void function with no return type with parameters include circle, rectangle type shape, one root, one stage is also present, arraylist, and int type variable.
        audio music = new audio(); // thread object is made.
        music.start(); // thread started.
        // score.
        Text text4 = new Text("Score :  "+String.valueOf(score));
        text4.relocate(15,10);
        text4.setFill(Color.WHITE);
        text4.setFont(Font.font("Times New Roman",15));
        root.getChildren().add(text4);
        // lives.
        Text text5 = new Text("Lives : "+String.valueOf(lives));
        text5.relocate(450,10);
        text5.setFill(Color.WHITE);
        text5.setFont(Font.font("Times New Roman",15));
        root.getChildren().add(text5);
        Timeline t = new Timeline(new KeyFrame(Duration.millis(keyFrame), new EventHandler<ActionEvent>() { // timeline class with object t. it includes key frame and eventhandler. it will detect action event.

            int horizantalMovement = 2,verticalMovement = 1; // two variables are made which will add to ball movement.
            @Override
            public void handle(ActionEvent actionEvent) { // handle function which is inbuilt. it includes action event.
                // when paddle starts movement then ball also moves.
                boolean move = paddle.getLayoutX()<250 || paddle.getLayoutX()>250;
                boolean move1 = paddle.getLayoutY()<500 || paddle.getLayoutY()>500;
                if(move || move1) {
                    ball.setLayoutX(ball.getLayoutX() + horizantalMovement); // setting ball movement.
                    ball.setLayoutY(ball.getLayoutY() + verticalMovement); // // setting ball movement.
                }
                // conditions for ball hiting walls.
                    boolean topSide = ball.getLayoutY() <= 5;
                    boolean bottomSide = ball.getLayoutY() >= 580;
                    boolean rightSide = ball.getLayoutX() >= 530;
                    boolean leftSide = ball.getLayoutX() <= 5;
                    if (topSide) {
                        verticalMovement *= -1;
                        ball.setLayoutY(ball.getLayoutY() + verticalMovement);
                    } else if (rightSide || leftSide) {
                        horizantalMovement *= -1;
                        ball.setLayoutX(ball.getLayoutX() + horizantalMovement);
                    }
                    bricksAndRectangleCollision collision = new bricksAndRectangleCollision(); // brick collision class object is made.
                    if (collision.intersection(ball, paddle)) {  // through this we will check collision.
                        verticalMovement *= -1; // if occurs then revers its movement Y .
                    }


                    Rectangle r = null; // temporary rectangle shape is built.
                    for (Rectangle brick : bricks) { // for each loop is made each brick rectangle will stored in brick.
                        if (collision.intersection(ball, brick)) { // collision detection.
                            verticalMovement *= -1;
                            System.out.println("collide");
                            // coditions when ball collides with brick then colors changes.
                            if (brick.getFill().equals(Color.GREEN)) {
                                brick.setFill(Color.YELLOW);
                                score += 40;
                                text4.setText("Score : "+score);
                            } else if (brick.getFill().equals(Color.YELLOW)) {
                                brick.setFill(Color.RED);
                                score += 60;
                                text4.setText("Score : "+score);
                            } else if (brick.getFill().equals(Color.RED)) {
                                score += 100;
                                r = brick; // the brick which is collide with ball will store in temporary rectangle.
                                root.getChildren().remove(brick); // it will be remove from root.
                            }
                        }
                    }
                    if(bricks.isEmpty()){
                        Text brickchecking = new Text("You Won");
                        brickchecking.setFill(Color.WHITE);
                        brickchecking.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.REGULAR,20));
                        brickchecking.relocate(100,250);
                        root.getChildren().add(brickchecking);

                    }
                    bricks.remove(r); // remove from arraylist.
                // condition for bottom wall.
                    if (bottomSide) {
                        lives--;
                        text5.setText("Lives : "+lives);
                        if(lives<=0){ // there are two lives. when lives equal to zero then this condition will execute.
                            lives = 0;
                            music.end(); // audio will end.
                            timeline.stop(); // timeline wills stop.
                            System.out.println("GameOVER"); // game over will be show on console.
                            Text text = new Text("Game Over @@@"); // text box will come in front of screen.
                            text.setLayoutY(250);
                            text.setFill(Color.WHITE);
                            text.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.REGULAR,30));
                            TranslateTransition translate = new TranslateTransition(Duration.millis(500)); // translate transition is made with duration of millis.
                            translate.setCycleCount(1); // only one cyle.
                            translate.setToX(150);
                            translate.setNode(text); // setting the node.
                            translate.play(); // play transition.

                            Button exit = new Button("Exit"); // exit button is made.
                            //exit.relocate(250, 350);
                            exit.setLayoutY(350);
                            TranslateTransition translate2 = new TranslateTransition(Duration.millis(500)); // translate transition for exit button.
                            translate2.setCycleCount(1);
                            translate2.setToX(250);
                            translate2.setDelay(Duration.millis(100)); // transition starts after the delay of 100 millis.
                            translate2.setNode(exit);
                            translate2.play();
                            Text text1 = new Text("Score : " + String.valueOf(score));
                            //text1.relocate(210, 300);
                            text1.setFill(Color.WHITE);
                            text1.setLayoutY(300);
                            text1.setFont(Font.font("Times New Roman", 30));
                            TranslateTransition translate1 = new TranslateTransition(Duration.millis(500)); // tranlsate transition for text box score.
                            translate1.setCycleCount(1);
                            translate1.setDelay(Duration.millis(50)); // transition starts after delay of 50 millis.
                            translate1.setToX(210);
                            translate1.setNode(text1);
                            translate1.play();
                            root.getChildren().addAll(text1,text);
                            exit.setOnMouseClicked(e -> { // when exit button is set on event.
                                        stage.close(); // stage will closes.
                                    }
                            );
                            root.getChildren().add(exit); // adding button into root.
                        }
                        System.out.println(lives); // when ball moves down of bottom wall the lives will observe in console.
                        ball.relocate(250,300); // again set the ball.
                        paddle.relocate(250,500); // again set the paddle.

                    }

            }}));


        timeline = t; // temporary timeline is made where t is stored.
        t.setCycleCount(timeline.INDEFINITE); // infinite.
        t.play(); // play timeline.
    }
}

class audio extends Thread{ // thread is made.
    Clip clip;
    public void end(){ // function made to stop the audio.
        clip.stop();
    }
    public void run(){ // run function of thread.
        Scanner scanner = new Scanner(System.in);
        try {
            File file = new File("src/main/resources/com/example/justlearning/arabicSong.wav"); // file name.
            AudioInputStream audio = AudioSystem.getAudioInputStream(file); // add into audio stream.
            clip = AudioSystem.getClip(); // add audio stream ot clip.
            clip.open(audio);
            clip.setFramePosition(0);
            clip.start();
            String response = scanner.next();
        }catch (Exception e){

        }
    }
}

public class Game extends Application { // extends application class.

    public void start(Stage stage) throws Exception{ // function with declaration of parent class exception.
        Group root = new Group();
        Group root1 = new Group();
        bricks b = new bricks();
        Image icon = new Image("file:src/main/resources/com/example/justlearning/brick-icon.png"); // icon path.
        stage.getIcons().add(icon); // icon added to stage.
        Button start = new Button("Start");
        Button groupMembers = new Button("Group Members");
        Button about = new Button("About");
        Button help = new Button("Help");
        start.relocate(50*5,50*6);
        groupMembers.relocate(50*5-35,50*7);
        about.relocate(50*5-3,50*8);
        help.relocate(50*5,50*9);
        Text text = new Text("Atari Game");
        Text text1 = new Text("ddkhan Gaming Society");
        text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,50)); // fontfaimly, weight, posture, size.
        text.setFill(Color.WHITE);
        text.relocate(150,100);
        text1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR,20));
        text1.setFill(Color.WHITE);
        text1.relocate(165,170);
        text1.setUnderline(true); // underline the text.
        root1.getChildren().addAll(text,text1,start,groupMembers,about,help); // add all these to root.

        // start button is pressed.


        start.setOnMouseClicked(e->{ // when start button is set on event.
            root1.getChildren().remove(text);
            root1.getChildren().remove(text1);
            root1.getChildren().remove(start);             // remove all the buttons from the root.
            root1.getChildren().remove(groupMembers);
            root1.getChildren().remove(about);
            root1.getChildren().remove(help);
            // buttons are made. for easy, medium and hard level.
            Button easy = new Button("Easy level");
            Button medium = new Button("Medium level");
            Button hard = new Button("Hard level");
            // setting their position.
            easy.relocate(50*5,40*6);
            medium.relocate(50*5-10,45*7);
            hard.relocate(50*5,50*8-10);
            Text text2 = new Text("DIFFICULTY LEVEL");
            text2.setUnderline(true);
            text2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC,30));
            text2.setFill(Color.WHITE);
            text2.relocate(130,100);
            Group root3 = new Group(); // new root.
            root3.getChildren().addAll(text2,easy,medium,hard); // new root is made where we have add all these.
            easy.setOnMouseClicked(low->{
                root3.getChildren().remove(easy);
                root3.getChildren().remove(medium);
                root3.getChildren().remove(hard);
                ArrayList<Rectangle> returnBrick = b.bricks(root);
                Circle ball = new Circle(3);
                ball.relocate(250,300);
                ball.setFill(Color.PINK);
                Rectangle paddle = new Rectangle(80,10);
                paddle.relocate(250,500);
                paddle.setFill(Color.RED);
                root.getChildren().addAll(ball,paddle);
                Scene scene = new Scene(root,Color.BLACK);
                // paddle movement.
                paddle1 p = new paddle1();
                p.paddleMovement(paddle,scene,ball);
                // ball movement.
                int keyFrame = 15;
                Ball ballMovement = new Ball();
                ballMovement.movement(ball,paddle,root,stage,returnBrick,keyFrame); // all these are passed as arguments to ball class containing the function movement with void return type.
                stage.setScene(scene);
            });
            // when medium button sets on action.
            medium.setOnMouseClicked(m->{
                // buttons are remove.
                root3.getChildren().remove(easy);
                root3.getChildren().remove(medium);
                root3.getChildren().remove(hard);
                ArrayList<Rectangle> returnBrick = b.bricks(root); // array list with name returnbrick. it is rectangle shape and the arrays list will come from the class brick.
                Circle ball = new Circle(3);
                ball.relocate(250,300);
                ball.setFill(Color.PINK);
                Rectangle paddle = new Rectangle(80,10);
                paddle.relocate(250,500);
                paddle.setFill(Color.RED);
                root.getChildren().addAll(ball,paddle);
                Scene scene = new Scene(root,Color.BLACK);
                // paddle movement.
                paddle1 p = new paddle1();
                p.paddleMovement(paddle,scene,ball);
                // ball movement.
                int keyFrame = 13;
                Ball ballMovement = new Ball();
                ballMovement.movement(ball,paddle,root,stage,returnBrick,keyFrame);
                stage.setScene(scene);
            });
            // when hard button is pressed.
            hard.setOnMouseClicked(h->{
                root3.getChildren().remove(easy);
                root3.getChildren().remove(medium);
                root3.getChildren().remove(hard);
                ArrayList<Rectangle> returnBrick = b.bricks(root);
                Circle ball = new Circle(3);
                ball.relocate(250,300);
                ball.setFill(Color.PINK);
                Rectangle paddle = new Rectangle(80,10);
                paddle.relocate(250,500);
                paddle.setFill(Color.RED);
                root.getChildren().addAll(ball,paddle);
                Scene scene = new Scene(root,Color.BLACK);
                // paddle movement.
                paddle1 p = new paddle1();
                p.paddleMovement(paddle,scene,ball);
                // ball movement.
                int keyFrame = 10;
                Ball ballMovement = new Ball();
                ballMovement.movement(ball,paddle,root,stage,returnBrick,keyFrame);
                stage.setScene(scene);
            });
            Scene scene1 = new Scene(root3,Color.BLACK);
            stage.setScene(scene1);

        });
        // mute button is pressed.
        groupMembers.setOnMouseClicked(e->{
            Text groupDescription = new Text("GROUP MEMBERS");
            groupDescription.setUnderline(true);
            Text bangash = new Text("Ali NAWAB KHAN(20-SE-51)");
            Text billu = new Text("Muhammad Bilal(20-SE-51)");
            Text ahmad = new Text("Ali Ahmad(20-SE-51)");
            Text hamza = new Text("Muhammad Hamza(20-SE-51)");
            Text moiz = new Text("Moiz-ul-Islam(20-SE-51)");
            groupDescription.relocate(50,50);
            bangash.relocate(100,200);
            billu.relocate(100,50*5);
            ahmad.relocate(100,50*6);
            hamza.relocate(100,50*7);
            moiz.relocate(100,50*8);
            groupDescription.setFill(Color.WHITE);
            bangash.setFill(Color.WHITE);
            billu.setFill(Color.WHITE);
            ahmad.setFill(Color.WHITE);
            hamza.setFill(Color.WHITE);
            moiz.setFill(Color.WHITE);
            groupDescription.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.REGULAR,50));
            bangash.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.REGULAR,20));
            billu.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.REGULAR,20));
            ahmad.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.REGULAR,20));
            hamza.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.REGULAR,20));
            moiz.setFont(Font.font("Times new Roman",FontWeight.BOLD,FontPosture.REGULAR,20));
            Group root4 = new Group();
            root4.getChildren().addAll(groupDescription,bangash,billu,ahmad,hamza,moiz);
            Scene scene = new Scene(root4,Color.BLACK);
            stage.setScene(scene);

        });

        // about button is pressed.

        about.setOnMouseClicked(e->{
            root1.getChildren().remove(text);
            root1.getChildren().remove(text1);
            root1.getChildren().remove(start);
            root1.getChildren().remove(groupMembers);
            root1.getChildren().remove(about);
            root1.getChildren().remove(help);
            Text aboutText = new Text("A"+" B"+" O"+" U"+" T");

            aboutText.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,50));
            aboutText.setFill(Color.WHITE);
            aboutText.relocate(50*3,70);
            aboutText.setUnderline(true);
            Text t = new Text("This game is made by ddkhan gaming society. This game has millions of download. It ");
            t.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
            t.setFill(Color.WHITE);
            Text t1 = new Text("can run both on Android,IOS and PC. This game is popular amongst the world " );
            t1.setFill(Color.WHITE);
            t1.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
            Text t2 = new Text("children. We are still working on their updates.");
            t2.setFill(Color.WHITE);
            t2.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
            VBox v = new VBox(5); // vbox is made.
            v.setPadding(new Insets(10,10,0,10)); // setting their padding.
            v.getChildren().addAll(t,t1,t2); // adding all the texts to v box.
            v.relocate(5,200); // setting v box position.
            Group root2 = new Group();
            root2.getChildren().addAll(aboutText,v);
            Scene scene1 = new Scene(root2,Color.BLACK);
            stage.setScene(scene1);
        });
        // when help button is pressed.
        help.setOnMouseClicked(e->{
            // remove all the buttons.
            root1.getChildren().remove(text);
            root1.getChildren().remove(text1);
            root1.getChildren().remove(start);
            root1.getChildren().remove(groupMembers);
            root1.getChildren().remove(about);
            root1.getChildren().remove(help);
            Text aboutText = new Text("H"+" E"+" L"+" P");

            aboutText.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,50));
            aboutText.setFill(Color.WHITE);
            aboutText.relocate(50*3+20,70);
            aboutText.setUnderline(true);
            Text t = new Text("This game is made by ddkhan gaming society. This game has millions of download.");
            t.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
            t.setFill(Color.WHITE);
            Text t1 = new Text("It can run both on Android,IOS and PC. This game is popular amongst the world " );
            t1.setFill(Color.WHITE);
            t1.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
            Text t2 = new Text("children. We are still working on their updates.");
            t2.setFill(Color.WHITE);
            t2.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
            Text t3 = new Text("You can also use gmail account to get help. Email : bangashpathan14@gmail.com");
            t3.setFill(Color.WHITE);
            t3.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,15));
            VBox v = new VBox(5);
            v.setPadding(new Insets(10,10,0,10));
            v.getChildren().addAll(t,t1,t2,t3);
            v.relocate(5,200);
            Group root2 = new Group();
            root2.getChildren().addAll(aboutText,v);
            Scene scene1 = new Scene(root2,Color.BLACK);
            stage.setScene(scene1);

        });

        Scene newScene = new Scene(root1,550,600,Color.BLACK);
        stage.setScene(newScene); // setting scene in stage.
        stage.setHeight(600); // setting stage height.
        stage.setWidth(550); // setting stage width.
        stage.setTitle("Atari game"); // setting stage title.
        stage.show(); // stage show.
    }
    public static void main(String[] args){
        launch(args);
    }
}
