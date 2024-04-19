package mx.com.session26.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Libro {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotEmpty
    @Column(length = 30)
    private String titulo;

    @NotEmpty
    @Column(length = 30)
    private String author;

    @NotEmpty
    @Column(length = 30)
    private String editorial;

    @NotEmpty
    @Column(length = 10)
    private String numpage;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getNumpage() {
        return numpage;
    }

    public void setNumpage(String numpage) {
        this.numpage = numpage;
    }
    
}
