class CombateService:
    def turno(self, equipo, enemigo):
        for p in equipo:
            dano = p.atacar()
            enemigo.recibir_dano(dano)
            print(f"{p.nombre} causa {dano}")
