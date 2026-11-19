class Item:
    def __init__(self, nombre):
        self._nombre = nombre

    def __eq__(self, otro):
        if not isinstance(otro, Item):
            return NotImplemented
        return self._nombre == otro._nombre

    def __hash__(self):
        return hash(self._nombre)
