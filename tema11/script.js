let culoare1 = 'red';
let culoare2 = 'blue';
let activ = false;
let intervalID;

function setup() {
  createCanvas(240, 140);
  rectMode(CORNER);
  textAlign(CENTER, CENTER);
  textSize(16);
}

function draw() {
  background(220);

  fill(culoare1);
  rect(10, 25, 100, 50);

  fill(culoare2);
  rect(130, 25, 100, 50);

  fill(0, 200, 0);
  rect(30, 100, 80, 30, 5);
  fill(0);
  text("START", 70, 115);

  fill(200, 0, 0);
  rect(130, 100, 80, 30, 5);
  fill(255);
  text("STOP", 170, 115);
}

function mousePressed() {
  if (mouseX > 30 && mouseX < 110 && mouseY > 100 && mouseY < 130) {
    if (!activ) {
      activ = true;
      intervalID = setInterval(schimba, 1000);
    }
  }

  if (mouseX > 130 && mouseX < 210 && mouseY > 100 && mouseY < 130) {
    if (activ) {
      clearInterval(intervalID);
      activ = false;
    }
  }
}

function schimba() {
  let aux = culoare1;
  culoare1 = culoare2;
  culoare2 = aux;
}
