package technology.semi.weaviate.client.v1.backup.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BackupRestoreStatusResponse {

  String id;
  String path;
  String backend;
  String status;
  String error;
}
