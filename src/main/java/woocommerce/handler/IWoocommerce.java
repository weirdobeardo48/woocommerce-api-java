package woocommerce.handler;

import java.util.List;

public interface IWoocommerce<T> {
    T create(T t);

    T get(int id);

    List<T> getAll();

    boolean update(int id);

    boolean delete(int id);

    List<T> batchUpdate(List<T> tList);
}
