void setup(){
 size(600, 600); 
}
void draw(){
   background(300, 300, 300);
    noStroke();
    fill(#E5CE19);
    ellipse(300, 300, 300, 300);
    PImage cheese = loadImage("cheese.png");
    cheese.resize(250, 250);
    image(cheese, 170, 170);
   

}