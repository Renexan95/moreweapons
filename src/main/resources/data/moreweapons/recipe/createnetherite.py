import json
import os

# Lista delle armi in netherite
netherite_weapons = [
    "diamond_chakram", "diamond_claymore", "diamond_cutlass", "diamond_glavie",
    "diamond_greataxe", "diamond_halberd", "diamond_katana", "diamond_rapier",
    "diamond_sai", "diamond_scythe", "diamond_spear",
    "diamond_twinblade", "diamond_warglaive"
]

# Funzione per creare i file JSON per le armi in netherite
def create_netherite_files():
    for weapon in netherite_weapons:
        diamond_item = f"moreweapons:{weapon}"
        netherite_item = diamond_item.replace("diamond", "netherite")

        netherite_recipe = {
            "type": "minecraft:smithing_transform",
            "category": "equipment",
            "base": {"item": diamond_item},
            "addition": {"item": "minecraft:netherite_ingot"},
            "template": {"item": "minecraft:netherite_upgrade_smithing_template"},
            "result": {"id": netherite_item}
        }

        file_name = f"{weapon.replace('diamond', 'netherite')}.json"
        with open(file_name, "w") as f:
            json.dump(netherite_recipe, f, indent=4)

        print(f"File creato: {file_name}")

# Chiamata alla funzione
create_netherite_files()
