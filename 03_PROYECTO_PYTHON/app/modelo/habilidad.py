from abc import ABC, abstractmethod

class Habilidad(ABC):
    def __init__(self, nombre, costo):
        self._nombre = nombre
        self._costo = costo

    @property
    def nombre(self):
        return self._nombre

    @abstractmethod
    def calcular_efecto(self, objetivo):
        pass
