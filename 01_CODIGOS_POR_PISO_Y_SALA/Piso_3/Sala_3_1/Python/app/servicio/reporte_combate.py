class ReporteCombate:
    def resumir(self, p):
        return f"{p.nombre}: {p.vida} PV"

    def imprimir(self, p):
        print(self.resumir(p))
