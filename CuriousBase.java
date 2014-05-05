package curious.types;

public abstract class CuriousBase<A extends CuriousBase<A>> implements CuriousInheritance {
  public <T> void setValue(T toSet) {
  }
  public <T> T getValue(T dummyValue) {
    if(this.getClass().equals(dummyValue.getClass())) {
      return (T)this;
    }
    return null;
  }
}
