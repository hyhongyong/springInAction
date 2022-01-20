package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pojo.cd.CompactDisk;

@Configuration
@ComponentScan(basePackageClasses = {CompactDisk.class})
public class CDPlayerConfig {
}
