package technology.semi.weaviate.client;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import technology.semi.weaviate.client.v1.misc.Misc;
import technology.semi.weaviate.client.v1.schema.Schema;

public class WeaviateClient {
  private Config config;
  private URLConnection connection;
  private URL url;

  private Misc misc;
  private Schema schema;

  public WeaviateClient(Config config) throws IOException {
    this.config = config;
    url = new URL(config.getScheme() + "://" + config.getHost());
    connection = url.openConnection();
    this.misc = new Misc(config);
    this.schema = new Schema(config);
  }

  public Misc misc() {
    return misc;
  }

  public Schema schema() {
    return schema;
  }
}