import java.util.Set;
import java.util.HashSet;
import java.util.Date;

public class Entry {

    private Long id;
    private String title;
    private String body;
    private Set<String> tags;
    private Date dateCreated;
    private User author;

    public Entry() {
        tags = new HashSet<>();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Set<String> getTags() {
        return this.tags;
    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public User getAuthor() {
        return this.author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String toString() {
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append(this.title);
        strBuilder.append("\n\n");
        strBuilder.append(this.body);
        strBuilder.append("\n\n");
        strBuilder.append("Added by " + this.author.getFullName());
        strBuilder.append(" ");
        strBuilder.append("on " + this.dateCreated.toString());

        return strBuilder.toString();
    }
}