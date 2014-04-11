package collection2;

public class LRUCache {
    public int[] cache;
    public int[] values;
    public int[] visit;
    int current;
    int capacity;
    
    public LRUCache(int capacity) {
        this.cache = new int[capacity];
        this.values = new int[capacity];
        this.visit = new int[capacity];
        this.current = 0;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        for(int i=0;i<current;i++){
            if(cache[i]==key){
                visit[i] +=1;
                return values[i]; 
            }
        }
        return -1;
    }
    
    public void set(int key, int value) {
        for(int i = 0;i<current;i++){
            if(cache[i]==key){
                values[i] = value;
                visit[i] += 1;
                return;
            }
        }
        if(current<this.capacity){
            cache[current] = key;
            values[current] = value;
            visit[current] = 1;
            current++;
            return;
        }
        int min = 0;
        int position = 0;
        for(int i=0;i<this.capacity;i++){
            if(visit[i]>min){
                min = visit[i];
                position = i;
            }
        }
        cache[position] = key;
        values[position] = value;
        visit[position] = 1;
    }
}