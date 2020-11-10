public class SuperArray{
    private String[] data;
    private int size;

    public SuperArray(){
        data = new String[10];
        size = 0;
    }

    public SuperArray(int initialCapacity){
        if (initialCapacity < 0){
            throw new IllegalArgumentException("Don't be so negative");
        }
        data = new String[initialCapacity];
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean add(String element){
        if (size < data.length){
            data[size++] = element;
        }
        else{
            resize();
            data[size++] = element;
        }
        return true;
    }

    public String get(int index){
        if (size<=index){
            throw new IndexOutOfBoundsException("It's too big");
        }
        if (index<0){
            throw new IndexOutOfBoundsException("Don't be so negative");
        }
        return data[index];
    }

    public String set(int index, String element){
        if (size<=index){
            throw new IndexOutOfBoundsException("It's too big");
        }
        if (index<0){
            throw new IndexOutOfBoundsException("Don't be so negative");
        }
        String temp = data[index];
        data[index]=element;
        return temp;
    }

    private void resize(){
        String[] temp = data;
        data = new String[size*2+1];
        for (int i = 0; i<temp.length; i++){
            data[i]=temp[i];
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void clear(){
        size = 0;
        data = new String[10];
    }

    public String toString(){
        String out = "[";
        if (!isEmpty()){
            out += data[0]; 
            for (int i = 1; i<size; i++){
                out+=", " + data[i];
            }
        }
        out += "]";
        return out;
    }

    public boolean contains(String s){
        for(int i=0; i<size; i++){
            if (s != null && s.equals(data[i])){
                return true;
            }
        }
        return false;
    }

    public void add(int index, String element){
        if (size<=index){
            throw new IndexOutOfBoundsException("It's too big");
        }
        if (index<0){
            throw new IndexOutOfBoundsException("Don't be so negative");
        }
        if (size >= data.length){
            resize();
        }
        String[] temp = data;
        data = new String[data.length];
        for(int i = 0; i<index; i++){
            data[i]=temp[i];
        }
        data[index]=element;
        for(int i = index; i<size; i++){
            data[i+1]=temp[i];
        }
        size++;
    }

    public String remove(int index){
        if (size<=index){
            throw new IndexOutOfBoundsException("It's too big");
        }
        if (index<0){
            throw new IndexOutOfBoundsException("Don't be so negative");
        }
        String temp = data[index];
        for(int i = index+1; i<size; i++){
            data[i-1]=data[i];
        }
        size--;
        return temp;
    }

    public int indexOf(String s){
        for(int i=0; i<size; i++){
            if (s != null && s.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(String value){
        for(int i=size-1; i>=0; i--){
            if (value != null && value.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean equals(SuperArray other){
        if (other.size != size){
            return false;
        }
        for(int i=0; i<size; i++){
            if (!data[i].equals(other.get(i))){
                return false;
            }
        }
        return true;
    }

    public String[] toArray(){
        String[] out = new String[size];
        for(int i=0; i<size; i++){
            out[i]=data[i];
        }
        return out;
    }

}