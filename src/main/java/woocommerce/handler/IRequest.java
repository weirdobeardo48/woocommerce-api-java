package woocommerce.handler;

import woocommerce.entity.StoreInformation;

import java.util.Map;

public interface IRequest {

    String GET(int id);

    String GET(Map<String, String> params);

    String POST(Map<Object, Object> data);

    String POST(String data);
}
