package com.github.natros.dagger;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;

@AutoFactory
public class Window {
  private final DialogFactory dialogFactory;
  private final String title;

  public Window(@Provided DialogFactory dialogFactory, String title) {
    this.dialogFactory = dialogFactory;
    this.title = title;
  }
}
