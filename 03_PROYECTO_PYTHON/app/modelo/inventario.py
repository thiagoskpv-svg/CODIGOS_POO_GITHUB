from app.modelo.errores import InventarioLlenoError

class Inventario:
    def __init__(self, capacidad):
        if capacidad < 0:
            raise ValueError("Capacidad negativa")
        self._capacidad = capacidad
        self._items = []

    def agregar(self, item):
        if len(self._items) >= self._capacidad:
            raise InventarioLlenoError("Inventario lleno")
        self._items.append(item)
        return True
