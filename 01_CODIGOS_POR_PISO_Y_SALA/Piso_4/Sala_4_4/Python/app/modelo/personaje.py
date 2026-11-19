from app.modelo.ataque_basico import AtaqueBasico
class Personaje:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estrategia = AtaqueBasico()

    def set_estrategia(self, estrategia):
        self._estrategia = estrategia

    def atacar(self):
        return self._estrategia.calcular()
