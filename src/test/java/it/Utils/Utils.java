package it.Utils;

import java.util.Random;
import java.util.stream.Collectors;

public class Utils {
    public static class String {
        public static java.lang.String getRandom(int length){
           return new Random().ints(65, 88)
                    .limit(length)
                    .mapToObj(s->""+(char)s)
                    .collect(Collectors.joining());
        }
    }
}
