package com.github.natros.dagger;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;

@AutoFactory
public class Dialog {
  private final MessageBox messageBox;
  private final String title;

  public Dialog(@Provided MessageBox messageBox, String title) {
    this.messageBox = messageBox;
    this.title = title;
  }
}
