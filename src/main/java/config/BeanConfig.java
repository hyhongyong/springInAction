package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pojo.cd.BlankCD;
import pojo.cd.CompactDisk;
import pojo.player.CDPlayer;
import pojo.player.MediaPlayer;

@ComponentScan(basePackageClasses = {CompactDisk.class, MediaPlayer.class})
@Configuration
public class BeanConfig {
    @Bean  // 基于JavaConfig的显示配置
    public CompactDisk fantasy() {
        Integer choice = Integer.valueOf((int) Math.floor(Math.random() * 4));
        switch (choice) {  // 发挥Java的强大威力
            case 0:
                return new BlankCD();
            case 1:
                return new BlankCD("珊瑚海", 150.00);
            case 2:
                return new BlankCD("斗牛要不要", 200.00);
            default:
                return new BlankCD("七里香", 120.00);
        }
    }

    @Bean(name = "anotherCDPlayer")
    public MediaPlayer cdPlayer() {
        return new CDPlayer();
    }
}
