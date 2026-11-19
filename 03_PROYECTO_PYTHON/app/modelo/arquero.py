from app.modelo.personaje import Personaje

class Arquero(Personaje):
    def __init__(self, nombre, vida_maxima, flechas):
        super().__init__(nombre, vida_maxima)
        self._flechas = flechas

    def atacar(self):
        if self._flechas == 0:
            return 1
        self._flechas -= 1
        return 9
