let culoare1 = 'red';
let culoare2 = 'blue';
let schimbare = false;
let ultimulTimp = 0;

function setup() {
  createCanvas(220, 100);
  rectMode(CORNER);
}

function draw() {
  background(220);

  fill(culoare1);
  rect(10, 25, 100, 50);

  fill(culoare2);
  rect(110, 25, 100, 50);

  if (schimbare && millis() - ultimulTimp >= 1000) {
    let aux = culoare1;
    culoare1 = culoare2;
    culoare2 = aux;
    ultimulTimp = millis();
  }
}

function keyPressed() {
  if (key === 's' || key === 'S') {
    schimbare = true;
    ultimulTimp = millis();
  } else if (key === 'x' || key === 'X') {
    schimbare = false;
  }
}
