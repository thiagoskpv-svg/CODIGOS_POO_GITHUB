from abc import ABC, abstractmethod

class Curador(ABC):
    @abstractmethod
    def curar_a(self, aliado, cantidad):
        pass
