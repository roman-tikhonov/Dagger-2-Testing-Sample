package cpt.blubber.dagger2androidsample;

/**
 * @author Angelo Rüggeberg <s3xy4ngc@googlemail.com>
 */
public class TestApplication extends AwesomeApplication {

    @Override
    protected void buildAndInject() {
        //TODO: Not Working
        DaggerTestAppComponent
                .builder()
                .build()
                .inject(this);
    }
}
