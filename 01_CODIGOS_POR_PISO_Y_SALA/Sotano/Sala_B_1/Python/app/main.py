from app.modelo.item import Item

def main():
    espada = Item("Espada", 3.5)
    pocion = Item("Poción", 0.5)
    print(espada.describir())
    print(pocion.describir())

if __name__ == "__main__":
    main()
