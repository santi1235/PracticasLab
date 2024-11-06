import java.util.ArrayList;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private String estado;

    public Libro(String titulo, String autor, String isbn, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estado = estado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getEstado() {
        return estado;
    }

    public String getInfo() {
        return "El titulo del libro: " + getTitulo() + 
               "\nDel autor: " + getAutor() + 
               "\nCon ISBN: " + getIsbn() + 
               "\nTiene el estado: " + getEstado();
    }
}

class Biblioteca {
    private final ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public String buscarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro.getInfo();
            }
        }
        return "No existe el libro";
    }

    public String prestarLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                if (libro.getEstado().equals("Disponible")) {
                    libro.setEstado("Prestado");
                    return "Libro prestado con éxito";
                } else {
                    return "Este libro ya está prestado";
                }
            }
        }
        return "No existe ese libro";
    }

    public String devolverLibro(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                if (libro.getEstado().equals("Prestado")) {
                    libro.setEstado("Disponible");
                    return "Libro devuelto con éxito";
                } else {
                    return "Este libro ya está disponible";
                }
            }
        }
        return "No existe ese libro";
    }

    public String mostrarLibros() {
        if (libros.isEmpty()) {
            return "No hay libros en la biblioteca.";
        }

        StringBuilder infoLibros = new StringBuilder();
        for (Libro libro : libros) {
            infoLibros.append(libro.getInfo()).append("\n").append("-".repeat(30)).append("\n\n");
        }
        return infoLibros.toString();
    }

    public static void main(String[] args) {
        Libro l1 = new Libro("La divina comedia", "Dante Alighieri", "1", "Disponible");
        Libro l2 = new Libro("Don quijote de la mancha", "Miguel de Cervantes", "2", "Prestado");
        Libro l3 = new Libro("El paraíso perdido", "John Milton", "3", "Disponible");

        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.agregarLibro(l3);
        
        System.out.println(biblio.mostrarLibros());
        biblio.prestarLibro("1");
        System.out.println(biblio.mostrarLibros());
        biblio.devolverLibro("2");
        System.out.println(biblio.mostrarLibros());
    }
}