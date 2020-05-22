package SpringFramework.Spring5.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="Book")
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String title ;
    private String isban ;
    private String publisher ;

    @ManyToMany
    @JoinTable(name = "author_books" , joinColumns = @JoinColumn(name = "book_id") ,inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author>  autors=new HashSet<>();


    public Book() {
    }

    public Book(String title, String isban, String publisher) {
        this.title = title;
        this.isban = isban;
        this.publisher = publisher;
    }

    public Book(String title, String isban, String publisher, Set<Author> autors) {
        this.title = title;
        this.isban = isban;
        this.publisher = publisher;
        this.autors = autors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsban() {
        return isban;
    }

    public void setIsban(String isban) {
        this.isban = isban;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Set<Author> getAutors() {
        return autors;
    }

    public void setAutors(Set<Author> autors) {
        this.autors = autors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isban='" + isban + '\'' +
                ", publisher='" + publisher + '\'' +
                ", autors=" + autors +
                '}';
    }
}
