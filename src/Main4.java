import br.com.victor.models.character.*;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    static void main() {
        Castable elf = new Elf("Archie", "Masculino", 300, 120, "Bow");
        Castable mage = new Mage("Dumbledore", "Masculino", 60, 200, "Staff");
        Orc orc = new Orc("Tifanny", "feminino", 40, "Machado");

        List<Castable> casters = List.of(mage, elf);

        for(Castable caster : casters){
            caster.cast();
        }

//        elf.cast();
//        mage.cast();

        orc.attack();

    }
}
