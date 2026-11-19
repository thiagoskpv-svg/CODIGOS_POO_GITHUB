from abc import ABC, abstractmethod

class Efecto(ABC):
    @abstractmethod
    def aplicar(self, objetivo):
        pass
