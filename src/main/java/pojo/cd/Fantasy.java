package pojo.cd;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Fantasy implements CompactDisk {
    private String name = "依然范特西";
    private Double price = 100.00;

    @Override
    public void play() {
        System.out.println(this.name + " is playing");
    }
}
