package com.ChrisIngram;

public class EmailNotification extends Notification{
  private String recipient;
  private String smtpProvider;

  public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
    super(subject, body);
    this.recipient = recipient;
    this.smtpProvider = smtpProvider;
  }

  public String getRecipient() {
    return recipient;
  }

  public String getSmtpProvider() {
    return smtpProvider;
  }

  @Override
  public void transport() throws NoTransportException {
    System.out.println(recipient + smtpProvider);
    System.out.println(smtpProvider);
    System.out.println(getBody());
    System.out.println(getSubject());
    System.out.println(getCreatedAt());
  }

  @Override
  public void printStuff() {
    super.printStuff();
    System.out.println(" and Dad!");
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    EmailNotification that = (EmailNotification) o;

    if (recipient != null ? !recipient.equals(that.recipient) : that.recipient != null) return false;
    return smtpProvider != null ? smtpProvider.equals(that.smtpProvider) : that.smtpProvider == null;
  }

  @Override
  public int hashCode() {
    int result = recipient != null ? recipient.hashCode() : 0;
    result = 31 * result + (smtpProvider != null ? smtpProvider.hashCode() : 0);
    return result;
  }

}
