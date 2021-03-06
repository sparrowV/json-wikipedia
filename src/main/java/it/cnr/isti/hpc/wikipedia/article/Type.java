/**
 * Autogenerated by Avro
 *
 * <p>DO NOT EDIT DIRECTLY
 */
package it.cnr.isti.hpc.wikipedia.article;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public enum Type {
  TEMPLATE,
  ARTICLE,
  CATEGORY,
  REDIRECT,
  DISAMBIGUATION,
  UNKNOWN,
  MAIN,
  LIST,
  PROJECT,
  FILE;
  public static final org.apache.avro.Schema SCHEMA$ =
      new org.apache.avro.Schema.Parser()
          .parse(
              "{\"type\":\"enum\",\"name\":\"Type\",\"namespace\":\"it.cnr.isti.hpc.wikipedia\",\"symbols\":[\"TEMPLATE\",\"ARTICLE\",\"CATEGORY\",\"REDIRECT\",\"DISAMBIGUATION\",\"UNKNOWN\",\"MAIN\",\"LIST\",\"PROJECT\",\"FILE\"]}");

  public static org.apache.avro.Schema getClassSchema() {
    return SCHEMA$;
  }
}
