void setup () {
  size(301, 400);
  PImage face = loadImage("download.jpg");
  image(face, 0, 0);
}
void draw () {
  fill(mouseX, mouseY, mouseX+mouseY);
  ellipse(115, 60, 25, 25);
  ellipse(175, 65, 25, 25);
  fill(#080000);
  ellipse(115, 60, 15, 15);
  ellipse(175, 65, 15, 15);
}