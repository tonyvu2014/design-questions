import java.util.List;
import java.util.Date;
import java.util.Set;
import java.util.ArrayList;


public class EntryInMemoryManager implements EntryManager {

    private Long nextId = 1l;
    private List<Entry> posts = new ArrayList<>();

    @Override
    public void add(Entry entry) {
        entry.setId(nextId);
        entry.setDateCreated(new Date());
        nextId++;
        posts.add(entry);
    }

    @Override
    public void delete(Long id) {
        Entry entry = getById(id);
        if (entry != null) {
            posts.remove(entry);
        }
    }

    @Override
    public void update(Long id, String title, String body) {
        Entry entry = getById(id);
        if (entry != null) {
            if (body != null) {
                entry.setBody(body);
            }

            if (title != null) {
                entry.setTitle(title);
            }
        }
    }
    
    @Override
    public Entry getById(Long id) {
        for (Entry entry: posts) {
            if (entry.getId() == id) {
                return entry;
            }
        }

        return null;
    }

    @Override
    public List<Entry> search(String keyword) {
        List<Entry> searchResults = new ArrayList<>();

        for (Entry entry : posts) {
            String title = entry.getTitle();
            Set<String> tags = entry.getTags();

            if (title.equalsIgnoreCase(keyword)) {
                searchResults.add(entry);
                continue;
            }

            for (String tag: tags) {
                if (tag.equalsIgnoreCase(keyword)) {
                    searchResults.add(entry);
                    break;
                }
            }
        }

        return searchResults;
    }

}