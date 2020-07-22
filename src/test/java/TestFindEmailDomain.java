import org.junit.Assert;
import org.junit.Test;

public class TestFindEmailDomain {

    @Test
    public void test1() {
        final String address = "prettyandsimple@example.com";
        final String etalon = "example.com";
        final String test = CommonTasks.findEmailDomain(address);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test2() {
        final String address = "fully-qualified-domain@codesignal.com";
        final String etalon = "codesignal.com";
        final String test = CommonTasks.findEmailDomain(address);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test3() {
        final String address = "\\\" \\\"@space.com";
        final String etalon = "space.com";
        final String test = CommonTasks.findEmailDomain(address);
        Assert.assertEquals(etalon, test);
    }

    @Test
    public void test4() {
        final String address = "someaddress@yandex.ru";
        final String etalon = "yandex.ru";
        final String test = CommonTasks.findEmailDomain(address);
        Assert.assertEquals(etalon, test);
    }

}
