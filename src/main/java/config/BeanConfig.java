package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pojo.cd.CompactDisk;
import pojo.player.MediaPlayer;

@Configuration
@ComponentScan(basePackageClasses = {CompactDisk.class, MediaPlayer.class})
public class BeanConfig {
}
