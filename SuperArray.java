public class SuperArray{
    private String[] data;
    private int size;

    public SuperArray(){
        data = new String[10];
        size = 0;
    }

    public SuperArray(int initialCapacity){
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
        return data[index];
    }

    public String set(int index, String element){
        String temp = data[index];
        data[index]=element;
        return temp;
    }

    private void resize(){
        String[] temp = data;
        data = new String[size*2];
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

    public void add(int index, String element){
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
/*
    public String remove(int index){
        
    }

    public int indexOf(String s){
        
    }

    public String[] toArray(){

    }
*/
}