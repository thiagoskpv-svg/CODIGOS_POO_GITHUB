class Equipo:
    def __init__(self, nombre):
        self._nombre = nombre
        self._miembros = []

    def agregar(self, p):
        self._miembros.append(p)

    def quitar(self, p):
        self._miembros.remove(p)

    def ataque_total(self):
        total = 0
        for p in self._miembros:
            total += p.atacar()
        return total
