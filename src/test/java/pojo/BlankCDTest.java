package pojo;

import config.BeanConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pojo.cd.CompactDisk;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class BlankCDTest {
    @Autowired
    private CompactDisk cd;

    @Test
    public void test() {
        System.out.println(cd);
    }

    @Test
    public void play() {
    }

    @Test
    public void getName() {
    }

    @Test
    public void getPrice() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void setPrice() {
    }

    @Test
    public void testEquals() {
    }

    @Test
    public void canEqual() {
    }

    @Test
    public void testHashCode() {
    }

    @Test
    public void testToString() {
    }
}