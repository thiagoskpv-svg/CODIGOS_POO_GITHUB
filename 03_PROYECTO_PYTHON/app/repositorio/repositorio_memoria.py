class RepositorioMemoria:
    def __init__(self):
        self._personajes = []

    def guardar(self, personaje):
        self._personajes.append(personaje)
