package exam.basics.strings;

import org.apache.log4j.Logger;

/**
 * User: andrey.osipov
 * Date: 7/4/12
 * Time: 5:05 PM
 */
public class StringConcat {

    private static final Logger log = Logger.getLogger(StringConcat.class);

    public static final String SOME_CONSTANT = "eeee";

    /**
     * compile, decompile and see how code is optimized
     */
    public void doConcat(String param) {
        log.debug("a" + "another string " + param + " hhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + SOME_CONSTANT);
    }
//    the following should be in java6:
//    log.debug((new StringBuilder()).append("aanother string ").append(param).append(" hhhhhhhhhhhhhhhhhhhhhhhhhhhhh").append("eeee").toString());
}
