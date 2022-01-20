package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pojo.cd.CompactDisk;
import pojo.cd.Fantasy;
import pojo.player.CDPlayer;
import pojo.player.MediaPlayer;

//@ComponentScan(basePackageClasses = {CompactDisk.class, MediaPlayer.class})
@Configuration
public class BeanConfig {
    @Bean  // 基于JavaConfig的显示配置
    public CompactDisk fantasy() {
        return new Fantasy();
    }

    @Bean
    public MediaPlayer cdPlayer() {
        return new CDPlayer();
    }
}
