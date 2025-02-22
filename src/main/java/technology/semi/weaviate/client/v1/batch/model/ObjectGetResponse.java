package technology.semi.weaviate.client.v1.batch.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;
import technology.semi.weaviate.client.v1.data.model.Deprecation;
import technology.semi.weaviate.client.v1.data.model.WeaviateObject;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ObjectGetResponse extends WeaviateObject {
  Deprecation[] deprecations;
  ObjectsGetResponseAO2Result result;
}
