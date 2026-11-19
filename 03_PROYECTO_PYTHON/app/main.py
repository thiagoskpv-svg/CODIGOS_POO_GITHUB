from app.modelo.personaje_factory import PersonajeFactory
from app.modelo.personaje import Personaje
from app.modelo.mision_builder import MisionBuilder
from app.servicio.combate_service import CombateService
from app.config import Configuracion

def main():
    aria = PersonajeFactory.crear("mago", "Aria")
    borin = PersonajeFactory.crear("guerrero", "Borin")
    rival = Personaje("Rival", 100)
    CombateService().turno([aria, borin], rival)
    print("Vida rival:", rival.vida)
    print("Singleton:", Configuracion().vida_inicial)
    print("Builder:", MisionBuilder().titulo("Rescate").recompensa(500).construir().titulo)

if __name__ == "__main__":
    main()
