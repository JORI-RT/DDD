package scrum;

import java.util.List;

public class SBLFactory {

    public static SBL create(List<BL> bls) {
        return new SBL(bls) ;
    }
}
