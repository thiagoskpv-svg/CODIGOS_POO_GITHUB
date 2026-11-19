from app.modelo.inventario import Inventario
class Personaje:
    def __init__(self, nombre, capacidad):
        self._nombre = nombre
        self._inventario = Inventario(capacidad)

    def recoger(self, item):
        return self._inventario.agregar(item)
