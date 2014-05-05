package curious.types;

public interface CuriousInheritance {
  public <T> void setValue(T toSet);
  public <T> T getValue(T dummyValue);
}
