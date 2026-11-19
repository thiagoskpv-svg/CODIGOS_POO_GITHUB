import pytest
from app.modelo.personaje import Personaje

def test_recibir_dano_no_baja_de_cero():
    p = Personaje("Aria", 50)
    p.recibir_dano(80)
    assert p.vida == 0

def test_dano_negativo_se_rechaza():
    p = Personaje("Aria", 50)
    with pytest.raises(ValueError):
        p.recibir_dano(-1)
