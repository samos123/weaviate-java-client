# Weaviate Java client  <img alt='Weaviate logo' src='https://raw.githubusercontent.com/semi-technologies/weaviate/19de0956c69b66c5552447e84d016f4fe29d12c9/docs/assets/weaviate-logo.png' width='180' align='right' />

A Java native client for weaviate.

## Documentation

In order to get start using the java client one needs to add it's dependency:

```xml
<dependency>
  <groupId>technology.semi.weaviate</groupId>
  <artifactId>client</artifactId>
  <version>1.0.0</version>
</dependency>
```

## Example

Here's a simple code to start up working with Java client.

Add dependency to your java project.

Connect to Weaviate on `localhost:8080` and fetch meta information

```java
import java.io.IOException;
import technology.semi.weaviate.client.Config;
import technology.semi.weaviate.client.WeaviateClient;
import technology.semi.weaviate.client.v1.misc.api.model.Meta;

public class App {
  public static void main(String[] args) {
    try {
      Config config = new Config("http", "localhost:8080");
      WeaviateClient client = new WeaviateClient(config);
      Meta meta = client.misc().metaGetter().run();
      System.out.printf("meta.hostname: %s\n", meta.getHostname());
      System.out.printf("meta.version: %s\n", meta.getVersion());
      System.out.printf("meta.modules: %s\n", meta.getModules());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
```

## Support

- [Stackoverflow for questions](https://stackoverflow.com/questions/tagged/weaviate).
- [Github for issues](https://github.com/semi-technologies/weaviate-java-client/issues).

## Contributing

- [How to Contribute](https://github.com/semi-technologies/weaviate/blob/master/CONTRIBUTE.md).

## Build Status

| Branch   | Status        |
| -------- |:-------------:|
| Main     | [![Build Status](https://travis-ci.com/semi-technologies/weaviate-java-client.svg?token=YPa1Pbr1QfTDsrnqbHLf&branch=main)](https://travis-ci.com/github/semi-technologies/weaviate-java-client)