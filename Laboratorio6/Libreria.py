class Libro:
    def __init__(self, Titulo, Autor, ISBN, Estado):
        self.__Titulo = Titulo
        self.__Autor = Autor
        self.__ISBN = ISBN
        self.__Estado = Estado
        pass

    def setTitulo(self, n_Titulo):
        self.__Titulo = n_Titulo
    
    def setAutor(self, n_Autor):
        self.__Autor = n_Autor

    def setISBN(self, n_ISBN):
        self.__ISBN = n_ISBN

    def setEstado(self, n_Estado):
        self.__Estado = n_Estado

    def getTitulo(self):
        return self.__Titulo
    
    def getAutor(self):
        return self.__Autor
    
    def getISBN(self):
        return self.__ISBN
    
    def getEstado(self):
        return self.__Estado
    
    def getInfo(self):
        return f"El titulo del libro: {self.getTitulo()} \nDel autor: {self.getAutor()} \nCon ISBN: {self.getISBN()} \nTiene el estado: {self.getEstado()}"
    
class Biblioteca:
    def __init__(self):
        self.__Libros = []
        pass

    def agregarLibro(self, n_Libro):
        self.__Libros.append(n_Libro)

    def buscarLibro(self, n_ISBN):
        for libro in self.__Libros:
            if libro.getISBN() == n_ISBN:
                return libro.getInfo()
        return "No existe el libro"

    def prestarLibro(self, n_ISBN):
        for libro in self.__Libros:
            if libro.getISBN() == n_ISBN:
                if libro.getEstado() == "Disponible":
                    libro.setEstado("Prestado")
                    return "Libro prestado con exito"
                else:
                    return "Este libro ya está prestado"
        return "No existe ese libro"
    
    def devolverLibro(self, n_ISBN):
        for libro in self.__Libros:
            if libro.getISBN() == n_ISBN:
                if libro.getEstado() == "Prestado":
                    libro.setEstado("Disponible")
                    return "Libro devuelto con exito"
                else:
                    return "Este libro ya está disponible"
        return "No existe ese libro"
    
    def mostrarLibros(self):
        if not self.__Libros:
            return "No hay libros en la biblioteca."

        info_libros = ""
        for libro in self.__Libros:
            info_libros += libro.getInfo() + "\n" + "-"*30 + "\n\n"
        return info_libros

if __name__ == '__main__':
    L1 = Libro("La divina comedia", "Dante Alighieri", "1", "Disponible")
    L2 = Libro("Don quijote de la mancha", "Miguel de Cervantes", "2", "Prestado")
    L3 = Libro("El paraíso perdido", "John Milton", "3", "Disponible")

    Biblio = Biblioteca()
    Biblio.agregarLibro(L1)
    Biblio.agregarLibro(L2)
    Biblio.agregarLibro(L3)
    print(Biblio.mostrarLibros())
    Biblio.prestarLibro("1")
    print(Biblio.mostrarLibros())
    Biblio.devolverLibro("2")
    print(Biblio.mostrarLibros())