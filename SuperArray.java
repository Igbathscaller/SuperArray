public class SuperArray{
    private String[] data;
    private int size;

    public SuperArray(){
        data = new String[10];
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


}