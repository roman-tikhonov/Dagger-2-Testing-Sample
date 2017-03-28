package cpt.blubber.dagger2androidsample;

import org.junit.Test;

import cpt.blubber.dagger2androidsample.greeting.Greeter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    @Test
    public void testGreeter() {

        String expected = "FooBar";
        Greeter sut = new Greeter(expected);

        assertThat(sut.greet(), is(equalTo(expected)));

    }
}