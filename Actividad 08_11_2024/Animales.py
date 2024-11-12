class Animal:
    def __init__(self, name, eat, color):
        self.name = name
        self._age=0
        self._eat = eat
        self.__color = color
    def speak(self):
        raise NotImplementedError("Subclass must implement abstract method")
    def food(self):
        raise NotImplementedError("Subclass must implement abstract method")
    def setColor(self, n_color):
        self.__color = n_color
    def getColor(self):
        return self.__color
    
class Dog(Animal):
    def speak(self):
        return f"{self.name} says Woof!"
    def food(self):
        return f"{self.name} come {self._eat}"
    def set_age(self,age):
        self._age=age
    def get_age(self):
        return f"{self.name} tiene la edad de {self._age}"
    def setColor(self, n_color):
        return super().setColor(n_color)
    def getColor(self):
        return f"{self.name} es de color {super().getColor()}"
    
class Cat(Animal):
    def speak(self):
        return f"{self.name} says Meow!"
    def food(self):
        return f"{self.name} come {self._eat}"
    def set_age(self,age):
        self._age=age
    def get_age(self):
        return f"{self.name} tiene la edad de {self._age}"
    def setColor(self, n_color):
        return super().setColor(n_color)
    def getColor(self):
        return f"{self.name} es de color {super().getColor()}"

class Raccon(Animal):
    def speak(self):
        return f"{self.name} says Rawr!"
    def food(self):
        return f"{self.name} come {self._eat}"
    def set_age(self,age):
        self._age=age
    def get_age(self):
        return f"{self.name} tiene la edad de {self._age}"
    def setColor(self, n_color):
        return super().setColor(n_color)
    def getColor(self):
        return f"{self.name} es de color {super().getColor()}"
    
# Ejemplo de uso
if __name__ == '__main__':
    dog = Dog("Rex","Huesos","Marron")
    cat = Cat("Whiskers", "Atun", "Naranja")
    raccon = Raccon("Pedro", "Algodon de azucar", "Cafe con gris")

    print(dog.speak())    # Rex dice Woof!
    print(dog.food())     # Rex come Huesos
    print(dog.getColor()) # Rex es de color Marron
    dog.set_age(3)
    print(dog.get_age())  # Rex tiene la edad de 3

    print(cat.speak())    # Whiskers dice Meow!
    print(cat.food())     # Whiskers come Atun
    print(cat.getColor()) # Whiskers es de color Naranja
    cat.set_age(5)
    print(cat.get_age())  # Whiskers tiene la edad de 5

    print(raccon.speak()) # Pedro dice Rawr!
    print(raccon.food())  # Pedro come Algodon de azucar
    print(raccon.getColor())# Pedro es de color Cafe con gris
    raccon.set_age(4)
    print(raccon.get_age()) # Pedro tiene la edad de 4