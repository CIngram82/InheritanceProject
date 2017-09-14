package com.ChrisIngram;

import java.time.LocalDateTime;

public class Notification {
  private LocalDateTime createdAt;
  private String subject;
  private String body;

  protected String status = "200";

  public Notification(String subject, String body) {
    this.subject = subject;
    this.body = body;
    createdAt = LocalDateTime.now();
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public String getSubject() {
    return subject;
  }

  public String getBody() {
    return body;
  }

  public void transport() throws NoTransportException {

  }
  protected void printStuff(){
    System.out.println("hi mom");
  }
}
