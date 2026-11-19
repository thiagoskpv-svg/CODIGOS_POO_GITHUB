class CombateService:
    def usar_habilidad(self, origen, habilidad, objetivo):
        efecto = habilidad.calcular_efecto(objetivo)
        objetivo.recibir_dano(efecto)
        print(f"{origen.nombre} usa {habilidad.nombre}")
        return efecto
