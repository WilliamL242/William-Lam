#include <Servo.h>

Servo rotate;
Servo launch;

#define VRX_PIN A0
#define VRY_PIN A1

int xValue = 0;
int yValue = 0;
int angle = 90;
boolean holding = true;

void setup() {
  Serial.begin(9600);
  rotate.attach(9);
  launch.attach(10);
  pinMode(2, INPUT_PULLUP);
}

void loop() {
  xValue = analogRead(VRX_PIN);
  yValue = analogRead(VRY_PIN);

  Serial.print("x = ");
  Serial.print(xValue);
  Serial.print(", y = ");
  Serial.println(yValue);

  if (digitalRead(2) == LOW) {
    launch.write(0);
    delay(100);
  } else {
    launch.write(90);
    delay(100);
  }


  if (yValue >= 570) {
    angle -= 5;
  }
  if (yValue <= 450) {
    angle += 5;
  }
  if (angle > 175) {
    angle = 175;
  }
  if (angle < 5) {
    angle = 5;
  }
  rotate.write(angle);
  delay(50);
}
