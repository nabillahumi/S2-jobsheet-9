public class StackSurat18 {
    
    Surat18[] stack;
    int top;
    int size;

    public StackSurat18(int size) {
        this.size = size;
        stack = new Surat18[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == size -1) {
            return true; 
         } else {
             return false;
         }
    }

    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat18 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat18 pop() {
        if (!isEmpty()) {
            Surat18 surat = stack[top];
            top--;
            System.out.println("Surat telah diproses.");
            return surat;
        } else {
            System.out.println("Tidak ada surat yang perlu diproses.");
            return null;
        }
    }

    public Surat18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong.");
            return null;
        }
    }

    public boolean cariSurat(String namaMahasiswa) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
}
