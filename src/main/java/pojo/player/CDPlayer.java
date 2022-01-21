package pojo.player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pojo.cd.CompactDisk;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
//@ComponentScan(basePackageClasses = CompactDisk.class)
public class CDPlayer implements MediaPlayer {
    private CompactDisk cd;
/*    @Autowired
    private CompactDisk cd;  // 字段注入

    @Autowired
    public CDPlayer(CompactDisk cd) {  // 构造方法注入
        this.cd = cd;
    }

    @Autowired
    public void setCd(CompactDisk cd) {  // set方法注入
        this.cd = cd;
    }*/

    @Autowired
    public void insertCd(CompactDisk cd) {  // 任意方法注入
        this.cd = cd;
    }

    @Override
    public void play() {
        this.cd.play();
    }
}
