package OPPS;

public class DynamicArray {
    private int data[];
    private int nextElementIndex;
    public DynamicArray(){
        data = new int[5];
        nextElementIndex = 0;
    }
    public int size(){
        return nextElementIndex;
    }
    public boolean isEmpty(){
        return nextElementIndex == 0;
    }
    public int get(int i) throws Exception{
        if(i >= nextElementIndex){
            throw new Exception("Index out of bound");
        }
        return data[i];
    }
    public void add(int element){
        if(nextElementIndex == data.length){
            restructure();
        }
        data[nextElementIndex] = element;
        nextElementIndex++;
    }
    private void restructure(){
        int temp[] = data;
        data = new int[2 * temp.length];
        for(int i = 0; i < temp.length; i++){
            data[i] = temp[i];
        }
    }
    public int removeLast() throws Exception{
        if(nextElementIndex == 0){
            throw new Exception("Array is empty");
        }
        int temp = data[nextElementIndex - 1];
        nextElementIndex--;
        return temp;
    }
    public void set(int i, int element) throws Exception{
        if(i >= nextElementIndex){
            throw new Exception("Index out of bound");
        }
        data[i] = element;
    }
    public void add(int i, int element) throws Exception{
        if(i > nextElementIndex){
            throw new Exception("Index out of bound");
        }
        if(nextElementIndex == data.length){
            restructure();
        }
        for(int j = nextElementIndex; j > i; j--){
            data[j] = data[j - 1];
        }
        data[i] = element;
        nextElementIndex++;
    }
    public int remove(int i) throws Exception{
        if(i >= nextElementIndex){
            throw new Exception("Index out of bound");
        }
        int temp = data[i];
        for(int j = i; j < nextElementIndex - 1; j++){
            data[j] = data[j + 1];
        }
        nextElementIndex--;
        return temp;
    }
    public static void main(String[] args) throws Exception {
        DynamicArray d = new DynamicArray();
        d.add(10);
        d.add(20);
        d.add(30);
        d.add(40);
        d.add(50);
        d.add(60);
        d.add(70);
        d.add(80);
        d.add(90);
        d.add(100);
        d.add(110);
        d.add(120);
        d.add(130);
        d.add(140);
        d.add(150);
        d.add(160);
        d.add(170);
        d.add(180);
        d.add(190);

        System.out.println(d.size());
       
        d.print();

    }
    public void print() throws Exception{
        for(int i = 0; i < nextElementIndex; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
