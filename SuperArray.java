public class SuperArray {
  //Instance Variables
  private String[] data;
  private int size;

  //Constructor
  public SuperArray() {
    size = 0;
    data = new String[10];
  }

  //Methods
  public int size() {
    return size;
  }

  public boolean add(String element) {
    if (size >= data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String thing = data[index];
    data[index] = element;
    return thing;
  }

  private void resize() {
    String[] thing;
    thing = new String[data.length+1];
    for (int i=0;i<data.length;i++) {
      thing[i] = data[i];
    }
    data = thing;
  }


}
