public class StackSurat07 {
  Surat07[] stack;
  int top;
  int size;

  public StackSurat07(int size) {
    this.size = size;
    stack = new Surat07[size];
    top = -1;
  }

  public boolean isEmpty() {
    if (top == -1) {
      return true;
    } else {
      return false;
    }
  }

  public boolean isFull() {
    if (top == size - 1) {
      return true;
    } else {
      return false;
    }
  }

  public void push(Surat07 surat) {
    if (!isFull()) {
      top++;
      stack[top] = surat;
    } else {
      System.out.println("Stack surat penuh! Tidak bisa menambahkan surat lagi.");
    }
  }

  public Surat07 pop() {
    if (!isEmpty()) {
      Surat07 s = stack[top];
      top--;
      return s;
    } else {
      System.out.println("Stack surat kosong! Tidak ada surat untuk diproses.");
      return null;
    }
  }

  public Surat07 peek() {
    if (!isEmpty()) {
      return stack[top];
    } else {
      System.out.println("Stack surat kosong! Tidak ada surat yang masuk.");
      return null;
    }
  }

  public Surat07 cariSurat(String nama) {
    for (int i = 0; i <= top; i++) {
      if (stack[i].namaMahasiswa.equals(nama)) {
        return stack[i];
      }
    }
    return null;
  }
}
