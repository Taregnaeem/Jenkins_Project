package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

    
  @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "World, This is the last miodification for the code, I hope it will go graet this time";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
  @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "This is the modifiacation for the Jenkins Project";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

  @Test
  public void greetShouldIncludeGreetingMessage() {
    String someone = "This is the modification to the branch main instead of master in the project Jenkins";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
