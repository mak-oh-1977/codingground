
public class HelloWorld{

     public static void main(String []args){
        
        Item[] items = new Item[3];

        int total = 0;
        for(int i = 0; i < 3; i++){
            items[i] = new Item();
            total += items[i].price;
        }
        System.out.println(total);
     }
}
