package woocommerce.handler;

import woocommerce.entity.StoreInformation;

import java.util.Map;

public interface IRequest {
    String GET(int id);

    String GET(Map<String, String> params);

    String PUT(int id, Map<Object, Object> data);

    String POST(Map<Object, Object> data);

    String POST(String data);

    String DELETE(int id);
}
