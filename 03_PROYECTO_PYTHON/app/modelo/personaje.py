from app.modelo.ataque_basico import AtaqueBasico
from app.modelo.inventario import Inventario

class Personaje:
    total_creados = 0

    def __init__(self, nombre, vida_maxima=100, capacidad_inventario=10):
        if vida_maxima <= 0:
            raise ValueError("Vida máxima no válida")
        self._nombre = nombre
        self._vida_maxima = vida_maxima
        self._vida = vida_maxima
        self._estado = "vivo"
        self._inventario = Inventario(capacidad_inventario)
        self._estrategia = AtaqueBasico()
        Personaje.total_creados += 1

    @property
    def nombre(self):
        return self._nombre

    @property
    def vida(self):
        return self._vida

    @property
    def estado(self):
        return self._estado

    @classmethod
    def total(cls):
        return cls.total_creados

    def recibir_dano(self, dano):
        if dano < 0:
            raise ValueError("El daño no puede ser negativo")
        self._vida = max(0, self._vida - dano)
        if self._vida == 0:
            self._estado = "derrotado"

    def curar(self, cantidad):
        if cantidad < 0:
            raise ValueError("Curación negativa")
        self._vida = min(self._vida_maxima, self._vida + cantidad)
        if self._vida > 0:
            self._estado = "vivo"

    def recoger(self, item):
        return self._inventario.agregar(item)

    def set_estrategia(self, estrategia):
        self._estrategia = estrategia

    def atacar(self):
        return self._estrategia.calcular()
