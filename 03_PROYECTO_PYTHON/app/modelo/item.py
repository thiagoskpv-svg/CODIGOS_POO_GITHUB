class Item:
    def __init__(self, nombre, peso=1.0):
        if peso < 0:
            raise ValueError("El peso no puede ser negativo")
        self._nombre = nombre
        self._peso = peso

    def describir(self):
        return f"{self._nombre} ({self._peso} kg)"

    def __eq__(self, otro):
        if not isinstance(otro, Item):
            return NotImplemented
        return self._nombre == otro._nombre

    def __hash__(self):
        return hash(self._nombre)
