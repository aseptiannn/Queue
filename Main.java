package aseptianqueue;

public class Main {
    public static void main(String[] args) {

    DataNama Aseptian = new DataNama("Aseptian","Nur Rijal",1);
    DataNama Wendi = new DataNama("Wendi","Purnawan",2);
    DataNama Adi = new DataNama("Adi","Cobain",3);

    ArrayList queue = new ArrayList(5);
    queue.add(Aseptian);
    queue.add(Wendi);
    queue.add(Adi);

    //queue.remove();
    //queue.remove();
    //queue.remove();

    queue.printQueue();
    }
}