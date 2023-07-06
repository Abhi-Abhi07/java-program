import java.util.ArrayList;

public class customArrayList{

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;

    customArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add (int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize(){
        int[] temp=new int[data.length*2];
        //copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i]=data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size==data.length;
    }

    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index,int value){
        data[index]=value;
    } 
    

    public static void main(String[] args) {
        // ArrayList list=new ArrayList();
        // list.add(0,6);
        // list.add(1, 3);
        // list.size();
        // list.get(0);
        // list.remove(1);
        // list.clear();

        customArrayList list=new customArrayList();
        list.add(3);
        list.add(4);
        list.add(6);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(45);

        ArrayList<String> list3=new ArrayList<>();
        list3.add("hwg");
    }
}