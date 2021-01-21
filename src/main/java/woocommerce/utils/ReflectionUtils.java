package woocommerce.utils;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class ReflectionUtils {
    public static List<Field> getAllFields(List<Field> fields, Class<?> clazz) {
        fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
        if (null != clazz.getSuperclass()) {
            getAllFields(fields, clazz.getSuperclass());
        }
        return fields;
    }
}
