def vivos(equipo):
    resultado = []
    for p in equipo:
        if p.vida > 0:
            resultado.append(p)
    return resultado
