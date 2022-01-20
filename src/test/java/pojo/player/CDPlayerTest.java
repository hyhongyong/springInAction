package pojo.player;

import config.BeanConfig;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = BeanConfig.class)
public class CDPlayerTest extends TestCase {
    @Autowired
    private MediaPlayer mediaPlayer;

    @Test
    public void testPlay() {
        mediaPlayer.play();
    }
}