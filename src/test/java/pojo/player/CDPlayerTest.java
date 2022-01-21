package pojo.player;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = BeanConfig.class)
@ContextConfiguration(locations = {"classpath:application.xml"})
public class CDPlayerTest extends TestCase {
    @Autowired
    @Qualifier("anotherCDPlayer")
    private MediaPlayer anotherMediaPlayer;

    @Autowired
    @Qualifier("CDPlayer")
    private MediaPlayer mediaPlayer;

    @Test
    public void testPlay() {
        mediaPlayer.play();
        anotherMediaPlayer.play();
    }

    @Test
    public void testEquals() {
        // 单例模式
        System.out.println(anotherMediaPlayer.hashCode());
        System.out.println(mediaPlayer.hashCode());
        System.out.println(anotherMediaPlayer.equals(mediaPlayer));
    }
}