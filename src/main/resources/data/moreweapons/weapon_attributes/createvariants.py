import shutil
import os

# Lista dei prefissi
materials = ["stone", "gold", "iron", "netherite"]

# Funzione per creare le varianti dei file
def create_variant_files():
    # Otteniamo tutti i file JSON nella cartella corrente
    files = [f for f in os.listdir() if f.endswith(".json")]

    for file in files:
        # Estrai il nome del file senza l'estensione .json
        base_name, _ = os.path.splitext(file)

        # Verifica che il nome del file contenga "diamond" prima di procedere
        if "diamond" in base_name:
            for material in materials:
                # Crea il nuovo nome del file sostituendo "diamond" con il materiale corrente
                new_file_name = base_name.replace("diamond", material) + ".json"

                # Copia il file con il nuovo nome
                shutil.copy(file, new_file_name)

                print(f"File copiato: {new_file_name}")

# Chiamata alla funzione per creare le varianti
create_variant_files()
