void setup() {
  size(500, 500);
}
void draw() {
  background(200, 200, 200);
  noStroke();
  fill(#FF0A0A);
  ellipse(150, 200, 150, 150);
  ellipse(212, 200, 150, 150);
  fill(#13950B);
  rect(176, 103, 12, 32);
  if(mousePressed == true) {
    fill(#FFFFFF);
    ellipse(80, 200, 50, 50);
  }
}