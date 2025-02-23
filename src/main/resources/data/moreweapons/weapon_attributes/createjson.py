import json
import os

# Nomi degli oggetti
items = [
    "diamond_chakram", "diamond_claymore", "diamond_cutlass", "diamond_glavie",
    "diamond_greataxe", "diamond_halberd", "diamond_katana", "diamond_rapier",
    "diamond_rapier", "diamond_sai", "diamond_scythe", "diamond_spear",
    "diamond_twinblade", "diamond_warglaive"
]

# Funzione per creare i file JSON
def create_json_files():
    # Crea un file JSON per ciascun nome
    for item in items:
        json_data = {
            "parent": "bettercombat:"
        }

        # Scrive il file JSON
        file_path = f"{item}.json"
        with open(file_path, 'w') as json_file:
            json.dump(json_data, json_file, indent=4)

        print(f"File creato: {file_path}")

# Chiamata alla funzione per creare i file
create_json_files()
