from app.modelo.efecto import Efecto

class Veneno(Efecto):
    def __init__(self, dano):
        self._dano = dano

    def aplicar(self, objetivo):
        objetivo.recibir_dano(self._dano)
