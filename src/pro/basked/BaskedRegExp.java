package pro.basked;

import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaskedRegExp {

    public static void executeRegExp(String pattern, String matcher) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(matcher);
        while (m.find()) {
            System.out.println(m.start() + " " + m.group());
        }
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        executeRegExp("b", "basked a bad boy");      // вхождение символа
        executeRegExp("ba", "basked a bad boy");     // вхождение группы символов
        executeRegExp("1\\+2=\\[3\\]", "1+2=[3]");   // специальные символы (метаcимволы ) []()+\.$^*|
        executeRegExp("\\Q1+2=[3]\\E", "1+2=[3]");   // специальные символы (метаcимволы ), учитывая \\Q и \\E
        executeRegExp("[1-9]", "0123456789");        //  наборы цифр
        executeRegExp("[a-c]", "abcdfc");            //  наборры символов


    }
}
