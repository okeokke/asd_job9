public class StackTugasMahasiswa07 {
  Mahasiswa07[] stack;
  int top;
  int size;

  public StackTugasMahasiswa07(int size){
    this.size=size;
    stack=new Mahasiswa07[size];
    top=-1;
  }

  public boolean isFull(){
    if (top==size-1){
      return true;
    } else {
      return false;
    }
  }

  public boolean isEmpty(){
    if (top==-1) {
      return true;
    } else {
      return false;
    }
  }

  public void push(Mahasiswa07 mhs){
    if (!isFull()) {
      top++;
      stack[top]=mhs;
    } else {
      System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
    }
  }

  public Mahasiswa07 pop() {
    if (!isEmpty()) {
      Mahasiswa07 m = stack[top];
      top--;
      return m;
    } else {
      System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
      return null;
    }
  }

  public Mahasiswa07 peek(){
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
      return null;
    }
  }

  public Mahasiswa07 peekBawah(){
    if (!isEmpty()) {
      return stack[0];
    } else {
      System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
      return null;
    }
  }

  public int count(){
    return top + 1;
  }

  public void print(){
    for (int i = 0; i <= top; i++) {
      System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
    }
    System.out.println();
  }

}