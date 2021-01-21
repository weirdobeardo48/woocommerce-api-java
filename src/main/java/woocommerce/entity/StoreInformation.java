package woocommerce.entity;

public class StoreInformation {
    private String URL;
    private String API_KEY;
    private String API_SECRET;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getAPI_KEY() {
        return API_KEY;
    }

    public void setAPI_KEY(String API_KEY) {
        this.API_KEY = API_KEY;
    }

    public String getAPI_SECRET() {
        return API_SECRET;
    }

    public void setAPI_SECRET(String API_SECRET) {
        this.API_SECRET = API_SECRET;
    }
}
