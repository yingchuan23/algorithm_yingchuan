package com.codechen.designpattern.factroy.cdyfactory.jiandan;

import com.codechen.designpattern.factroy.cdyfactory.jiandan.inter.Mainboard;
import com.codechen.designpattern.factroy.jiandan.IPay;

public class SimpleMainboardFactory {

    public static Mainboard createmainboard(String mainboardType) {
        if(mainboardType.equals("mainboard001")){
            return new C001Mainboard();
        }else if (mainboardType.equals("mainboard002")){
            return new C002Mainboard();
        }
        return null;
    }

}
