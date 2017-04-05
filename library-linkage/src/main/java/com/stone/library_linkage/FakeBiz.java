package com.stone.library_linkage;

/**
 * 伪造的业务类
 * @author stone
 * @date 17/4/1
 */
public class FakeBiz {

    public String greeting() {
        if(DevUtil.isDebug()) {
            return "Hello Gradle !! (this is debug version)";
        } else {
            return "Hello Gradle !! (this is release version)";
        }
    }

}
