from app.modelo.curador import Curador
from app.modelo.personaje import Personaje

class Clerigo(Personaje, Curador):
    def __init__(self, nombre, vida_maxima):
        super().__init__(nombre, vida_maxima)

    def curar_a(self, aliado, cantidad):
        aliado.curar(cantidad)
