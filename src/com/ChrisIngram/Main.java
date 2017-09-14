package com.ChrisIngram;

public class Main {
  public static void main(String[] args) {
    EmailNotification emailNote = new EmailNotification("Hi mom", "I love you mom", "mom", "Gmail");
    TextNotification txtNote = new TextNotification("Child Care", "Sophia is at the YMCA after school", "Daniela", "Sprint");

    emailNote.transport();
    txtNote.transport();

    txtNote.printStuff();
    emailNote.printStuff();
  }
}

