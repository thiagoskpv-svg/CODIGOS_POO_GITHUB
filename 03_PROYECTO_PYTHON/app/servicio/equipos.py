def vivos(equipo):
    resultado = []
    for personaje in equipo:
        if personaje.vida > 0:
            resultado.append(personaje)
    return resultado
