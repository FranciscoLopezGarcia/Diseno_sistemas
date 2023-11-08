from abc import ABC, abstractmethod

class Animal(ABC):
   @abstractmethod
   def make_sound(self):
       pass

class Dog(Animal):
   def make_sound(self):
       print("Woof!")

class Cat(Animal):
   def make_sound(self):
       print("Meow!")

class AnimalFactory(ABC):
   @abstractmethod
   def create_animal(self, type):
       pass

class DogFactory(AnimalFactory):
   def create_animal(self, type):
       if type == "dog":
           return Dog()
       else:
           raise ValueError("Invalid animal type")

class CatFactory(AnimalFactory):
   def create_animal(self, type):
       if type == "cat":
           return Cat()
       else:
           raise ValueError("Invalid animal type")

def main():
   dog_factory = DogFactory()
   dog = dog_factory.create_animal("dog")
   dog.make_sound()

   cat_factory = CatFactory()
   cat = cat_factory.create_animal("cat")
   cat.make_sound()

if __name__ == "__main__":
   main()
