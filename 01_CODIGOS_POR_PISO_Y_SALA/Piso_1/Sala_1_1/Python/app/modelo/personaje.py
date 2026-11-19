class Personaje:
    def __init__(self, nombre, vida_maxima):
        self._nombre = nombre
        self._vida_maxima = vida_maxima
        self._vida = vida_maxima
        self._estado = "vivo"

    @property
    def nombre(self):
        return self._nombre

    @property
    def vida(self):
        return self._vida

    def atacar(self):
        return 5

    def recibir_dano(self, dano):
        if dano < 0:
            raise ValueError("El daño no puede ser negativo")
        self._vida = max(0, self._vida - dano)
        if self._vida == 0:
            self._estado = "derrotado"
