class EventoCombate:
    def __init__(self):
        self._observadores = []

    def suscribir(self, observador):
        self._observadores.append(observador)

    def notificar(self, mensaje):
        for observador in self._observadores:
            observador.actualizar(mensaje)
