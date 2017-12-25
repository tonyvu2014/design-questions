import java.util.List;

public class WikiDemo {

    public static void main(String[] args) {
        User user = new User();
        user.setFullName("Alexandre Rasputin");
        user.setUsername("alex.rasputin");

        Entry entry1 = new Entry();
        entry1.setTitle("Apple");
        entry1.setAuthor(user);
        entry1.setBody("<html><head><title>Apple</title></head><body><h1>Hello Apple</h1></body></html>");
        entry1.addTag("Fruit");
        entry1.addTag("Plant");

        Entry entry2 = new Entry();
        entry2.setTitle("Orange");
        entry2.setAuthor(user);
        entry2.setBody("<html><head><title>Orange</title></head><body><h1>Hello Orange</h1></body></html>");
        entry2.addTag("Fruit");
        entry2.addTag("Plant");

        Entry entry3 = new Entry();
        entry3.setTitle("Fruit");
        entry3.setAuthor(user);
        entry3.setBody("<html><head><title>Fruit</title></head><body><h1>Hello Fruit</h1></body></html>");
        entry3.addTag("Plant");

        EntryManager entryManager = new EntryInMemoryManager();
        entryManager.add(entry1);
        entryManager.add(entry2);
        entryManager.add(entry3);

        entryManager.delete(2l);
        entryManager.update(3l, null, "<html><head><title>Fruit</title></head><body><h1>Hello All Fruits</h1></body></html>");
        List<Entry> fruitPosts = entryManager.search("fruit");

        for (Entry e: fruitPosts) {
            System.out.println(e);
            System.out.println("----------");
        }

    }
}