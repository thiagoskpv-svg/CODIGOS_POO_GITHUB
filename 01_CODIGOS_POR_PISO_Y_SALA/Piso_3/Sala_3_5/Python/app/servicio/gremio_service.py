from app.modelo.personaje import Personaje
class GremioService:
    def __init__(self, repositorio):
        self._repositorio = repositorio

    def reclutar(self, nombre):
        nuevo = Personaje(nombre, 100)
        self._repositorio.guardar(nuevo)
        return nuevo
