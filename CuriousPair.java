package curious.types;

public abstract class CuriousPair<A, B extends CuriousBase<B>> extends CuriousBase<CuriousPair<A,B>> implements CuriousInheritance {
  private A a;
  private B b;
  public <T> void setValue(T toSet) {
    if(a.getClass().equals(toSet.getClass())) {
      a = (A)toSet;
      return;
    }
    b.setValue(toSet);
  }
  public <T> T getValue(T dummyValue) {
    if(a.getClass().equals(dummyValue.getClass())) {
      return (T)a;
    }
    return b.getValue(dummyValue);
  }
}
