class CombateService:
    def turno(self, equipo, enemigo):
        for p in equipo:
            dano = p.atacar()
            enemigo.recibir_dano(dano)
            print(f"{p.nombre} causa {dano}")

    def usar_habilidad(self, origen, habilidad, objetivo):
        efecto = habilidad.calcular_efecto(objetivo)
        objetivo.recibir_dano(efecto)
        print(f"{origen.nombre} usa {habilidad.nombre}")
        return efecto
