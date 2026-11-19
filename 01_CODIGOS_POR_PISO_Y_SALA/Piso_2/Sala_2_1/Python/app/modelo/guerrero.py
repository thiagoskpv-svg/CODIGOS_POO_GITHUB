from app.modelo.personaje import Personaje
class Guerrero(Personaje):
    def __init__(self, nombre, vida_maxima):
        super().__init__(nombre, vida_maxima)
        self._arma = None

    def equipar(self, arma):
        self._arma = arma

    def atacar(self):
        if self._arma is None:
            return 1
        return self._arma.dano
