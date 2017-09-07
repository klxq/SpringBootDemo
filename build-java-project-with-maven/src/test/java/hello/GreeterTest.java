package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void testSayHello() throws Exception {
        assertThat(greeter.sayHello(), containsString("Hello world!"));
    }
}