from abc import ABC, abstractmethod


class Habilidad(ABC):
    def __init__(self, nombre, costo):
        self._nombre = nombre
        self._costo = costo

    @abstractmethod
    def calcular_efecto(self, objetivo):
        raise NotImplementedError

    @property
    def nombre(self):
        return self._nombre
