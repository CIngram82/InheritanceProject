package com.ChrisIngram;

public class TextNotification extends Notification {
  private String recipient;
  private String smsProvider;

  public TextNotification(String subject,
                          String body,
                          String recipient,
                          String smsProvider) {
    super(subject, body);
    this.recipient = recipient;
    this.smsProvider = smsProvider;
  }

  @Override
  public void transport() throws NoTransportException {
    System.out.println(recipient);
    System.out.println(smsProvider);
    System.out.println(getBody());
    System.out.println(getSubject());
    System.out.println(getCreatedAt());
  }
}
