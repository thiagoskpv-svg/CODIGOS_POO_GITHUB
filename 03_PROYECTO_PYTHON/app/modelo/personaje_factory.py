from app.modelo.guerrero import Guerrero
from app.modelo.mago import Mago

class PersonajeFactory:
    @staticmethod
    def crear(tipo, nombre):
        if tipo == "guerrero":
            return Guerrero(nombre, 120)
        if tipo == "mago":
            return Mago(nombre, 80, 50)
        raise ValueError(f"Tipo desconocido: {tipo}")
