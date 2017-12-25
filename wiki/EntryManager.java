import java.util.List;

public interface EntryManager {

    public void add(Entry entry);
    public void delete(Long id);
    public void update(Long id, String title, String body);
    public Entry getById(Long id);
    public List<Entry> search(String keyword);

}