package cpt.blubber.dagger2androidsample.greeting;

import javax.inject.Inject;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
public class Greeter {

    private String greeting;

    @Inject
    public Greeter(@Greeting String greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return greeting;
    }

}
