package woocommerce.handler;

import java.util.List;
import java.util.Map;

public interface IWoocommerce<T> {
    T create(T t);

    T get(int id);

    List<T> getAll();

    boolean update(int id, Map<Object, Object> data);

    boolean delete(int id);

    List<T> batchUpdate(List<T> tList);
}
