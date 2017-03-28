package cpt.blubber.dagger2androidsample.greeting;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Greeting {

}
